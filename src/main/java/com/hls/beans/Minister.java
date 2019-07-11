package com.hls.beans;

public class Minister {
    private Integer mid;
    private String mname;
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
}
