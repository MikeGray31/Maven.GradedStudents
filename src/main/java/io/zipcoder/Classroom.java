package io.zipcoder;

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
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i].getFirstName() == firstName && this.students[i].getLastName() == lastName){
                this.students[i] = null;
            }
        }
    }

    public Student[] getStudentsByScore(){
        Student[] ordered = this.students;
        for(int i = 1; i < ordered.length;i++){
            for(int j = 0;j < ordered.length - i ; j++){
                if(ordered[i].getAverageExamScore(ordered[i].examScores) <
                        ordered[i+1].getAverageExamScore(ordered[i+1].examScores)){
                    Student store = ordered[i];
                    ordered[i] = ordered[i+1];
                    ordered[i+1] = store;
                }
            }
        }
        return ordered;
    }

    //getters and setters
    public Student[] getStudents() {
        return students;
    }
}
