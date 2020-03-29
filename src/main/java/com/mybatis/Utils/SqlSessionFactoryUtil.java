/**
 * FileName: SqlSessionFactoryUtil
 * Author:   郭经伟
 * Date:     2020/3/29 21:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 懒汉式的单例模式生成SqlSessionFactory，
 * 因为在MyBatis的生命周期中SqlSessionFactory是一直存在的，不希望多次创建SqlSessionFactory,
 * 因为会浪费很多的SqlSession
 */
public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory=null;
    private SqlSessionFactoryUtil(){

    }
    //创建类线程锁
    private static final Class CLASS_LOCK=SqlSessionFactoryUtil.class;

    public static SqlSessionFactory getSqlSessionFactory(){
        String path="mybatis-config.xml";
        InputStream inputStream = null;
        try {
              inputStream= Resources.getResourceAsStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //这样更高效
        if (sqlSessionFactory==null){
            synchronized (CLASS_LOCK){
                if (sqlSessionFactory==null){
                    sqlSessionFactory= new  SqlSessionFactoryBuilder().build(inputStream);
                }
            }
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSqlSession(){
        if (sqlSessionFactory==null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
