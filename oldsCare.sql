-- Create syntax for '(null)'

-- Create syntax for TABLE 'environment_record'
CREATE TABLE `environment_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `gas` double NOT NULL COMMENT '可燃气体',
  `temperature` double NOT NULL COMMENT '温度',
  `humidity` double NOT NULL COMMENT '湿度',
  `creator` varchar(32) NOT NULL DEFAULT '' COMMENT '创建者',
  `editor` varchar(32) NOT NULL DEFAULT '' COMMENT '编辑者',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `edit_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '编辑时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Create syntax for TABLE 'health_record'
CREATE TABLE `health_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `heart_rate` double NOT NULL COMMENT '心率',
  `blood_oxygen` double NOT NULL COMMENT '血氧',
  `creator` varchar(32) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `editor` varchar(32) NOT NULL DEFAULT 'system' COMMENT '编辑者',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `edit_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '编辑时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Create syntax for TABLE 'user'
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
  `telephone` varchar(32) DEFAULT '' COMMENT '联系方式',
  `address` varchar(32) DEFAULT '' COMMENT '联系方式',
  `role` int(4) NOT NULL DEFAULT '0' COMMENT '是否管理员 1-是 0-普通用户',
  `creator` varchar(32) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `editor` varchar(32) NOT NULL DEFAULT 'system' COMMENT '编辑者',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `edit_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '编辑时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
