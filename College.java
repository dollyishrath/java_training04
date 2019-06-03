package com.trimindtech.training.day04;

public class College {
    public College(){
        this.groupName = "Tmt";
        this.projectTitle = "Oes";
        this.noOfMembers = 7;
        this.feePerMember = 20.00;

    }
    public College(String groupName, String projectTitle, int noOfMembers, double feePerMember){
        this.groupName = groupName;
        this.projectTitle = projectTitle;
        this.noOfMembers = noOfMembers;
        this.feePerMember = feePerMember;

    }
    private String groupName;
    private String projectTitle;
    private int noOfMembers;
    private double feePerMember;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double getFeePerMember() {
        return feePerMember;
    }

    public void setFeePerMember(double feePerMember) {
        this.feePerMember = feePerMember;
    }

    @Override
    public String toString() {
        return "College{" +
                "groupName='" + groupName + '\'' +
                ", projectTitle='" + projectTitle + '\'' +
                ", noOfMembers=" + noOfMembers +
                ", feePerMember=" + feePerMember +
                '}';
    }
}
