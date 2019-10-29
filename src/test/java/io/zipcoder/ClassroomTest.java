package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getAverageExamScoresTest(){
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100., 150.));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(225., 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[] {s1,s2};
        Classroom classroom = new Classroom(students);

        double expected = 125.0;
        double actual = classroom.getAverageExamScore(students);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void addStudentTest(){
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100., 150.));
        Student newGuy = new Student("Mike","Gray",s1Scores);
        Classroom classroom = new Classroom(1);
        classroom.addStudent(newGuy);
        Student expected = newGuy;
        Student actual = classroom.getStudents()[0];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest() {
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100., 150.));
        Student newGuy = new Student("Mike", "Gray", s1Scores);
        Student[] students = {newGuy};
        Classroom classroom = new Classroom(students);
        classroom.removeStudent("Mike","Gray");
        Student[] expected = {null};
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void getStudentsByScore() {
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100., 150.));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(225., 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[] {s1,s2};
        Classroom classroom = new Classroom(students);

//        expected
//        Assert.assertArrayEquals(expected,actual);
    }
}
