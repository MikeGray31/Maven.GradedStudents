package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        String firstName = "Mike";
        String lastName = "Gray";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100., 98., 87., 90.));
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getExamScores(student.examScores);
        String expected = "Exam Scores:" +
                "\nExam 1 -> 100" +
                "\nExam 2 -> 98" +
                "\nExam 3 -> 87" +
                "\nExam 4 -> 90";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeExamTest() {
        String firstName = "Mike";
        String lastName = "Gray";
        ArrayList<Double> examScores = new ArrayList<Double>();
        Student student = new Student(firstName, lastName, examScores);
        Double score = 97.;
        student.addExamScores(score);
        String actual = student.getExamScores(student.examScores);
        String expected = "Exam Scores:" +
                "\nExam 1 -> 97";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest() {
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(97.));
        Student student = new Student("Mike", "Gray", examScores);
        Double score = 100.;
        student.setExamScores(0, score);
        String actual = student.getExamScores(student.examScores);
        String expected = "Exam Scores:" +
                "\nExam 1 -> 100";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoresTest(){
        String firstName = "Mike";
        String lastName = "Gray";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100., 97., 93., 90.));
        Student student = new Student(firstName,lastName,examScores);
        int actual = student.getAverageExamScore(student.examScores);
        int expected = 95;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String firstName = "Mike";
        String lastName = "Gray";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100., 97., 93., 90.));
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.toString();
        String expected =   "Student name: Mike Gray\n" +
                            "> Average Score: 95\n"+
                            "> Exam Scores:" +
                                "\nExam 1 -> 100" +
                                "\nExam 2 -> 97" +
                                "\nExam 3 -> 93" +
                                "\nExam 4 -> 90";
        Assert.assertEquals(expected, actual);
    }
}