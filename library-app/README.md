# library-app

This project is generated with [yo angular generator](https://github.com/yeoman/generator-angular)
version 0.14.0.

## Build & development

Run `grunt` for building and `grunt serve` for preview.

## Testing

Running `grunt test` will run the unit tests with karma.

## Production

1. Install npm packages

   ```
   npm install
   ```

2. Install bower packages

   ```
   bower install
   ```

3. Build the application

   ```
   grunt build
   ```

4. Build the database docker

   ```
   docker build -t library-app .
   ```

5. Run the database

   ```
   docker run --name library-app --link library-service:library-service -d -p 80:80 library-app
   ```
