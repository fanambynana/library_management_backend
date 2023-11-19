CREATE TABLE IF NOT EXISTS  book(
    id SERIAL PRIMARY KEY,
    bookName TEXT NOT NULL,
    pageNumber INTEGER,
    releaseDate DATE,
    topic TEXT[]
);

INSERT INTO book(bookName, pageNumber, releaseDate, topic) VALUES
('The Hating Game',	456,	2023-11-15, '{"ROMANCE", "COMEDY"}'),
('Pride and Prejudice',	321, 2023-11-17, '{"ROMANCE"}'),
('The Adventures of Sherlock Holmes', 123, 2023-11-16, '{"COMEDY"}');