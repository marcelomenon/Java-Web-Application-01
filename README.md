Java web application (Rent or Buy a car) using Servlet in an Apache TomCat server (v8.0), jdbc dao (Data Access Object) with MySQL Database (version 5.7.19), MySQL connector for Java (version 5.1.42), Eclipse Neon.3 Release (4.6.3) and Java version 1.8.0_121


Requirements:

- Create a MySQL database called 'database02'

mysql-sql> \connect root@localhost

mysql-sql> create database database02;

mysql-sql> show databases;

mysql-sql> use database02;

- Create a table called 'cars' with the following fields 'brand', 'type', 'year', 'fuel' and 'market'

mysql-sql> create table cars (id BIGINT NOT NULL AUTO_INCREMENT, brand VARCHAR(255), type VARCHAR(255), year VARCHAR(255), fuel VARCHAR(255), market VARCHAR(255), primary key (id));


How to access the web application:

- Run from Eclipse the AddCarServlet.java to start the TomCat Server

- Access http://localhost:8181/WebProjectTest02/add-car.html

- Fill the fields and click on 'Save' button

- The following message should be displayed 'Car <brand> <type> <year> <fuel> <market> added successful'

- Run the 'select * from cars' in the MySQL database to verify if the data was inserted
