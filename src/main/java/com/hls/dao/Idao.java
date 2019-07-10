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

    List<TestMyBatis> selectMemberByNameAndSec(String name,String sec);
    List<TestMyBatis> selectMemberByNameAndSecMap(Map map);
    List<TestMyBatis> selectMemberByNameAndSex(Map map);
    List<TestMyBatis> selectMemberByNameAndTimeDate(Map map);
    List<TestMyBatis> selectMemberByNameSecSexAndTimeDate(Map map); //String name,String sec,String sex,String TimeDate

    List<TestMyBatis> selectMemberByNameAndSecIf(TestMyBatis testMyBatis);
    List<TestMyBatis> selectMemberByNameAndSexWhere(TestMyBatis testMyBatis);
    List<TestMyBatis> selectMemberByNameAndSecChoose(TestMyBatis testMyBatis);

    List<TestMyBatis> selectMemberByNameAndSexForeach(int[] id);
    List<TestMyBatis> selectMemberByNameAndSexForeach2(List<Integer> list);
    List<TestMyBatis> selectMemberByNameAndSexForeach3(List list);

}
