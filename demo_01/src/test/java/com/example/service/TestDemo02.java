package com.example.service;

import com.example.dao.Impl.StudentDaoImpl;
import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDemo02 {

    @Test
    public void testSelect(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        System.out.println(sqlSession);
        List<Student> list =  sqlSession.selectList("test01.selectAll");
        for(Student student : list){
            System.out.println(student);
        }
        sqlSession.close();

        SqlSession sqlSession1 = MyBatisUtil.getSqlSession();
        System.out.println(sqlSession1);
        sqlSession1.close();

        StudentDao studentDao = new StudentDaoImpl();
        list = studentDao.selectAll();
        System.out.println(12);



    }


}
