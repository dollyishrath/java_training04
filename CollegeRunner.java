package com.trimindtech.training.day04;

public class CollegeRunner {
    public static void main(String[] args) {
        College star = new College("Tmt","Oes",7,20.00);
        star.setGroupName("Tmt");
        star.setProjectTitle("Oes");
        star.setNoOfMembers(7);
        star.setFeePerMember(20.00);

        System.out.println(star.getGroupName());
        System.out.println(star.getProjectTitle());
        System.out.println(star.getNoOfMembers());
        System.out.println(star.getFeePerMember());

    }
}
