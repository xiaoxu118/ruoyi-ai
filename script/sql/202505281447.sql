ALTER TABLE `knowledge_info`
MODIFY COLUMN `share` tinyint(4) NULL DEFAULT 1 COMMENT '是否公开知识库（0 否 1是）' AFTER `kname`,
ADD COLUMN `auth_type` varchar(50) NULL COMMENT '权限类型，10本人可见，20角色可见' AFTER `remark`,
ADD COLUMN `auth_roles` text NULL COMMENT '角色字符串' AFTER `auth_type`;