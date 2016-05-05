# Book-Catalog
Write API using Java and Spring to



1. add a book

2. add one or more categories to a book and

3. find books using isbn or author or title



Here are the tables and their fields:



1. Book

-- id: int

-- isbn: string

-- title: string

-- author: string

-- year_published: timestamp



2. Category

-- id: int

-- name: string

-- description: string



3. Book_Category

-- book_id: int

-- category_id: int



If there were 10 million entries in the book table, how would your code perform? what would you do differently to ensure it performs well?
