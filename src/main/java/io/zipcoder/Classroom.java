package io.zipcoder;

import java.util.HashMap;
import java.util.Map;


public class Classroom {

    Student[] students;

    //constructors
    public Classroom(int maxStudents){
        students = new Student[maxStudents];
    }

    public Classroom(Student[] studs){
        students =studs;
    }

    public Classroom(){
        students = new Student[30];
    }

    public Double getAverageExamScore(Student[] allStudents){
        Double sum = 0.0;
        for(Student s: allStudents){
            sum += s.getAverageExamScore(s.examScores);
        }
        return sum / allStudents.length;
    }

    public void addStudent(Student addThisGuy){
        boolean added = false;
        for(int i = 0; added != true; i++){
            if(this.students[i] == null){
                this.students[i] = addThisGuy;
                added = true;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        boolean removed = false;
        for(int i = 0; i < this.students.length - 1; i++){
            if(this.students[i].getFirstName() == firstName && this.students[i].getLastName() == lastName){
                removed = true;
            }
            if(removed){
                this.students[i] = this.students[i + 1];
            }
        }
        this.students[this.students.length - 1] = null;

    }

    public Student[] getStudentsByScore(){
        Student[] ordered = this.students;
        for(int i = 1; i < ordered.length; i++){
            for(int j = 0;j < ordered.length - i; j++){
                if(ordered[j].getAverageExamScore(ordered[j].examScores) <
                        ordered[j+1].getAverageExamScore(ordered[j+1].examScores)){
                    Student store = ordered[j];
                    ordered[j] = ordered[j+1];
                    ordered[j+1] = store;
                }
            }
        }
        return ordered;
    }

    public Map<Student, Character> getGradeBook(){
        Map<Student, Character> map = new HashMap<>();
        Student[] ordered = this.getStudentsByScore();
        int k10 = (int) Math.round(ordered.length * 0.10);
        int percentile10 = ordered[k10].getAverageExamScore(ordered[k10].examScores);
        int k30 = (int) Math.round(ordered.length * 0.30);
        int percentile30 = ordered[k30].getAverageExamScore(ordered[k30].examScores);
        int k50 = (int) Math.round(ordered.length * 0.50);
        int percentile50 = ordered[k50].getAverageExamScore(ordered[k50].examScores);
        int k90 = (int) Math.round(ordered.length * 0.89);
        int percentile90 = ordered[k90].getAverageExamScore(ordered[k90].examScores);

        for(Student s: ordered){
            int finalScore = s.getAverageExamScore(s.examScores);
            if(finalScore > percentile10){
                map.put(s, 'A');
            }
            else if(finalScore <= percentile10 && finalScore > percentile30){
                map.put(s, 'B');
            }
            else if(finalScore <=  percentile30 && finalScore >= percentile50){
                map.put(s, 'C');
            }
            else if(finalScore <  percentile50 && finalScore > percentile90){
                map.put(s, 'D');
            }
            else if(finalScore <= percentile90){
                map.put(s, 'F');
            }
            else{
                map.put(s, 'Z');
            }
        }
        return map;
    }

    //getters and setters
    public Student[] getStudents() {
        return students;
    }
}
