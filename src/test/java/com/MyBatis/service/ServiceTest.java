package com.MyBatis.service;
import com.hls.beans.Country;
//import com.hls.dao.DaoImpl;
import com.hls.dao.ICountryDao;
import com.hls.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class ServiceTest {
    private ICountryDao idao;
    private SqlSession sqlSession;

    @Before
    public void before(){
        //获取配置接口
        sqlSession = MyBatisUtils.getSqlSession();
        idao = sqlSession.getMapper(ICountryDao.class);
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
        Country country = idao.selectCountryById(1);
        country.Getinfo();
    }
}

