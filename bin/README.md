# Saucedemo Java Selenium TestNG Framework

## Setup Instructions
1. Install Java and Maven
2. Clone the repository
3. Run `mvn clean install`

## How to Run Tests
- Use `mvn test` to execute all tests

## How to Add New Test Cases
- Add new classes in `src/test/java/tests`
- Use TestNG annotations

## How to Update Test Data
- Modify `testdata.csv` or `testdata.xlsx` in `resources`

## Jenkins Integration
- Configure Maven project in Jenkins
- Set build command: `mvn clean test`
