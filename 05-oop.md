# 4 Pillars of OOP
- Abstraction, polymorphism, inheritance & encapsulation.
Inheritance: "A is-a B"
Polymorphism: One name, many forms. Method overloading is an example of polymorphism.
polymorphism can be divided inso early/static (like Method overloading) and late/dynamic binding (like inheriting a method).

# Extending classes: Abstract classes and Interfaces
## *`Abstract classes:`*
- keyword <<abstract>> is added to the class
- Superclasses that are meant to be extended by other classes (other classes can inherit from that class)
- you can't instantiate them (the construction must be done through the subclasses)
*Subtlety: You CAN have a constructor in an abstract class, but it is only invoked if you call super(arg1, arg2, ...) in a child constructor.*
- as soon as there is one abstract method - the class must become abstract.
- the abstract methods have no braces, no implementation, and just ends in a semicolon.
- a partially completed class
- If you want to make use of a sublass then you must have a subclass that implements it.
- Subclasses must conform to the contracts set up by the abstract class
- the abstract methods in the abstract class must be implemented as child classes (compile time safety) ...unless the children too are abstract.
- when you know the methods, but you might not know how they are to be implemented
- cannot be marked as final
- in UML, abstract classes and abstract methods are in *italic*
- Prefer using interfaces over abstract classes where possible.
```java
public class SuperClass {
    public int getNb() {
         //specify what must happen
        return 1;
     }

     public int getNb2() {
         //specify what must happen
        return 2;
     }
 }

 public class SubClass extends SuperClass {
      //you can override the implementation
      @Override
      public int getNb2() {
        return 3;
     }
 }
```

## `Interfaces:`
- keyword <<interface>> is used instead of class
- must be public or package access scope
- you cannot create an instance of an interface
- therefor, no constructor
- A contract that all the methods in an interface will be implemented
- A hierarchy of interfaces can be created
- a class can implement as many interfaces as needed
- interfaces can implement any number of interfaces.
- Interface naming convention: start with Can-, end with -able
- recommended not to make interfaces with constants. (put the final constants in a class of constants)
```java
public interface ExampleInterface {
    public void doAction();
    public String doThis(int number);
 }

 public class sub implements ExampleInterface {
     public void doAction() {
       //specify what must happen
     }

     public String doThis(int number) {
       //specfiy what must happen
     }
 }
```

```java
public class Messages {
    public static class Format {
        public static final String STRING_IS_EMPTY = "String Contents: Empty String";
        public static final String NO_RESULTS = "No results";
    }
}
// to access the contants call Messages.Format.STRING_IS_EMPTY
```

- All fields in an interface are implicitly public, static, and final - their use is redundant.
- The general (incomplete) syntax for declaring an interface is:
<modifiers> interface <interface-name> {
        Constant-Declaration
        Method-Declaration
        Nested-Type-Declaration
}

# Implementing vs Extending
`implements` means you are using the elements of a Java Interface in your class.
`extends` means that you are creating a subclass of the base class you are extending.
- A class can only "implement" an interface.
- A class only "extends" a class.
- An interface can extend another interface.
- A class can only extend one other class.
- A class can implement several interfaces.

package inheritance;

```java
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.speak();
        dog.speak();

    }
}
```

## Casting
```java
class A {}
class B extends A{
    public void methodThatExistsOnlyOnB() {
    }
}
class Whatev {
    public static void main(String[] args) {
        A obj = new B();
        //....
        if (obj instanceof B) {
            ((B) obj).methodThatExistsOnlyOnB();
        }
    }
}
```
