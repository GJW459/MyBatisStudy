/**
 * FileName: MyBatisTest6
 * Author:   郭经伟
 * Date:     2020/4/1 17:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.test;

import com.mybatis.Utils.SqlSessionFactoryUtil;
import com.mybatis.dao.StudentMapper;
import com.mybatis.model.Student;
import com.mybatis.model.StudentLecture;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest6 {

    //默认一级缓存，只支持当个SqlSession,多个SqlSession之间是隔离关系
    //显现二级缓存，实体类需要实现序列化接口，mapper文件里面得开启cache配置
    //记得sqlsession提交
    @Test
    public void test1(){
        SqlSession session1=null;
        SqlSession session2=null;
        try {
            session1= SqlSessionFactoryUtil.getSqlSession();
            session2=SqlSessionFactoryUtil.getSqlSession();
            StudentMapper mapper = session1.getMapper(StudentMapper.class);
            Student student = mapper.getStudent(1);
            List<StudentLecture> studentLectures = student.getStudentLectures();
            session1.commit();
            StudentMapper mapper1 = session2.getMapper(StudentMapper.class);
            Student student1 = mapper1.getStudent(1);
            List<StudentLecture> studentLectures1 = student1.getStudentLectures();
            session2.commit();
            for (StudentLecture studentLecture : studentLectures) {
                System.out.println(studentLecture);
            }
            for (StudentLecture studentLecture : studentLectures1) {
                System.out.println(studentLecture);
            }
        }finally {
            if (session1!=null){
                session1.close();
            }
            if (session2!=null){
                session2.close();
            }
        }
    }
}
