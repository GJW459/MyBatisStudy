/**
 * FileName: StudentHealthFemale
 * Author:   郭经伟
 * Date:     2020/4/1 15:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import java.io.Serializable;

/**
 * 女学生的健康档案
 * create table t_student_health_female(
 * id int(20) not null auto_increment comment '编号',
 * student_id varchar(60) not null  comment '学生编号',
 * check_date varchar(60) not null  comment '检查日期',
 * heart varchar(60) not null  comment '心脏',
 * uterus varchar(60) not null  comment '子宫',
 * note varchar(1024)  comment '备注',
 * primary key(id)
 *
 * );
 */
public class StudentHealthFemale implements Serializable {

    private Integer id;
    private Integer studentId;
    private String checkDate;
    private String heart;
    private String uterus;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentHealthFemale{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", checkDate='" + checkDate + '\'' +
                ", heart='" + heart + '\'' +
                ", uterus='" + uterus + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
