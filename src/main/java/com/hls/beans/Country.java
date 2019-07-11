package com.hls.beans;

import java.util.Set;

public class Country {
    private Integer cid;
    private String cname;

    //关联属性
    private Set<Minister> ministers;   //无序性，不能重复

    public void Getinfo(){
        System.out.println(this.cid+"\t\t\t\t\t\t\t");
        System.out.println(this.cname+"\n");

    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(Set<Minister> ministers) {
        this.ministers = ministers;
    }
}
