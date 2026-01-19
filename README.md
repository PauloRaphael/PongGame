# 🎮 Pong Game: Logic & State Management

> **Classic Arcade Implementation in Java**
> *Stack: Java (JDK) · Swing · AWT · OOP Patterns*

This project is a robust implementation of the classic **Pong** game, developed to demonstrate proficiency in **Object-Oriented Programming (OOP)** and the management of real-time application life cycles (Game Loops). The architecture focuses on clear separation of concerns, high-performance state handling, and precise physics collision logic.

---

## 🏗️ System Architecture

The game follows a structure inspired by the **Model-View-Controller (MVC)** pattern, ensuring that physical logic, visual rendering, and user input capture operate in a harmonious and performant manner.

### Key Technical Components:

* **Game Loop & Multi-threading:** The `GamePanel` class implements `Runnable`, managing a dedicated thread for the main game loop. This ensures a consistent update rate of 60 "ticks" per second, regardless of rendering performance.
* **Collision Engine:** Utilizes the native Java `Rectangle` class to detect intersections between the `Ball` and the `Paddle` objects. The collision logic includes dynamic velocity adjustments, increasing difficulty as the game progresses.
* **Event-Driven Input:** Asynchronous keyboard input management using `KeyAdapter`, allowing for precise and responsive control for multiple players simultaneously.

---

## 🛠️ Tech Stack & Patterns Applied

* **Core Language:** Java (Strongly Typed Logic).
* **Graphics & UI:** `javax.swing` for window management and `java.awt` for 2D graphics rendering and geometric shape manipulation.
* **Applied OOP Fundamentals:**
* **Encapsulation:** Managing critical game states, such as scores and movement vectors, within private fields.
* **Inheritance:** Extending the `Rectangle` class to provide ready-made geometric functionality for game entities like paddles and the ball.
* **Dynamic Randomization:** Implementation of `java.util.Random` to ensure each round starts with unpredictable ball trajectories.



---

## 🚀 How to Run

### Prerequisites

* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (Version 8 or higher).

### Installation and Execution

1. **Clone the repository:**
```bash
git clone https://github.com/PauloRaphael/PongGame.git

```


2. **Compile the source files:**
```bash
javac *.java

```


3. **Launch the application:**
```bash
java PongGame

```
