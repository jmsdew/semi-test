package com.ohgiraffers.semistudy.dto;

public class RankDTO {
    private String name;
    private int grade;

    public RankDTO() {
    }

    public RankDTO(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "RankDTO{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
