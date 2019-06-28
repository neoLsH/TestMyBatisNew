package com.hls.dao;

import com.hls.beans.TestMyBatis;

import java.util.List;
import java.util.Map;

public interface Idao {
    void InsertMember(TestMyBatis testMyBatis);
    void InsertMemberCache(TestMyBatis testMyBatis);

    void DeleteMemberByid(int id);
    void UpdateMember(TestMyBatis testMyBatis);

    List<TestMyBatis> selectAllMember();
    //这个方法在xml文件里面没有对应的id，无法构成映射，所以用不了
    Map<String,Object> selectAllMemberMap();

    TestMyBatis selectMemberByid(int id);
    List<TestMyBatis> selectMemberBySec(String sec);
    List<TestMyBatis> selectMemberBySex(String sex);
    List<TestMyBatis> selectMemberByDate(String TimeDate);

}
