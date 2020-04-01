CREATE TABLE IF NOT EXISTS flower(
flower_uuid UUID PRIMARY KEY NOT NULL
name VARCHAR(255) NOT NULL
kind VARCHAR(255) NOT NULL
purchase_date DATE NOT NULL
watering_date DATE NOT NULL
days_from_last_watering INTEGER(100) NOT NULL
next_watering_date DATE NOT NULL
);

