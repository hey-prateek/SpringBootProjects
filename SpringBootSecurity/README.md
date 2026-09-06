# Spring Boot CRUD API

Basic CRUD REST API for products using Spring Boot, Spring Data JPA, and an in-memory H2 database.

## Run

```bash
mvn spring-boot:run
```

The API runs at `http://localhost:8080`.

## Endpoints

- `GET /api/products`
- `GET /api/products/{id}`
- `POST /api/products` with `{ "name": "Keyboard", "price": 49.99 }`
- `PUT /api/products/{id}` with `{ "name": "Keyboard", "price": 39.99 }`
- `DELETE /api/products/{id}`

The H2 console is available at `http://localhost:8080/h2-console` with JDBC URL `jdbc:h2:mem:cruddb`, username `sa`, and an empty password.
