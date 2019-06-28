package com.hls.beans;


import java.lang.String;

public class TestMyBatis {
    private Integer id;
    private String sec;
    private String name;
    private String sex;
    private String TimeDate;


    public void GetALL(){
        System.out.print(this.id+"\t\t\t\t\t");
        System.out.print(this.name+"\t\t\t\t\t\t\t\t\t\t\t");
        System.out.print(this.sec+"\t\t\t\t\t");
        System.out.print(this.sex+"\t\t\t\t\t");
        System.out.println(this.TimeDate);
    }
    public TestMyBatis(){super();}
    //deletemember
    public TestMyBatis(String name){
        this.name = name;
    }
    public TestMyBatis(String name, String sec, String sex, String TimeDate) {
        this.sec = sec;
        this.name = name;
        this.sex = sex;
        this.TimeDate = TimeDate;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTimeDate() {
        return TimeDate;
    }

    public void setTimeDate(String timeDate) {
        TimeDate = timeDate;
    }
}