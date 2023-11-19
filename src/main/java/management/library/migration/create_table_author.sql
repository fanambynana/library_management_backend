CREATE TABLE IF NOT EXISTS author(
    id SERIAL PRIMARY KEY,
    authorName VARCHAR(250) NOT NULL,
    sex CHAR(1) CHECK (sex = 'M' OR sex = 'F')
);

INSERT INTO author VALUES
('Agatha Christie', 'F'),
('J.R.R. Tolkien', 'M'),
('George R.R. Martin', 'M');