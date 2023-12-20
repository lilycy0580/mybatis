package com.demo.mybatis;

import com.demo.mybatis.entity.User;
import com.demo.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {


    //1.加载核心配置文件的字节输入流
    InputStream stream = null;
    //2.创建SalSessionFactory的构建对象--框架使用的是构建者模式
    SqlSessionFactoryBuilder builder = null;
    //3.通过构建对象加载配置文件的输入流获取SqlSessionFactory
    SqlSessionFactory factory = null;
    //4.通过工厂对象获取SqlSession对象--执行jabc的
    SqlSession sqlSession = null;
    //5.通过SqlSession对象获取接口对应的代理对象
    UserMapper userMapper = null;


    @Before
    public void init() throws IOException {
        //1.加载核心配置文件的字节输入流
        stream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SalSessionFactory的构建对象--框架使用的是构建者模式
        builder = new SqlSessionFactoryBuilder();
        //3.通过构建对象加载配置文件的输入流获取SqlSessionFactory
        factory = builder.build(stream);
        //4.通过工厂对象获取SqlSession对象--执行jabc的
        sqlSession = factory.openSession();
        //5.通过SqlSession对象获取接口对应的代理对象
        userMapper = sqlSession.getMapper(UserMapper.class);
    }


    @After
    public void distroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        stream.close();
    }

    @Test

    public void testSelectAll() throws IOException {
        //6.通过代理对象执行查询方法
        List<User> userList = userMapper.selectAll();
        //7.遍历集合
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

}
