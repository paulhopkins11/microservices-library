# Microservices Library

## How to use this

1. Build the application

   ```
   ./mvnw clean package
   ```
   or by using docker
   ```
   docker run -it --rm -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.6.3-openjdk-11
   ```
   You can also cache your maven directory
   ```
   docker volume create --name maven-repo
   docker run -it --rm -v maven-repo:/root/.m2 -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.6.3-openjdk-11 mvn clean package
   ```

2. Build the images

   ```
   docker-compose build
   ```

3. Run the application

   ```
   docker-compose up
   ```

4. Test the application

   * book-service -> book-database

   ```
   curl http://localhost:82/books
   [{"id":1,"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]
   ```
   
   * library-service -> book-service -> book-database

   ```
   curl http://localhost:81/library
   {"requestDate":1465401063315,"books":[{"title":"Harry Potter","isbn":"ISBN:1234567890","description":"Wizarding"}]}
   ```

5. Open the web application in a browser

   ```
   http://localhost
   ```

a
