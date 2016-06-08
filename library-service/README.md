# library-service

## How to use this

1. Build the database docker image first

   ```
   docker build -t library-service .
   ```

2. Run the service

   ```
   docker run --name library-service -e BOOK_SERVICE_URL="http://book-service:8080/" -d -p 81:8080 library-service
   ```

3. Test the service

   * library-service -> book-service -> book-database

   ```
   curl http://localhost:81/library
   {"requestDate":1465401063315,"books":[{"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]}
   ```