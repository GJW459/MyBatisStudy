/**
 * FileName: MyStringTypeHandler
 * Author:   郭经伟
 * Date:     2020/3/29 21:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.type;

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

/**
 * 自定义的typeHandler
 * 类型处理器主要是数据库和java实体类之间的数据类型的转换
 * @MappedTypes(String.class):定义的是JavaType类型，可以指定那些Java数据类型被拦截，这里就是String类型被拦截
 * @MappedJdbcTypes:定义的是Jdbc类型,拦截数据库中所对应的数据类型
 */
@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String> {

    private Logger logger= LoggerFactory.getLogger(MyStringTypeHandler.class);
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {

        //设置参数
        logger.debug("使用我的TypeHandler");
        ps.setString(i,parameter);
    }

    public String getResult(ResultSet rs, String columnName) throws SQLException {
        //获取结果集
        logger.debug("使用我的TypeHandler,ResultSet列名获取字符串");
        return   rs.getString(columnName);
    }

    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        //获取结果集
        logger.debug("使用我的TypeHandler,ResultSet下标获取字符串");
        return rs.getString(columnIndex);
    }

    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        //获取结果集
        logger.debug("使用我的TypeHandler,CallableStatement下标获取字符串");
        return cs.getString(columnIndex);
    }
}
