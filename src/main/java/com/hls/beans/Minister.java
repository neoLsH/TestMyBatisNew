package com.hls.beans;

public class Minister {
    private Integer mid;
    private String mname;

    //关联属性

    private Country1 country1;

    public void Getinfo(){
        System.out.println(this.mid+"\t\t\t\t\t\t\t");
        System.out.println(this.mname+"\n");

    }

    public Minister(){}
    public Minister(Integer mid, String mname) {
        this.mid = mid;
        this.mname = mname;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Country1 getCountry1() {
        return country1;
    }

    public void setCountry1(Country1 country1) {
        this.country1 = country1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
