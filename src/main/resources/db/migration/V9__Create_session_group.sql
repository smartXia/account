DROP TABLE IF EXISTS `session_group`;
CREATE TABLE `session_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL,
  `channel` int(11) NOT NULL,
  `group_identity` varchar(32) NOT NULL COMMENT 'session_group的标识',
  `related_session_ids` varchar(128) NOT NULL COMMENT '相关联session_id 最大保持10个 逗号隔开',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
