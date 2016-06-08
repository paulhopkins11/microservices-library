-- Book Micro Service for accessing the book database

-- Build the image
docker build -t book-service .

-- Run a container
docker run --link book-database -p 8080:8080 -e BOOK_DATABASE=book-database bookservice

-- Test the service
curl http://localhost:8080/books
[{"id":1,"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]
