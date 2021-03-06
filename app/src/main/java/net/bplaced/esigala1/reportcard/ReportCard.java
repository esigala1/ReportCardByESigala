package net.bplaced.esigala1.reportcard;

import java.util.Arrays;

/**
 * {@link ReportCard} represents a student's report card.
 *
 * Created by Effie Sigala on 17/5/2017.
 */

public class ReportCard {

    private String mID;
    private String mLastName;
    private String mFirstName;
    private String[] mCourseName;
    private int[] mCourseGrade;

    /**
     * Create a new ReportCard object.
     *
     * @param id is the ID of the student.
     * @param lastName is the Last Name of the student.
     * @param firstName is the First Name of the student.
     * @param courseName is an array with the names of the courses.
     * @param courseGrade is an array with the grades for the above courses.
     */
    public ReportCard(String id, String lastName, String firstName, String[] courseName, int[] courseGrade){
        this.mID = id;
        this.mLastName = lastName;
        this.mFirstName = firstName;
        this.mCourseName = new String[courseName.length];
        System.arraycopy(courseName, 0, mCourseName, 0, courseName.length);
        this.mCourseGrade = new int[courseGrade.length];
        System.arraycopy(courseGrade, 0, mCourseGrade, 0, courseGrade.length);
    }

    /**
     * Get the ID of the student.
     */
    public String getID() {
        return mID;
    }

    /**
     * Get the Last Name of the student.
     */
    public String getLastName() {
        return mLastName;
    }

    /**
     * Get the First Name of the student.
     */
    public String getFirstName() {
        return mFirstName;
    }

    /**
     * Get the names of the courses.
     */
    public String[] getCourseNames() {
        return mCourseName;
    }

    /**
     * Get the grades for the above courses (10 Point Grading Scale).
     */
    public int[] getCourseGrades() {
        return mCourseGrade;
    }

    /**
     * Set the grade for a specific course (10 Point Grading Scale).
     *
     * @param index is the index of the course.
     * @param grade is the grade of the course.
     */
    public void setCourseGrade(int index, int grade) {
        mCourseGrade[index] = grade;
    }

    /**
     * Returns the string representation of the {@link ReportCard} object.
     */
    @Override
    public String toString() {
        return "ReportCard{" +
                "mID='" + mID + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mFirstName='" + mFirstName + '\'' +
                ", mCourseName=" + Arrays.toString(mCourseName) +
                ", mCourseGrade=" + Arrays.toString(mCourseGrade) +
                '}';
    }
}
