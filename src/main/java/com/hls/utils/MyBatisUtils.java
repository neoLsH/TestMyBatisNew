package com.hls.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    /*
    * //1、加载主配置文件
            InputStream inputStream = Resources.getResourceAsStream("myBatis.xml");
            //2、创建SqlSessionFactory对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
            //3、创建SQLSession对象
            sqlSession = build.openSession();
    *
    *
    * */
    public static SqlSession getSqlSession(){
        InputStream is;
        try {
            /*   加载配置文件   使用MyBatis三步骤
            InputStream inputStream = Resources.getResourceAsStream("myBatis.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = build.openSession();*/
            is = Resources.getResourceAsStream("myBatis.xml");
            if (sqlSessionFactory==null) {
                 sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            }
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
