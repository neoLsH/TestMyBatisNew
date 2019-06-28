package com.hls.dao;

import com.hls.beans.TestMyBatis;
import com.hls.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DaoImpl implements Idao {

    private SqlSession sqlSession;

    @Override
    public void InsertMember(TestMyBatis testMyBatis) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            //4、相关操作
            sqlSession.insert("InsertMember",testMyBatis);
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    //输入之后捕获id
    @Override
    public void InsertMemberCache(TestMyBatis testMyBatis) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            //4、相关操作
            sqlSession.insert("InsertMemberCache",testMyBatis);
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public void DeleteMemberByid(int id) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            //4、相关操作
            sqlSession.delete("DeleteMemberByid",id);
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public void UpdateMember(TestMyBatis testMyBatis) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            //4、相关操作
            sqlSession.delete("UpdateMember",testMyBatis);
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public List<TestMyBatis> selectAllMember() {
        List<TestMyBatis> ts;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            //4、相关操作
            ts = sqlSession.selectList("selectAllMember");
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return ts;
    }

    @Override
    public Map<String, Object> selectAllMemberMap() {
        Map<String,Object> map;
        try{
            sqlSession = MyBatisUtils.getSqlSession();
            map = sqlSession.selectMap("selectAllMemberMap","name");
            sqlSession.commit();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return map;
    }

    @Override
    public TestMyBatis selectMemberByid(int id) {
        TestMyBatis testMyBatis;
        try{
            sqlSession = MyBatisUtils.getSqlSession();
            testMyBatis = sqlSession.selectOne("selectMemberByid",id);
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return testMyBatis;
    }

    @Override
    public List<TestMyBatis> selectMemberBySec(String sec) {
        List<TestMyBatis> list;
        try{
            sqlSession = MyBatisUtils.getSqlSession();
            list = sqlSession.selectList("selectMemberBySec",sec);
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return list;
    }

}