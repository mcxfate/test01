package com.example.dao.Impl;

import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAll() {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Student> list = sqlSession.selectList("test01.selectAll");
        sqlSession.close();
        return list;
    }
}
