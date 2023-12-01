CREATE TABLE IF NOT EXISTS author(
    id SERIAL PRIMARY KEY,
    author_name VARCHAR(250) NOT NULL,
    sex CHAR(1) CHECK (sex = 'M' OR sex = 'F')
);

INSERT INTO author(author_name, sex) VALUES
('Agatha Christie', 'F'),
('J.R.R. Tolkien', 'M'),
('George R.R. Martin', 'M');