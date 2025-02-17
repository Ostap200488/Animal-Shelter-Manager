# Animal Shelter Management System

## Overview
The **Animal Shelter Management System** is a Java-based application designed to help animal shelters manage their animals efficiently. It allows users to add, remove, and retrieve information about animals within the shelter. The system is implemented using **object-oriented principles** and follows clean coding practices.

## Features
- Add new animals (Dogs, Cats, etc.)
- Remove animals from the shelter
- Retrieve details about animals in the shelter
- Unit tests using **JUnit 5**
- Built with **Maven** for dependency management

## Technologies Used
- **Java 17+**
- **Maven** (Dependency Management)
- **JUnit 5** (Testing Framework)

## Installation & Setup
### Prerequisites
Ensure you have the following installed on your system:
- Java Development Kit (**JDK 17 or later**)
- Apache Maven (**Latest Version**)
- An IDE such as **IntelliJ IDEA** or **Eclipse**

### Steps to Run the Project
1. **Clone the Repository**:
   ```sh
   git clone <repository-url>
   cd AnimalShelterManager
   ```
2. **Build the Project** using Maven:
   ```sh
   mvn clean install
   ```
3. **Run the Application**:
   ```sh
   mvn exec:java -Dexec.mainClass="shelter.Main"
   ```

## Running Tests
To execute the unit tests, run:
```sh
mvn test
```
The tests ensure that the core functionalities, such as adding and removing animals, work correctly.

## Project Structure
```
AnimalShelterManager/
│── pom.xml                          # Maven configuration file
│── src/
│   ├── main/java/shelter/           # Core application logic
│   │   ├── AnimalShelter.java       # Main shelter management class
│   │   ├── Main.java                # Entry point of the application
│   ├── main/java/models/            # Animal models
│   │   ├── Animal.java              # Base class for animals
│   │   ├── Dog.java                 # Dog-specific attributes
│   │   ├── Cat.java                 # Cat-specific attributes
│   ├── test/java/shelter/           # Test cases
│   │   ├── AnimalShelterTest.java   # JUnit test cases for shelter logic
```

## Contributing
If you would like to contribute to this project:
1. Fork the repository.
2. Create a new branch (`feature-xyz`).
3. Commit your changes.
4. Open a pull request.

## License
This project is licensed under the **MIT License**.

## Contact
For any questions or issues, please reach out to:
- **Developer:** [Your Name]
- **Email:** [Your Email]

