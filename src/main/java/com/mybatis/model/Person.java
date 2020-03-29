/**
 * FileName: Person
 * Author:   郭经伟
 * Date:     2020/3/27 23:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import org.apache.ibatis.type.Alias;

@Alias("person")
public class Person {

    private Integer id;
    private Integer age;
    private String name;
}
