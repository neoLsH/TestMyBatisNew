package com.hls.beans;

public class Minister {
    private Integer mid;
    private String mname;
    public Minister(){}
    public Minister(Integer mid, String mname) {
        this.mid = mid;
        this.mname = mname;
    }

    public void Getinfo(){
        System.out.println(this.mid+"\t\t\t\t\t\t\t");
        System.out.println(this.mname+"\n");

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

    @Override
    public String toString() {
        return super.toString();
    }
}
