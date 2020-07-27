# traveltools-restAPI
REST API exposing endpoints for CRUD of travel-related data (hotels, attractions, flights, airports). Uses Spring Data REST architecture via Spring Boot with datasource to be configured in pom and properties file. Designed for  use by web scraper and travel web sites.

REST API designed for an application (web, mobile, desktop) that will utilize travel-related data to determine an itinerary within traveler's preferences and budget.
Spring Data REST along with Spring Boot is used so as to expose hypermedia-driven HTTP resources via HATEOAS.
Domain classes can be added as needed and marked as @Entity so Hibernate can create/update schema (create/update for application user accounts need to be revoked in prod)
Java 8 for runtime environment. Maven is used as build tool. MySQL is configured to be datasource so need to setup in properties file a spring.datasource.* that has create/update access 
to a specified database.
