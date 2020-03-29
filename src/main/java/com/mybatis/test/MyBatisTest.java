/**
 * FileName: MyBatisTest
 * Author:   郭经伟
 * Date:     2020/3/29 22:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.test;

import com.mybatis.Utils.SqlSessionFactoryUtil;
import com.mybatis.dao.RoleMapper;
import com.mybatis.model.Role;
import com.mybatis.myEnum.Sex;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role=new Role();
        role.setNote("嘻嘻");
        role.setRoleName("郭经伟");
        role.setSex(Sex.FEMALE);
        roleMapper.insertRole(role);
        System.out.println(role.getId());
        System.out.println(roleMapper.findRole(1L));
        List<Role> roleList = roleMapper.getRole("郭经伟");
        for (Role role1 : roleList) {
            System.out.println(role1);
        }
        List<Role> roles = roleMapper.findBySex(Sex.MALE);
        for (Role role1 : roles) {
            System.out.println(role1);
        }
        sqlSession.commit();
    }
}
