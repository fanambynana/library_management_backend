CREATE TABLE IF NOT EXISTS admin(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(255) NOT NULL ,
    sex CHAR(1) CHECK (sex = 'M' OR sex = 'F'),
    password VARCHAR(16)
);

INSERT INTO admin(name, sex, password) VALUES
('Rakoto', 'M', 'rakoto'),
('Rabe', 'M', 'rabe'),
('Rasoa', 'F', 'rasoa');