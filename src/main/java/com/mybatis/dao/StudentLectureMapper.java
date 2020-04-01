/**
 * FileName: StudentLectureMapper
 * Author:   郭经伟
 * Date:     2020/4/1 11:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.dao;

import com.mybatis.model.StudentLecture;

public interface StudentLectureMapper {

    StudentLecture getStudentLecture(Integer studentId);
}
