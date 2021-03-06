package com.mybatis.dao;

import com.mybatis.model.Role;
import com.mybatis.myEnum.Sex;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {

    List<Role> getRole(@Param("roleName") String roleName);

    Role findRole(Long id);

    void insertRole(Role role);

    void deleteRole(Long id);

    List<Role> findBySex(Sex sex);

}
