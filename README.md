# Student Service	

This project creates a CRUD REST API/Service that allows the user to create, read, update and destroy Student entities in an in-memory H2 database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install and test the software and how to install them

```
Maven 3.0+ - Build Tool
IDE of your choice (STS was used)
JDK 1.8+
Postman 7.0+ - API Development Testing
```

### Installing

A step by step series of examples that tell you how to get a development env running

Step 1: Create a new Maven Project with the following properties

```
Group Id: com.studentmicroservice
Artifact Id: StudentService
```

Step 2: Unzip project into directory of your choosing 

Step 3: In IDE of your choice, open the project and modify the pom.xml to reflect the pom.xml contained in this repo.

Step 4: In src/main/resources, create a data.sql file and modify to contain seed data as below

```
insert into student
values(10001, '07/28/1991', 'Jacob', 'Espana', 'Computer Science');

insert into student
values(10002, '09/14/1978', 'John', 'Smith', 'Environmental Science');
```

Step 5: In src/main/java/com/studentmicroservice/StudentService, create a directory named 'student'.

* *Feel free to place Application main in student directory as well*

Step 6: In 'student' directory, create Student.java entity class to reflect the Student.java class contained in this repo.

Step 7: In 'student' directory, create StudentController.java class to reflect the StudentController.java class contained in this repo.

Step 8: In 'student' directory, create StudentRepository.java interface to reflect the StudentRepository.java interface contained in this repo.

Step 9: In 'student' directory, create StudentService.java class to reflect the StudentService.java class contained in this repo.

Step 10: Run application as a Spring Boot App.

### Testing

#### Create a Student Entity

In Postman, enter the correct URL and HTTP Request method

```
http://localhost:8080/students
Request Method - POST
```

Add a request body in JSON format (do not include id param as that is auto generated)

```
{
	"firstName": "Aaron", 
	"lastName": "Rodgers", 
	"major": "Football", 
	"dob": "11/09/1992"
}
```

This should return an empty HTTP response

#### Read a Student Entity

In Postman, enter the correct URL and HTTP Request method

```
http://localhost:8080/students/{id}
Request Method - GET
```

This should return an HTTP response of (will vary depending on id value in URI)

```
[
    {
        "id": 10001,
        "firstName": "Jacob",
        "lastName": "Espana",
        "major": "Computer Science",
        "dob": "07/28/1991"
    }
] 
```

#### Read All Student Entities

In Postman, enter the correct URL and HTTP Request method

```
http://localhost:8080/students
Request Method - GET
```

This should return an HTTP response of (will vary depending on id value in URI)

```
[
    {
        "id": 10001,
        "firstName": "Jacob",
        "lastName": "Espana",
        "major": "Computer Science",
        "dob": "07/28/1991"
    },
    {
        "id": 10002,
        "firstName": "John",
        "lastName": "Smith",
        "major": "Environmental Science",
        "dob": "09/14/1978"
    },
    {
        "id": 10003,
        "firstName": "Aaron",
        "lastName": "Rodgers",
        "major": "Football",
        "dob": "11/09/1992"
    }
]
```

#### Update a Student Entity

In Postman, enter the correct URL and HTTP Request method

```
http://localhost:8080/students/{id}
Request Method - PUT
```

Add a request body in JSON format 

```
{
	"firstName": "Kenny", 
	"lastName": "Clark", 
	"major": "Defense", 
	"dob": "10/19/1993"
}
```

This should return an empty HTTP response

#### Delete a Student Entity

In Postman, enter the correct URL and HTTP Request method

```
http://localhost:8080/students/{id}
Request Method - DELETE
```

This should return an empty HTTP response

![My image](https://github.com/jacobespana/images/blob/master/img/students_DELETE.png)

## Built With

* [STS](http://www.dropwizard.io/1.0.2/docs/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Postman](https://www.getpostman.com/) - API Development Testing

## Authors

* **Jacob Espana** - *Initial work* - [GitHub](https://github.com/jacobespana)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thanks to in28minutes for inspiration and reference code.


