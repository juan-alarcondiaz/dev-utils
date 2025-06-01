# Dev Utils

A command-line utility application for developers that provides encoding/decoding and hashing functionalities.

## Description

Dev Utils is a Spring Boot application with Spring Shell integration that offers various utility functions for developers, including:

- **Encoding/Decoding**: Support for Base64 and Hexadecimal encoding and decoding
- **Hashing**: Support for SHA-256 hashing algorithm

The application is built using a hexagonal architecture pattern, separating the domain logic from the infrastructure concerns.

## Project Structure

The project follows a hexagonal architecture pattern with the following structure:
- **Domain**: Contains the business models and exceptions
- **Application**: Contains the business logic, ports (interfaces), and adapters
- **Infrastructure**: Contains the external logic, commands, DTOs, adapters, and mappers


## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/dev-utils.git
   cd dev-utils
   ```

2. Build the application using Maven:
   ```
   mvn clean package
   ```

3. Run the application:
   ```
   java -jar target/dev-utils-0.0.1-SNAPSHOT.jar
   ```

## Usage

After starting the application, you'll be presented with a shell interface where you can run various commands.

### Encoding and Decoding

#### Base64 Encoding
```
data --type BASE64 --data "Hello World"
```
or using short options:
```
data -t BASE64 -d "Hello World"
```

#### Base64 Decoding
```
decode --type BASE64 --data "SGVsbG8gV29ybGQ="
```
or using short options:
```
decode -t BASE64 -d "SGVsbG8gV29ybGQ="
```

#### Hexadecimal Encoding
```
data --type HEX --data "Hello World"
```
or using short options:
```
data -t HEX -d "Hello World"
```

#### Hexadecimal Decoding
```
decode --type HEX --data "48656c6c6f20576f726c64"
```
or using short options:
```
decode -t HEX -d "48656c6c6f20576f726c64"
```

### Hashing

#### SHA-256 Hashing
```
hash --type SHA256 --data "Hello World"
```
or using short options:
```
hash -t SHA256 -d "Hello World"
```
