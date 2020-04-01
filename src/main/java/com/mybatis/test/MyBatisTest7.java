/**
 * FileName: MyBatisTest7
 * Author:   郭经伟
 * Date:     2020/4/1 18:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.test;

import com.mybatis.Utils.SqlSessionFactoryUtil;
import com.mybatis.dao.RoleMapper;
import com.mybatis.model.Role;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 动态sql
 */
public class MyBatisTest7 {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roles = mapper.getRole("郭经伟");
        for (Role role : roles) {
            System.out.println(role);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
