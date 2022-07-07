CREATE TABLE `product` (
	`id` INT(255) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`description` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_general_ci',
	`price` DOUBLE UNSIGNED ZEROFILL NOT NULL,
	`instock` INT(255) UNSIGNED ZEROFILL NOT NULL,
	`minstock` INT(255) UNSIGNED ZEROFILL NOT NULL,
	`barcode` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`sku` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`imguri` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_general_ci',
	`categoryid` INT(255) UNSIGNED ZEROFILL NOT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB;

CREATE TABLE `category` (
	`id` INT(255) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`description` VARCHAR(100) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_general_ci'
;

CREATE TABLE `client` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`middle_name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`last_name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`sex` CHAR(1) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`rfc` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`birthdate` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `employee` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(50) NULL DEFAULT '',
	`last_name` VARCHAR(50) NULL DEFAULT '',
	`phone` VARCHAR(13) NULL DEFAULT '',
	`email` VARCHAR(50) NULL DEFAULT '',
	`rfc` VARCHAR(50) NULL DEFAULT '',
	`birthdate` DATE NULL DEFAULT NULL,
	`store_id` INT(255) NULL DEFAULT NULL,
	`user_id` INT(255) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_general_ci'
;

CREATE TABLE `expense` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`concept` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`date` DATE NULL DEFAULT NULL,
	`employee_id` INT(255) NULL DEFAULT NULL,
	`currency` ENUM('USD','EUR','MXN','YEN','LB') NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`store_id` INT(255) NULL DEFAULT NULL,
	`amount` DOUBLE NULL DEFAULT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `provider` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`address` VARCHAR(100) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `role` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`description` VARCHAR(100) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `sale` (
	`id` INT(255) NOT NULL,
	`detail_id` INT(255) NOT NULL,
	`employee_id` INT(255) NOT NULL,
	`discount` DOUBLE NOT NULL,
	`amount` INT(255) NOT NULL,
	`currency` ENUM('USD','EUR','MXN','YEN','LB') NOT NULL,
	`client_id` INT(255) NOT NULL,
	`tax` DOUBLE NOT NULL,
	`observations` VARCHAR(100) NOT NULL DEFAULT '',
	`store_id` INT(255) NOT NULL,
	`date` DATE NOT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_general_ci'
;

CREATE TABLE `store` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL DEFAULT '',
	`manager_id` INT(255) NOT NULL,
	`address` VARCHAR(100) NOT NULL DEFAULT '',
	PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_general_ci'
;

CREATE TABLE `user` (
	`id` INT(255) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`last_access` DATETIME NOT NULL,
	`role_id` INT(255) NOT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
;

