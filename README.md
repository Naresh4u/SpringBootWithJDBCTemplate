# SpringBootWithJDBCTemplate
Simple spring boot with jdbc template application.

# Swagger URL
http://localhost:9999/swagger-ui.html

# Postman/RestClient URL
localhost:9999/employee/addEmployee

# Sample Request
{
"firstName": "Dasari",
"lastName": "Naresh",
"email": "nareshd@gmail.com",
"salary": 100000
}

# Table Struture
CREATE TABLE `employee` (
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`email`)
)

# DB Query
INSERT INTO `test`.`employee`
(`first_name`,
`last_name`,
`email`,
`salary`)
VALUES
(<{first_name: }>,
<{last_name: }>,
<{email: }>,
<{salary: }>);
