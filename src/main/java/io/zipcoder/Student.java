package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String fN, String lN, ArrayList<Double> eS) {
        this.firstName = fN;
        this.lastName = lN;
        this.examScores = eS;
    }

    public int getNumberOfExamsTaken(){
        return this.examScores.size();
    }

    public String getExamScores(ArrayList<Double> scores){
        String results = "Exam Scores:";
        for(int i = 0; i < scores.size(); i++){
            results += String.format("\nExam %d -> %.0f", i + 1 , scores.get(i));
        }
        return results;
    }

    public void addExamScores(Double score){
        this.examScores.add(score);
    }

    public void setExamScores(int index, Double score){
        examScores.set(index,score);
    }

    public int getAverageExamScore(ArrayList<Double> scores){
        Double sum = 0.0;
        for(Double s : scores){
            sum += s;
        }
        return (int) (sum / scores.size());
    }

    public String toString(){
        String fullInfo = "" + this.getAverageExamScore(this.examScores);
//        String fullInfo = String.format("Student name: %s %s\n" +
//                                        "> Average Score: %d\n" +
//                                        "> %s",
//                                        this.firstName,
//                                        this.lastName,
//                                        this.getAverageExamScore(this.examScores),
//                                        this.getExamScores(this.examScores)) ;
        return fullInfo;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
