# Learning Java

*First sessions have been partly documented and are available at: http://learning-java.surge.sh/*

#### Declaration and assignment:
```java
int num1;           // Declaration of a variable num1
num1 = 50;          // Assignment
int num2 = 100;     // Declaration of variable num3 and its initialization
```

```java
//The following snippet of code prints all elements of an int array numList:
int[] numList = {10, 20, 30, 40};
for(int num : numList) {
    System.out.println(num);
}
```

## OOP Design
Look around you...
The real-world objeccts in the area around you (such as computer, clock, mirror, air-conditioner, shelves, door, etc.) have two major charateristics:
- state (qualities, how it looks) ==> in OOP: stores its state in fields
- behaviour (things it can do)    ==> in OOP: expose behaviour in methods

Classes are the basic units of programming in the object-oriented paradigm, and are used as templates to create objects.
A class in Java may consist of two components:
- Fields
- Methods (and Constructors)

#### The main() method serves as the entry point for a Java application:
```java
public static void main(String[] args) {
        // Method body goes here
}
```

Fields and methods are also known as members of the class. Classes and interfaces can also be member variables of a class.

*It is a convention (not a rule or a requirement) in java to start a class name with an uppercase letter and capitalize the subsequent words (`CamelCase`), for example, Human, Table, SumOfTriangles, etc. the name of fields and methods should start with a lowercase letter and the subsequent words should be capitalized (`pascalCase`), for example, name, firstName, maxDebitAmount, etc.*


#### The general syntax for declaring a class in Java is:
```java
<<modifiers>> class <<class name>> {
    // Body of the class goes here
}
```

### `modifiers`
| Access Level for Class Member | Accessibility                             |
|-------------------------------|-------------------------------------------|
| private                       | Only within the same class                |
| package-level                 | In the same package                       |
| protected                     | Same package or descendant in any package |
| public                        | Everywhere                                |

*It's important to note that these are cascading permissions. E.g. package-private (not package-level btw) is also accessible from within the same class. Similarly, protected is also visible by classes in the same package, etc.*

Fields of a class represent properties (also called attributes) of objects of that class. Suppose every object of human class has two properties: a name and a gender. The human class should include declarations of two fields: one to represent name and one to represent gender.

*The fields are declared inside the body of the class. The general syntax to declare a field in a class is:*
```java
<<modifiers>> class <<class name>> {
    // A field declaration
    <<modifiers>> <<data type>> <<field name>> = <<initial value>>;
}
```

```java
// Human.java
class Human {
    String name;
    String gender;
}
```

The Human class declares two fields: name and gender. Both fields are of the String type. Every instance (or object) of the Human class will have a copy of these two fields.

*Java lets you declare two types of fields for a class:*
- Class fields
- Instance fields

```java
class Human {
        String name;        // An instance variable
        String gender;      // An instance variable
        static long count;  // A static field because of the static modifier
}
```

A class variable is also known as a static field. An instance/member variable is also known as a non-static variable - or field.

*Create an instance of a class:*
```java
new <<Call to Class Constructor>>;
```

The new operator is followed by a call to the constructor of the class whose instance is being created. The new operator creates an instance of a class by allocating the memory on heap.
*I don't really need to worry about memory allocation at the moment because Java handles this with the garbage collector.*

*The following statement creates an instance of the Human class:*
```java
new Human();
```

When you do not add a constructor to a class, the Java compiler adds one for you. The constructor that is added by the Java compiler is called a `default constructor`. The default constructor accepts no arguments. The name of the constructor of a class is the same as the class name.

*The general syntax for a method declaration is of the form:*
```java
<<modifiers>> <<return type>> <<method name>> (<<parameters list>>) <<throws clause>> {
        // Body of the method goes here
}
```

TIP: Write the methods you wish you had - just pretend they exist. Write the method's name - then hotkey (opt + Return) to generate.

#### `this` keyword is a reference to the current instance of a class. It can be used only in the context of an instance.
```java
public class ThisTest1 {
        int varA = 555;
        int varB = varA;      // Assign value of varA to varB
        int varC = this.varA; // Assign value of varA to varC
}
```

#### A constructor is a named block of code that is used to initialize an object of a class immediately after the object is created.
- The structure of a constructor looks similar to a method.
- A constructor does not have a return type.
*The general syntax for a constructor declaration is:*
```java
<<Modifiers>> <<Constructor Name>>(<<parameters list>>){
        // Body of constructor goes here
}
```

*Pro tip: Don't ever throw exceptions in your constructor. It's a sign that the constructor is doing more than just setting up it's initial state. (e.g. making database connections).*

*Example:*
```java
public class Dog {
    // Constructor #1
    public Dog() {
        System.out.println("A dog is created.");
    }
    // Constructor #2
    public Dog(String name) {
        System.out.println("A dog named " + name + " is created.");
    }
}
// These obejects use different constructors
Dog dog1 = new Dog();
Dog dog2 = new Dog("Cupid");
```

#### Getters and Setters
- Accessors and Mutators/modifiers
```java
class Clock {
        String time;
        void setTime (String t) {   //setter
           time = t;
        }
        String getTime() {          //getter
           return time;
        }
}

class ClockTest{
   public static void main (String [] args) {
   Clock c = new Clock;
   c.setTime("12345")
   String today = c.getTime();
   System.out.println("time: " + today);
 }
}
```
