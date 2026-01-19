// FileName: MainDemo.java
// This file demonstrates core Java concepts and data structures from the lectures.

// Topic: Java Environment, Basics, and Nuances (Lecture 1A, Slide 13)
// Importing necessary Java libraries.
import java.util.ArrayList; // Topic: ArrayLists (Lecture 2A, Slide 12)
import java.util.LinkedList; // Topic: Linked Lists in Java (Lecture 2B, Slide 27)
import java.util.Queue;      // Topic: The Java Queue Interface (Lecture 4B, Slide 19)
import java.util.Stack;      // Topic: The Java Stack Class (Lecture 4A, Slide 16)

/**
 * Main class for a concise demonstration of Java Data Structures and Algorithms.
 * Topic: Class Declaration (Lecture 1B, Slide 12)
 * Topic: JavaDoc Comments (Lecture 1A, Slide 38)
 */
public class MainDemo {

    /**
     * The main method, the entry point of the Java program.
     * Topic: Main Method and Class Structure (Lecture 1A, Slide 16)
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        System.out.println("--- CSCI 2010U Data Structures Demo ---");

        // --- Topic: Using Objects in Java (Lecture 1B, Slide 5) ---
        System.out.println("\n--- 1. Java Objects (Point Class) ---");
        // Topic: The Point Class (Lecture 1B, Slide 7)
        // Creating and interacting with an existing object.
        Point p = new Point(5, 10); // Topic: Using Objects - Create using a constructor (Lecture 1B, Slide 9)
        System.out.println("Initial Point: " + p); // Topic: toString() method (Lecture 1B, Slide 8)
        p.move(15, 20); // Topic: Using Objects - Interact Using Methods (Lecture 1B, Slide 9)
        System.out.println("Moved Point: " + p);

        // --- Topic: Build Your Own Objects in a Class (Lecture 1B, Slide 11) ---
        System.out.println("\n--- 2. Custom Object (MyCustomClass) ---");
        // Creating an instance of a custom class.
        MyCustomClass customObj = new MyCustomClass(30, "Charlie");
        customObj.displayInfo(); // Calling an instance method.
        System.out.println("Total custom objects: " + MyCustomClass.getCount()); // Topic: Static Methods & Fields (Lecture 1B, Slide 13)

        // --- Topic: Java Arrays (Lecture 2A, Slide 5) ---
        System.out.println("\n--- 3. Java Arrays ---");
        int[] numbers = {1, 2, 3, 4, 5}; // Topic: Declaration and Initialization (Lecture 2A, Slide 6)
        System.out.println("Array element at index 2: " + numbers[2]);
        System.out.println("Array length: " + numbers.length); // Topic: Array Size (Lecture 2A, Slide 6)

        // --- Topic: ArrayLists (Lecture 2A, Slide 12) ---
        System.out.println("\n--- 4. Java ArrayList ---");
        ArrayList<String> names = new ArrayList<>(); // Topic: ArrayLists Can Hold Any Object (Wrapper Classes) (Lecture 2A, Slide 14)
        names.add("Alice"); // add() method (Lecture 2A, Slide 11)
        names.add("Bob");
        System.out.println("ArrayList: " + names);
        System.out.println("Element at index 0: " + names.get(0)); // get() method (Lecture 2A, Slide 11)

        // --- Topic: Linked Lists in Java (Lecture 2B, Slide 27) ---
        System.out.println("\n--- 5. Java LinkedList ---");
        LinkedList<Double> scores = new LinkedList<>(); // Java's LinkedList is a Doubly-Linked List (Lecture 2B, Slide 28)
        scores.add(85.5);
        scores.addFirst(92.0); // addFirst() method (Lecture 2B, Slide 29)
        System.out.println("LinkedList: " + scores);
        System.out.println("First score: " + scores.getFirst()); // getFirst() method (Lecture 2B, Slide 29)

        // --- Topic: The Stack Data Structure (Lecture 4A, Slide 5) ---
        System.out.println("\n--- 6. Java Stack (LIFO) ---");
        Stack<Character> charStack = new Stack<>(); // Topic: The Java Stack Class (Lecture 4A, Slide 17)
        charStack.push('A'); // push() operation (Lecture 4A, Slide 10)
        charStack.push('B');
        System.out.println("Stack top (peek): " + charStack.peek()); // peek() operation (Lecture 4A, Slide 10)
        System.out.println("Popped: " + charStack.pop()); // pop() operation (Lecture 4A, Slide 10)
        System.out.println("Is stack empty? " + charStack.empty()); // empty() operation (Lecture 4A, Slide 10)

        // --- Topic: The Queue Data Structure (Lecture 4B, Slide 5) ---
        System.out.println("\n--- 7. Java Queue (FIFO) ---");
        Queue<Integer> intQueue = new LinkedList<>(); // Topic: The Java Queue Interface (Lecture 4B, Slide 19)
        intQueue.add(100); // enqueue operation (add to rear) (Lecture 4B, Slide 12)
        intQueue.add(200);
        System.out.println("Queue front (peek): " + intQueue.peek()); // peek() operation (Lecture 4B, Slide 12)
        System.out.println("Dequeued: " + intQueue.remove()); // dequeue operation (remove from front) (Lecture 4B, Slide 12)
        System.out.println("Is queue empty? " + intQueue.isEmpty()); // isEmpty() operation (Lecture 4B, Slide 12)

        // --- Topic: Review of Data Types and Control Structures (Lecture 1A, Slide 25) ---
        System.out.println("\n--- 8. Control Structures & Ternary Operator ---");
        int x = 5;
        // Topic: If Statements (Lecture 1A, Slide 27)
        if (x > 0) {
            System.out.println("x is positive.");
        }
        // Topic: For Loops (Lecture 1A, Slide 27)
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop iteration: " + i);
        }
        // Topic: Ternary Operators (Lecture 1A, Slide 28)
        String status = (x % 2 == 0) ? "even" : "odd";
        System.out.println("x is " + status);

        // --- Topic: Exception Handling (Lecture 1A, Slide 29) ---
        System.out.println("\n--- 9. Exception Handling ---");
        // Topic: try/catch Blocks (Lecture 1A, Slide 33)
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Topic: Exceptions in Java (ArithmeticException) (Lecture 1A, Slide 30)
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes."); // Topic: finally block (Lecture 1A, Slide 33)
        }

        // --- Topic: Introduction to Algorithms & Time Complexity (Lecture 3A, Slide 5, 9) ---
        System.out.println("\n--- 10. Algorithm & Complexity Concepts ---");
        int[] data = {10, 4, 8, 2, 6};
        int targetValue = 8;
        // Topic: Linear Search (Lecture 3A, Slide 8)
        int index = linearSearch(data, targetValue);
        System.out.println("Linear search for " + targetValue + ": found at index " + index);
        System.out.println("Linear search has O(n) time complexity."); // Topic: Linear Time O(n) (Lecture 3A, Slide 12)

        // --- Topic: Space Complexity (Lecture 3B, Slide 5) ---
        System.out.println("\n--- 11. Space Complexity Concepts ---");
        // Topic: Example: Sum of Array (O(1) space) (Lecture 3B, Slide 8)
        System.out.println("Summing an array uses O(1) auxiliary space.");
        // Topic: Example: Duplicating an Array (O(n) space) (Lecture 3B, Slide 9)
        System.out.println("Duplicating an array uses O(n) auxiliary space.");

        // --- Topic: Algorithm Design Techniques & Complexity Classes (Lecture 3B, Slide 13, 19) ---
        System.out.println("\n--- 12. Advanced Algorithm Concepts ---");
        System.out.println("Brute Force, Greedy, Divide & Conquer, Dynamic Programming are design techniques."); // Topic: Algorithm Design Approaches (Lecture 3B, Slide 14)
        System.out.println("P, NP, NP-Complete, NP-Hard are complexity classes."); // Topic: What are Complexity Classes (Lecture 3B, Slide 20)
        System.out.println("Approximation algorithms and heuristics are used for impractical problems (e.g., TSP)."); // Topic: Approximation Algorithms and Heuristics (Lecture 3B, Slide 28)
    }

    /**
     * Performs a simple linear search.
     * Topic: Common Algorithms - Linear Search (Lecture 3A, Slide 8)
     * @param arr The array to search.
     * @param target The value to find.
     * @return The index of the target, or -1 if not found.
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

// FileName: Point.java
// Topic: Existing Objects (Lecture 1B, Slide 6)
// Simplified Point class for demonstration.

/**
 * Represents a location in (x,y) coordinate space.
 * Topic: The Point Class - Link (Lecture 1B, Slide 7)
 */
class Point {
    int x;
    int y;

    /**
     * Constructs and initializes a point at the specified (x,y) location.
     * Topic: Constructor - Point(int x, int y) (Lecture 1B, Slide 7)
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Moves this point to the specified location.
     * Topic: Method - move(int x, int y) (Lecture 1B, Slide 8)
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of this point.
     * Topic: Method - toString() (Lecture 1B, Slide 8)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// FileName: MyCustomClass.java
// Topic: Build Your Own Objects in a Class (Lecture 1B, Slide 11)
// Simplified custom class for demonstration.

/**
 * A custom class to demonstrate building and using objects.
 * Topic: Class Declaration (Lecture 1B, Slide 12)
 */
class MyCustomClass {
    private int age;
    private String name;
    private static int count = 0; // Topic: Static Fields and Methods (Lecture 1B, Slide 12)

    /**
     * Constructor for MyCustomClass.
     * Topic: Constructors (Lecture 1B, Slide 12)
     */
    public MyCustomClass(int age, String name) {
        this.age = age;
        this.name = name;
        count++; // Increment static counter for each new object.
    }

    /**
     * Displays the information of this custom object.
     * Topic: Instance Methods (Lecture 1B, Slide 13)
     */
    public void displayInfo() {
        System.out.println("Custom Object: Name=" + name + ", Age=" + age);
    }

    /**
     * Returns the total count of MyCustomClass objects created.
     * Topic: Static Methods & Fields (Lecture 1B, Slide 13)
     */
    public static int getCount() {
        return count;
    }
}
