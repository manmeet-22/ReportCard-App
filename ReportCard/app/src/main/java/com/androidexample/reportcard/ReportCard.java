package com.androidexample.reportcard;

/**
 * Created by MANI on 11/6/2016.
 */
public class ReportCard {
    private String subName;
    private int subIcon;
    private String grade;

    public String getSubName() {
        return this.subName;
    }

    public String getGrade() {
        return this.grade;
    }

    public int getSubIcon() {
        return this.subIcon;
    }

 public ReportCard(int icon, String subjectName, String grade1) {
        super();
        this.subIcon = icon;
        this.subName = subjectName;
        this.grade = grade1;
    }

    public void setName(String subName) {
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "Your Child got \n" + grade+ " Grade in "+ subName ;
    }
}