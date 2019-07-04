package com.MyBatis.service;
import com.hls.beans.TestMyBatis;
//import com.hls.dao.DaoImpl;
import com.hls.dao.Idao;
import com.hls.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServiceTest {
    private Idao idao;
    private SqlSession sqlSession;

    @Before
    public void before(){
        //获取配置接口
        sqlSession = MyBatisUtils.getSqlSession();
        idao = sqlSession.getMapper(Idao.class);
    }


    @After
    public void after(){
        if (sqlSession!=null){
            try {
                sqlSession.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    /*插入1.0*/
    @Test
    public void testInsert01(){
        String Time = new Date().toString();
        TestMyBatis ts = new TestMyBatis("黄乐枢kk1"+Time,"huangleshu2","男",Time);
        idao.InsertMember(ts);
        sqlSession.commit();

    }
    /*插入2.0  返回id*/
    @Test
    public void testInsert02(){
        String Time = new Date().toString();
        TestMyBatis ts = new TestMyBatis("黄乐枢kk1"+Time,"huangleshu2","男",Time);
        System.out.println(ts.getId());
        idao.InsertMemberCache(ts);
        System.out.println(ts.getId());
        sqlSession.commit();
    }

    /*通过id删除*/
    @Test
    public void tese03(){
        idao.DeleteMemberByid(14);
        sqlSession.commit();
    }

    //更新
    @Test
    public void test04() {
        TestMyBatis ts = new TestMyBatis("黄乐枢11","123456","男","2019-06-13");
        ts.setId(35);
        idao.UpdateMember(ts);
        sqlSession.commit();
    }

    //
    @Test
    public void Test05(){
        List<TestMyBatis> ts = idao.selectAllMember();
        for (TestMyBatis temp:ts){
            temp.GetALL();
        }
    }

    @Test
    public void Test06(){
        TestMyBatis testMyBatis = idao.selectMemberByid(35);
        testMyBatis.GetALL();
    }

    /*
    绑定异常  selectAllMemberMap这个方法   在mapper.xml文件里面找不到这个id，无法形成映射关系

    那时候调用的是selectAllMember这个方法

    @Test
    public void Test07(){
        Map<String,Object> map = idao.selectAllMemberMap();
        ((TestMyBatis)map.get("黄乐枢")).GetALL();
    }*/

    @Test
    public void test08(){
        List<TestMyBatis> list = idao.selectMemberBySec("23");
        for (TestMyBatis temp : list) {
            temp.GetALL();
        }
    }

    @Test
    public void test09(){
        List<TestMyBatis> list = idao.selectMemberBySex("男");
        for (TestMyBatis temp:list){
            temp.GetALL();
        }
    }

    @Test
    public void test10(){
        List<TestMyBatis> list = idao.selectMemberByDate("21");
        for (TestMyBatis temp :
                list) {
            temp.GetALL();
        }
    }

    @Test
    public void test11(){
        List<TestMyBatis> list = idao.selectMemberByNameAndSec("1","123");
        for (TestMyBatis temp : list){
            temp.GetALL();
        }
    }

    @Test
    /*三个查询线索*/
    public void test12(){
        Map<String,Object> map = new HashMap();
        map.put("name1","黄");
        map.put("sec1","huang");
        TestMyBatis testMyBatis = new TestMyBatis("黄","huangleshu","女","Jun");
        map.put("testMyBatis",testMyBatis);
        List<TestMyBatis> list = idao.selectMemberByNameAndSecMap(map);
        for (TestMyBatis temp : list){
            temp.GetALL();
        }
    }

    @Test
    public void test013(){
        Map<String,Object> map = new HashMap<>();
        map.put("name2","黄乐");
        TestMyBatis testMyBatis = new TestMyBatis("黄","huang","男","12");
        map.put("testMyBatis",testMyBatis);
        List<TestMyBatis> list = idao.selectMemberByNameAndSex(map);
        for (TestMyBatis temp :
                list) {
            temp.GetALL();
        }
    }

    @Test
    public void test014(){
        Map<String,Object> map = new HashMap<>();
        map.put("name3","黄");
        TestMyBatis testMyBatis = new TestMyBatis("黄乐枢","huangl","男","kk");
        map.put("testMyBatis",testMyBatis);
        List<TestMyBatis> list = idao.selectMemberByNameAndTimeDate(map);
        for (TestMyBatis temp:list){
            temp.GetALL();
        }
    }

    @Test
    public void test015(){
        Map<String,Object> map = new HashMap<>();
        map.put("name4","黄");
        TestMyBatis testMyBatis = new TestMyBatis("黄乐枢","huang","男","12");

    }
}

