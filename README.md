# ProductCatalog
# Product Catalog Java Application with MySQL Database

This is a Java application for managing a structured product catalog with MySQL as the backend database. The application allows for CRUD operations on products, categories, attributes, and ratings.

## Prerequisites

- Java Development Kit (JDK)
- MySQL Database Server
- MySQL JDBC Driver
- Maven or Gradle (optional)

## Setup

1. **Database Configuration**: Ensure you have MySQL installed and running. Create a new database and a user with appropriate privileges.

    ```sql
    CREATE DATABASE product_catalogue;
    CREATE USER 'catalogue_user'@'localhost' IDENTIFIED BY 'your_password';
    GRANT ALL PRIVILEGES ON product_catalogue.* TO 'catalogue_user'@'localhost';
    FLUSH PRIVILEGES;
    ```

2. **Database Schema**: Run the provided SQL scripts to create the necessary tables for the product catalog.

3. **Java Application Configuration**: Update the JDBC connection URL in the Java code to match your MySQL database settings.

## Database Schema

The database schema consists of the following tables:

- `Product`: Stores information about products.
- `Category`: Stores categories associated with products.
- `Attribute`: Stores additional attributes associated with products.
- `Rating`: Stores ratings given by users for products.

## Usage

1. **Run the Application**: Run the Java application, which will start the server and expose API endpoints for managing the product catalog.

2. **API Endpoints**: Use API endpoints to perform CRUD operations on products, categories, attributes, and ratings.

    - Example:
        - `POST /products`: Create a new product.
        - `GET /products/{id}`: Retrieve a product by ID.
        - `PUT /products/{id}`: Update a product by ID.
        - `DELETE /products/{id}`: Delete a product by ID.
        - `GET /products/search`: Search products with filters.
        - `POST /products/{id}/ratings`: Add a rating to a product.

## Development

- **Technology Stack**: Java, MySQL
- **Dependencies**: MySQL JDBC Driver
- **Frameworks/Libraries**: None
- **Build Tool**: Maven or Gradle (optional)

## Contributors

- [Your Name]

## License

This project is licensed under the [MIT License](LICENSE).
