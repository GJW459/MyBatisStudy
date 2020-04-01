/**
 * FileName: StudentSelfcard
 * Author:   郭经伟
 * Date:     2020/3/31 23:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import java.io.Serializable;

/**
 * 学生证
 * create table t_student_selfcard(
 * id int(20) not null auto_increment comment '编号',
 * student_id int(20) not null  comment '学生编号',
 * native varchar(60) not null  comment '籍贯',
 * note varchar(1024)  comment '备注',
 * primary key(id)
 *
 * );
 */
public class StudentSelfcard implements Serializable {

    private Integer id;
    private Integer studentId;
    private String studentNative;
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

    public String getStudentNative() {
        return studentNative;
    }

    public void setStudentNative(String studentNative) {
        this.studentNative = studentNative;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString()  {
        return "StudentSelfcard{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", studentNative='" + studentNative + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
