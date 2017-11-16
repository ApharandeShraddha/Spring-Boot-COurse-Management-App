# Spring-Boot-COurse-Management-App

	1. Developed application for course management System using Spring Boot and Spring Tool Suite IDE.
  
	2. Implemented REST endpoints by using Spring MVC annotations to map incoming REST API requests to controller returning JSON Payloads.
      1. Get course details 2. Update Course 2.Delete Course 4. Create new course also rest endpoints to get Topic details.
      
  3. Used Spring Data JPA framework to connect to an embedded Derby database to store course details. Used CrudRepository to create CRUD       operations.

To deploy code:
1. mvn clean install (create jar file as i have used maven project for development)
2. java -jar $jarname
3. Tomcat will start on 8080 port. (http://localhost:8080/courses)
