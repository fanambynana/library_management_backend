CREATE TABLE IF NOT EXISTS  book(
    id SERIAL PRIMARY KEY,
    book_name TEXT NOT NULL,
    page_number INTEGER,
    release_date DATE,
    topic TEXT[]
);

INSERT INTO book(book_name, page_number, release_date, topic)VALUES
('The Hating Game',	456,	2023-11-15, '{"ROMANCE", "COMEDY"}'),
('Pride and Prejudice',	321, 2023-11-17, '{"ROMANCE"}'),
('The Adventures of Sherlock Holmes', 123, 2023-11-16, '{"COMEDY"}');