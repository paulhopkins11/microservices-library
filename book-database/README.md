-- Build the database docker image first
docker build -t book-database .

-- Run the database
docker run --name book-database -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 3306:3306 book-database

-- Now you can run a mysql container to connect to the library database to use the command line
docker run -it --link book-database:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
