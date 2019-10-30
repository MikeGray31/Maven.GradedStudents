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
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100., 100.));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(225., 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[] {s1,s2};
        Classroom classroom = new Classroom(students);

        Student[] expected = {s2, s1};
        Student[] actual = classroom.getStudentsByScore();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void getGradeBookTest() {
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100.));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(90.));
        ArrayList<Double> s3Scores = new ArrayList<Double>(Arrays.asList(80.));
        ArrayList<Double> s4Scores = new ArrayList<Double>(Arrays.asList(70.));
        ArrayList<Double> s5Scores = new ArrayList<Double>(Arrays.asList(60.));
        ArrayList<Double> s6Scores = new ArrayList<Double>(Arrays.asList(50.));
        ArrayList<Double> s7Scores = new ArrayList<Double>(Arrays.asList(40.));
        ArrayList<Double> s8Scores = new ArrayList<Double>(Arrays.asList(30.));
        ArrayList<Double> s9Scores = new ArrayList<Double>(Arrays.asList(20.));
        ArrayList<Double> s10Scores = new ArrayList<Double>(Arrays.asList(95.));
        ArrayList<Double> s11Scores = new ArrayList<Double>(Arrays.asList(85.));
        ArrayList<Double> s12Scores = new ArrayList<Double>(Arrays.asList(65.));
        ArrayList<Double> s13Scores = new ArrayList<Double>(Arrays.asList(45.));
        ArrayList<Double> s14Scores = new ArrayList<Double>(Arrays.asList(25.));
        ArrayList<Double> s15Scores = new ArrayList<Double>(Arrays.asList(5.));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);
        Student s4 = new Student("student", "four", s4Scores);
        Student s5 = new Student("student", "five", s5Scores);
        Student s6 = new Student("student", "six", s6Scores);
        Student s7 = new Student("student", "seven", s7Scores);
        Student s8 = new Student("student", "eight", s8Scores);
        Student s9 = new Student("student", "nine", s9Scores);
        Student s10 = new Student("student", "ten", s10Scores);
        Student s11 = new Student("student", "eleven", s11Scores);
        Student s12 = new Student("student", "twelve", s12Scores);
        Student s13 = new Student("student", "thirteen", s13Scores);
        Student s14 = new Student("student", "fourteen", s14Scores);
        Student s15 = new Student("student", "fifteen", s15Scores);



        Student[] students = new Student[] {s1,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15};
        Classroom classroom = new Classroom(students);

        System.out.println(classroom.getGradeBook());
    }
}
