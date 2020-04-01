/**
 * FileName: MyBatisTest3
 * Author:   郭经伟
 * Date:     2020/4/1 12:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.test;

import com.mybatis.Utils.SqlSessionFactoryUtil;
import com.mybatis.dao.StudentMapper;
import com.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;

public class MyBatisTest3 {
    public static void main(String[] args) {
        SqlSession session=null;
        try {
            session= SqlSessionFactoryUtil.getSqlSession();
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            Student student = studentMapper.getStudent(1);
            System.out.println(student);

        }finally {

            if (session!=null){
                session.close();
            }
        }
    }
}
