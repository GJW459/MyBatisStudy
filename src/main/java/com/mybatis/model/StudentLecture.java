/**
 * FileName: StudentLecture
 * Author:   郭经伟
 * Date:     2020/4/1 11:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 学生课程表
 * create table t_student_lecture(
 * id int(20) not null auto_increment comment '编号',
 * student_id int(20) not null  comment '学生编号',
 * lecture_id int(20) not null  comment '课程编号',
 * grade DECIMAL(16,2) not null  comment '评分',
 * note varchar(1024)  comment '备注',
 * primary key(id)
 *
 * );
 */
public class StudentLecture implements Serializable {

    private Integer id;
    private Integer studentId;
    private Integer lectureId;//和课程表关联
    private BigDecimal grade;
    private String note;
    //学生课程表和课程表有一对一的关系
    private Lecture lecture;

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

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

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentLecture{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lectureId=" + lectureId +
                ", grade=" + grade +
                ", note='" + note + '\'' +
                ", lecture=" + lecture +
                '}';
    }
}
