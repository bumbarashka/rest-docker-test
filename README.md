# Simple REST app #

Docker image with CRUD REST service written with grails. It provides ability to create, remove, update or get passed interview questions. Each interview question contains flag whether it is known or not.

## Technologies / Versions Used
- Grails 3.2.7 
- Java JDK 8+
- Tomcat 8+

## Service URL
The application is accessible by the following URL:
http://rest-docker-test-2.us-east-1.elasticbeanstalk.com/questions

## Run with Docker
`docker run -it -p 80:8080 bumbarashka/rest-docker-test`

## Supported formats
* `XML`
`$ curl -i -H "Accept: text/xml" localhost/questions`
or 
`$ curl localhost/questions.xml`
* `JSON` (default)
`$ curl -i -H "Accept: application/json" localhost:8080/questions`
or 
`$ curl localhost/questions.json`
or just
`$ curl localhost/questions`

## Available requests

* Get all questions: 
`$ curl localhost/questions`
* Get a specific question: 
`$ curl localhost/questions/1`
* Insert new question
`curl -i -X POST -H "Content-Type: application/json" -d '{"text":"Do you know what is abstract class?", "knowAnswer": "false"}' localhost/questions`
* Update an existing question 
`curl -i -X PUT -H "Content-Type: application/json" -d '{"knowAnswer":"true"}' localhost/questions/3`
* Delete an existing question
`$ curl -i -X DELETE localhost/questions/3`



