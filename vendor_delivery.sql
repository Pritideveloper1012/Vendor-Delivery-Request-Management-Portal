
CREATE DATABASE vendor_delivery_db;
USE vendor_delivery_db;
CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50), password VARCHAR(50), role VARCHAR(20));
CREATE TABLE vendors (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), contact VARCHAR(50));
CREATE TABLE deliveries (id INT AUTO_INCREMENT PRIMARY KEY, vendor_id INT, product_name VARCHAR(100), status VARCHAR(20),
FOREIGN KEY (vendor_id) REFERENCES vendors(id));
