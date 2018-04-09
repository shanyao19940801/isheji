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
   auth_id              int(11) not null auto_increment,
   user_id              int(11) comment '�û�id',
   identity_type        varchar(11) comment '��¼����',
   identifier           varchar(30) comment '��¼Ψһ��ʶ',
   credential           varchar(32) comment '����ƾ֤��վ�ڵı������룬վ��Ĳ�����򱣴�token��',
   primary key (auth_id),
   unique key AK_Key_2 (identifier)
)
auto_increment = 10000000000;

alter table user_auths comment '�û���Ȩ��Ϣ��';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   user_id              int(11) not null auto_increment comment '�û�id',
   user_name            varchar(11) comment '�û�����',
   avatar               varchar(100) comment '�û�ͷ���ַ',
   primary key (user_id)
)
auto_increment = 10000000000;

alter table user_info comment '�û�������Ϣ��';

