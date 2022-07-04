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
