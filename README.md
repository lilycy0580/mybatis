# mybatis

CREATE TABLE tb_user(
id int PRIMARY KEY auto_increment,
username VARCHAR(20),
password varchar(20),
gender char(1),
addr VARCHAR(30)
);

insert into tb_user values(1,'zhangsan','123','男','北京');
insert into tb_user values(2,'李四','234','女','天津');
insert into tb_user values(3,'王五','11','男','西安');