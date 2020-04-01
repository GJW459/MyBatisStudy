/**
 * FileName: MaleStudent
 * Author:   郭经伟
 * Date:     2020/4/1 16:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.model;

import java.io.Serializable;
import java.util.List;

public class MaleStudent extends Student implements Serializable {

    private List<StudentHealthMale> studentHealthMales;

    public List<StudentHealthMale> getStudentHealthMales() {
        return studentHealthMales;
    }

    public void setStudentHealthMales(List<StudentHealthMale> studentHealthMales) {
        this.studentHealthMales = studentHealthMales;
    }

    @Override
    public String toString() {
        return "MaleStudent{" +
                "studentHealthMales=" + studentHealthMales +
                '}';
    }
}
