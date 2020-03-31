# 课程表
create table t_lecture(
id int(20) not null auto_increment COMMENT '编号',
lecture_name VARCHAR(60) not null COMMENT '课程名',
note varchar(1024) comment '备注',
primary key (id)
);
create table t_student(
id int(20) not null auto_increment comment '编号',
cname varchar(60) not null comment '学生姓名',
sex varchar(60) not null comment '性别',
selfcard_no int(20) not null comment '学生证号',
note varchar(1024) comment '备注',
primary key(id)

);
create table t_student_health_female(
id int(20) not null auto_increment comment '编号',
student_id varchar(60) not null  comment '学生编号',
check_date varchar(60) not null  comment '检查日期',
heart varchar(60) not null  comment '心脏',
uterus varchar(60) not null  comment '子宫',
note varchar(1024)  comment '备注',
primary key(id)

);
create table t_student_health_male(
id int(20) not null auto_increment comment '编号',
student_id varchar(60) not null  comment '学生编号',
check_date varchar(60) not null  comment '检查日期',
heart varchar(60) not null  comment '心脏',
prostate varchar(60) not null  comment '前列腺',
note varchar(1024)  comment '备注',
primary key(id)

);
create table t_student_lecture(
id int(20) not null auto_increment comment '编号',
student_id int(20) not null  comment '学生编号',
lecture_id int(20) not null  comment '课程编号',
grade DECIMAL(16,2) not null  comment '评分',
note varchar(1024)  comment '备注',
primary key(id)

);
create table t_student_selfcard(
id int(20) not null auto_increment comment '编号',
student_id int(20) not null  comment '学生编号',
native varchar(60) not null  comment '籍贯',
note varchar(1024)  comment '备注',
primary key(id)

);
