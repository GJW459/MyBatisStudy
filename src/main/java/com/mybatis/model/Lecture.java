/**
 * FileName: Lecture
 * Author:   郭经伟
 * Date:     2020/4/1 11:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import java.io.Serializable;

/**
 * 课程表
 * create table t_lecture(
 * id int(20) not null auto_increment COMMENT '编号',
 * lecture_name VARCHAR(60) not null COMMENT '课程名',
 * note varchar(1024) comment '备注',
 * primary key (id)
 * );
 *
 */
public class Lecture implements Serializable {

    private Integer id;
    private String lectureName;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", lectureName='" + lectureName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
