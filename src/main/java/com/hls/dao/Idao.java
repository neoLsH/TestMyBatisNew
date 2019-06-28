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
    Map<String,Object> selectAllMemberMap();

    TestMyBatis selectMemberByid(int id);
    List<TestMyBatis> selectMemberBySec(String sec);

}
