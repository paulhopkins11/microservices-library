-- Build the application
mvn clean package

-- Build the images
docker-compose build

-- Run the application
docker-compose up

-- Test the application
--- book-service -> book-database
curl http://localhost:82/books
[{"id":1,"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]
--- library-service -> book-service -> book-database
curl http://localhost:81/library
{"requestDate":1465401063315,"books":[{"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]}