/**
 * FileName: SexEnumTypeHandler
 * Author:   郭经伟
 * Date:     2020/3/29 22:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.type;

import com.mybatis.myEnum.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Sex.class)
public class SexEnumTypeHandler implements TypeHandler<Sex> {

    private Logger log= LoggerFactory.getLogger(SexEnumTypeHandler.class);
    public void setParameter(PreparedStatement ps, int i, Sex parameter, JdbcType jdbcType) throws SQLException {
        log.debug("设置参数");
        String name = parameter.getName();
        ps.setString(i,name);
    }

    public Sex getResult(ResultSet rs, String columnName) throws SQLException {
        log.debug("获取参数");
        String name = rs.getString(columnName);
        return Sex.getSex(name);
    }

    public Sex getResult(ResultSet rs, int columnIndex) throws SQLException {
        log.debug("获取参数");
        String name = rs.getString(columnIndex);
        return Sex.getSex(name);
    }

    public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException {
        log.debug("获取参数");
        String name = cs.getString(columnIndex);
        return Sex.getSex(name);
    }
}
