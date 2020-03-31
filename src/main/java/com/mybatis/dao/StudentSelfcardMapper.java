/**
 * FileName: StudentSelfcardMapper
 * Author:   郭经伟
 * Date:     2020/3/31 23:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.dao;

import com.mybatis.model.StudentSelfcard;

public interface StudentSelfcardMapper {

    StudentSelfcard findStudentSelfcardByStudentId(Integer studentId);
}
