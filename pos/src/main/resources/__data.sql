INSERT INTO `pos_db`.`product` (`name`, `description`, `price`, `instock`, `minstock`, `barcode`, `sku`, `imguri`, `categoryid`) VALUES ('Product 1', 'description 1', '10000', '10', '1', '1234567889', '123456778', 'AAAAA', '1');
INSERT INTO `pos_db`.`category` (`name`, `description`) VALUES ('category1', 'desc 1 csdonv');
INSERT INTO `pos_db`.`client` (`first_name`, `last_name`, `sex`, `rfc`, `birthdate`) VALUES ('Christian', 'Ibarra', 'M', 'LCSFU2345', '1995-07-08');
SELECT `id`, `first_name`, `last_name`, `phone`, `email`, `rfc`, `birthdate`, `store_id`, `user_id` FROM `pos_db`.`employee` WHERE  `id`=1;
UPDATE `pos_db`.`employee` SET `first_name`='john', `last_name`='jpa', `phone`='5555555', `email`='jpa@jpa.com', `rfc`='1234566' WHERE  `id`=1;
INSERT INTO `pos_db`.`expense` (`concept`, `date`, `employee_id`, `currency`, `store_id`, `amount`) VALUES ('Electricity', '2022-07-10', '1', 'MXN', '1', '1000');
