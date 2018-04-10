/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/4/9 22:05:19                            */
/*==============================================================*/


drop table if exists user_auths;

drop table if exists user_info;

/*==============================================================*/
/* Table: user_auths                                            */
/*==============================================================*/
create table user_auths
(
   auth_id              int(9) not null auto_increment,
   user_id              int(9) comment '用户id',
   identity_type        varchar(11) comment '登录类型',
   identifier           varchar(30) comment '登录唯一标识',
   credential           varchar(32) comment '密码凭证（站内的保存密码，站外的不保存或保存token）',
   primary key (auth_id),
   unique key AK_Key_2 (identifier)
)
auto_increment = 100000000;

alter table user_auths comment '用户授权信息表';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   user_id              int(9) not null auto_increment comment '用户id',
   user_name            varchar(11) comment '用户名称',
   avatar               varchar(100) comment '用户头像地址',
   primary key (user_id)
)
auto_increment = 100000000;

alter table user_info comment '用户基本信息表';

