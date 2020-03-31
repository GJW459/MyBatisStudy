/**
 * FileName: Student
 * Author:   郭经伟
 * Date:     2020/3/31 22:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import com.mybatis.myEnum.Sex;

/**
 * create table t_student(
 * id int(20) not null auto_increment comment '编号',
 * cname varchar(60) not null comment '学生姓名',
 * sex varchar(60) not null comment '性别',
 * selfcard_no int(20) not null comment '学生证号',
 * note varchar(1024) comment '备注',
 * primary key(id)
 *
 * );
 */
public class Student {
    private Integer id;
    private String cname;
    private Sex sex;
    private Integer selfcardNo;
    private String note;
    private StudentSelfcard studentSelfcard;

    public StudentSelfcard getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcard studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(Integer selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", sex=" + sex +
                ", selfcardNo=" + selfcardNo +
                ", note='" + note + '\'' +
                ", studentSelfcard=" + studentSelfcard +
                '}';
    }
}
