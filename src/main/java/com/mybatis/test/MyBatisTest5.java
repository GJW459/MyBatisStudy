/**
 * FileName: MyBatisTest5
 * Author:   郭经伟
 * Date:     2020/4/1 17:03
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

/**
 * 性能问题 N+1问题：使用延迟加载级联
 */
public class MyBatisTest5 {

    //开启懒加载
    //在mybatis配置文件中配置
    @Test
    public void test1(){

        SqlSession session=null;
        try {
            session= SqlSessionFactoryUtil.getSqlSession();
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            Student student = mapper.getStudent(1);
            List<StudentLecture> studentLectures = student.getStudentLectures();
            for (StudentLecture studentLecture : studentLectures) {
                System.out.println(studentLecture);
            }
        }finally {
            if (session!=null){
                session.close();
            }
        }

    }
}
