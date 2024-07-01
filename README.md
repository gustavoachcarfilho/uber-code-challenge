# Email Microservice
## Uber Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-SES?style=for-the-badge&logo=amazon&logoColor=black&labelColor=yellow&color=blue)

This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

The microservice was developed as a training exercise to improve my Java skills and to demonstrate how to solve the Uber Backend Challenge. 
The project was designed with clean architecture in mind, comprising several layers:

- Core Layer: Contains use cases and business rules and does not know any other layer.
- Application Layer: Implements the interfaces defined in the core and only knows the core layer.
- Interface Adapters Layer: Contains the interface that classes using AWS for email sending must implement. This ensures that the code is not dependent on just one email service, allowing the use of other services by simply implementing this interface.
- Infrastructure Layer: Responsible for interacting with external structures, i.e., implementing communication with AWS SES.
- Controllers Layer: Responsible for handling HTTP requests and returning the correct responses.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/gustavoachcarfilho/uber-code-challenge.git
```
2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "gustavo_teste@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```

## Contributing

Contributions are encouraged! If you spot any problems or have ideas for enhancements, please open an issue or submit a pull request to the repository.


