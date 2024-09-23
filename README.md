# **JavaInteractiveApps**

**Description**  
A collection of Java-based applications demonstrating graphical user interfaces (GUIs) and interactive functionalities using `JFrame`, `JPanel`, `Reflection`, and `Graphics` classes.

## **Features**

### **Part 1 (Utility - Circumference Calculator):**  
A GUI application that calculates the circumference of a circle based on the user input for the radius.  
- The program has a simple layout using a `GridLayout`.
- Users can input a radius, and upon clicking the "Calculate" button, the program computes the circumference and displays it in the output field.
- JavaDoc comments are used to document the method for calculating the circumference, clearly explaining the parameters (`radius`) and return type (circumference).
- Includes error handling to ensure valid numerical input.

### **Part 2 (Inner Class Information Viewer):**  
This part allows users to update and view information related to inner and outer classes in Java.  
- When the "Update Info" button is clicked, the program retrieves and displays information about inner and outer classes, as well as fields within those classes.
- Example output:  
  - Inner class: `Part2$InnerInfoClass`  
  - Outer class: `Part2`  
  - Fields: `textArea`, `button`, `infoText`

### **Part 3 (Reflection-Based Method Invocation):**  
This part demonstrates the use of reflection in Java to explore and invoke methods dynamically at runtime.  
- The program identifies and lists methods from the mystery class, including private and public methods.
- It provides output showing the method names and their parameter types, such as:  
  - `youFoundAPrivateMethod` (no parameters)  
  - `youFoundPublicMethodTwoParams` (parameters: `String`, `int`)  
  - `youFoundAPublicMethodWithOneParam` (parameter: `int`)
- The methods are invoked, displaying the results of each invocation based on the parameters.

### **Part 4 (My Album - Favorite Items):**  
A GUI-based album that displays a collection of favorite animals and sports.  
- The program uses `AlbumItem` classes (e.g., `FavouriteSport`, `FavouriteAnimal`) to organize the content.
- Each item is displayed with an image and associated facts.
- The user can cycle through the items using a "Forward" button to explore the different entries in the album.

## **Running the Program**

1. Load the code into your IDE of choice.
2. Run the main class in each part:
   - **Part 1** opens the Circumference Calculator where users input the radius and see the calculated result.
   - **Part 2** allows the user to update information and view inner and outer class details.
   - **Part 3** lists and invokes methods using Java reflection, providing outputs for each method.
   - **Part 4** opens the album of favorite items, where users can browse through animals and sports.

## **Checklist**

- Use `JFrame` and `JPanel` to create graphical interfaces.
- Implement `JTextField` and `JButton` for interactive user input.
- Use Java Reflection to dynamically list and display methods, parameters, and their results.
- Utilize JavaDoc comments to document methods, aiding in generating clear documentation.
- Create classes for organizing favorite items (sports, animals) and displaying them in an album interface.
