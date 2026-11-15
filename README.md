# Book With Us

A Java desktop application (Swing GUI) for booking travel services. Users create an account, log in, and build bookings made of hotels, flights, and car rentals. Everything is saved to a file, so accounts and bookings are still there the next time the program runs.

---

## Key Features

- **Sign up and log in** with input validation (email must contain `@`, password must be at least 8 characters with a capital letter)
- **Make a booking** with up to 3 services: hotel, flight (domestic or international), and car rental
- **Automatic pricing** by service type, with extras applied automatically:
  - Hotel: regular or suite room, priced per night
  - Flight: economy, business, or first class, plus an international fee and a visa check
  - Car rental: regular or luxury, priced per day, plus a car tax on the booking
- **Modify a booking** by adding a service or deleting one (service IDs and the total price update automatically)
- **Confirm, cancel, or delete** a booking
- **Booking history** showing every booking with its status, services, and total price
- **Persistent data:** users and their bookings are saved to `users.dat` and loaded on startup

---

## Skills Used

### Object-Oriented Programming
- **Inheritance:** `Hotel`, `Flight`, and `CarRental` extend the abstract class `Service`, and `internationalFlights` extends `Flight`
- **Polymorphism:** each service implements its own `calculateCost()`, and a booking totals its services through the shared type
- **Abstraction and interfaces:** the abstract `Service` class and the `payable` interface
- **Composition:** a `Booking` contains `Service` objects, and a `User` contains `Booking` objects
- **Copy constructors** so a booking stores its own copy of each service
- **Encapsulation:** private fields with getters and setters

### Data Structures and Algorithms
- A **custom singly linked list** (`SinglyLinkedList`) that stores all users
- **Arrays with manual shifting** to delete bookings and services, then renumber the remaining IDs
- **Recursion** to calculate the total price of a booking

### Exception Handling
- A **custom exception**, `WeakPasswordException`, for passwords that fail the rules
- `try`/`catch` for invalid input and for file errors

### File Handling
- **Object serialization** (`ObjectOutputStream` / `ObjectInputStream`) to save and load users and their bookings

### GUI Programming
- **Java Swing** windows built with Eclipse WindowBuilder: frames, buttons, radio buttons, combo boxes, text fields, and dialogs
- **Event-driven programming** with `ActionListener`
- Input checks in the interface, with clear error messages for missing selections and invalid numbers

---

## Project Structure

```
src/
├── core/    # BookWithUs (main), SinglyLinkedList, payable, WeakPasswordException
├── model/   # User, Booking, Service, Hotel, Flight, internationalFlights, CarRental
└── ui/      # Swing frames: sign in, sign up, services, booking options, history, ...
```

---

## How to Run

Requires JDK 8 or newer. From the project root:

```bash
javac -d out $(find src -name '*.java')
java -cp out core.BookWithUs
```

On Windows PowerShell:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src).FullName
java -cp out core.BookWithUs
```

You can also open the project in Eclipse and run `core/BookWithUs.java`. The program creates `users.dat` in the folder it runs from.
