create table t_user
(
    id               bigint auto_increment comment 'ID' primary key,
    nick_name        varchar(64)       null comment '昵称',
    user_description varchar(128)      null comment '简介',
    create_by        bigint            null comment '创建人',
    create_time      datetime          null comment '创建时间',
    update_by        bigint            null comment '修改人',
    update_time      datetime          null comment '修改时间',
    is_deleted       tinyint default 0 not null
) comment '用户信息' charset = utf8mb4;

create table t_user_
(
    id               bigint auto_increment comment 'ID' primary key,
    nick_name        varchar(64)       null comment '昵称',
    user_description varchar(128)      null comment '简介',
    create_by        bigint            null comment '创建人',
    create_time      datetime          null comment '创建时间',
    update_by        bigint            null comment '修改人',
    update_time      datetime          null comment '修改时间',
    is_deleted       tinyint default 0 not null
) comment '用户信息' charset = utf8mb4;


insert into t_user(nick_name, user_description)
values ('程序员小白菜', '关注公众号【程序员小白菜】获取源码');

insert into t_user_(nick_name, user_description)
values ('程序员小白菜', '影子表...关注公众号【程序员小白菜】获取源码');