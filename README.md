# Assignment: Building a Color Guessing Game using Spring Boot

## Objective:
The goal of this assignment is to create a simple web-based color guessing game using Spring Boot. The application will generate a random color from a predefined list, and the user must guess the color by selecting from multiple choices. The game will provide feedback on whether the guess was correct or incorrect and allow the user to play multiple rounds.

## Tools and Technologies:
- Spring Boot
- Thymeleaf
- Bootstrap for styling
- Maven (for dependency management)
- Java

## Requirements:
- JDK 1.8 or later
- Maven 3.2+
- IntelliJ IDEA (Community or Ultimate Edition) or any other IDE

## Steps to Complete the Assignment:

### Step 1: Project Setup
1. **Create a new Spring Boot project**:
   - You can use Spring Initializr (https://start.spring.io/) or manually create a Maven project and add the necessary dependencies.
   - Dependencies to include:
     - Spring Web
     - Thymeleaf
     - Spring Boot DevTools (optional for auto-reload)

### Step 2: Define the Game Logic
1. **Create a Color Service**:
   - This service will handle the logic for generating a random color and checking the user's guess.
   - Create a list of colors (e.g., "Red", "Blue", "Green", "Yellow").
   - Implement a method to randomly select a color from this list.
   - Implement a method to validate the user's guess against the selected color.

2. **Create a Game Controller**:
   - Handle HTTP requests for starting the game, making a guess, and showing the game result.
   - Use session attributes to store the currently selected color across requests.

### Step 3: Create Thymeleaf Templates
1. **Create `index.html`**:
   - This page will display the game interface, including multiple choice buttons for each color.
   - Use Thymeleaf to dynamically create buttons based on the list of colors.

2. **Create `result.html`**:
   - This page will display the result of the user's guess ("Correct!" or "Try again!").
   - Provide a button to play again, which redirects to the main game page.

### Step 4: Add Bootstrap for Styling
- Use Bootstrap to style the game pages. Ensure the game is visually appealing and the UI is user-friendly.

### Step 5: Implement the Game Controller
- Implement the endpoints to handle:
  - Displaying the game page with color choices.
  - Receiving the user's color guess and checking it against the selected color.
  - Redirecting to the result page with appropriate feedback.




## Conclusion:
This assignment will help you understand how to create interactive web applications using Spring Boot and Thymeleaf. You will gain hands-on experience with handling HTTP requests, session management, and integrating Bootstrap for styling. This foundational knowledge is crucial for developing more complex web applications using Spring Boot.
