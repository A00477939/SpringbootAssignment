-- Create the hotel database
CREATE DATABASE IF NOT EXISTS hotel_database;
-- Switch to the hotel database
USE hotel_database;

-- Create the hotels table
CREATE TABLE IF NOT EXISTS hotels (
    hotel_id INT AUTO_INCREMENT ,
    hotel_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    rating DECIMAL(3, 2),
    total_rooms INT,
    contact_number VARCHAR(15),
    primary key (hotel_id)
);
CREATE USER 'Hritik_Hotel'@'localhost' IDENTIFIED BY 'Hritik@123';
GRANT ALL PRIVILEGES ON hotel_database.* TO 'Hritik_Hotel'@'localhost';
FLUSH PRIVILEGES;