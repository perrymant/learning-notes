Have you ever tried writing out a standalone "Hello World!" program in Java, away from an IDE, and instead on a piece of paper or a whiteboard? Go ahead and give it a go if you've never done it before. Go on. I dare you, I double dare you m... (you know what, I'm going to spare you the rest of the Pulp Fiction quote!) Writing it out by hand turns out to be quite a good bit of practice if you're new to Java. Furthermore, making sure you understand each and every term in this simple program is very important if you wish to use Java, as they lay the foundation for much of the concepts you will see in pretty much every Java program out there. Let's get stuck in and see if we can deconstruct each term in a meaningful manner. Let's start by taking a look at the program as a whole:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

If we analyse the program from a high-level, we notice that there are two code-blocks denoted by the curly brackets {}, which help to create "logically inseparable units of code" [Schildt, Java, A Beginner’s Guide, 5th Edition]. It's often noted that Java is overly verbose and is composed by a lot of `boilerplate` code, that is to say, template-like code that must be included for the desired code to run. In this example, the first two lines are boilerplate as they are not directly concerned with what we want to achieve - which is to simply display the phrase "Hello World!" to the person operating the computer, which is what the third line does. Part of the reason for this level of verbosity is due to the fact that Java is forcing you to adopt the `Object Oriented Programming` paradigm, in which a program seeks to represent the real-world as a set of `objects`.

Let's start by discussing the second term `class`. `class` is a reserved keyword in Java, and like all other reserved keywords, it must start with a lower case letter, but more importantly: it has a very specific purpose. A `class` serves as a blueprint for creating `objects`, and it will define their features (`attributes`) and what they can do (`behaviour`). To make a `class`, all we have to do is write the keyword `class` followed by the name of the class, and then we can add the attributes and behaviour inside the code-block which is contained within the curly brackets. Here's an example:

```java
public class Frog {

}
```
```java
public class Fly {

}
```
We've just made a `Frog class` and a `Fly class`! (Notice the initial capital letter - another Java naming convention that we must adhere to for `class names`.)

A class is made up of:
- Class name
- Class body within curly brackets {}
- Keywords
- Modifiers



You might hear a description such as: "A class is a type, specifically a reference type". OK, but what's a type you ask?
"An interface is a type. A primitive is a type. An array is a type."

default (package private), public, protected and private
            │ Class │ Package │ Subclass │ Subclass │ World
            │       │         │(same pkg)│(diff pkg)│
────────────┼───────┼─────────┼──────────┼──────────┼────────
public      │   +   │    +    │    +     │     +    │   +
────────────┼───────┼─────────┼──────────┼──────────┼────────
protected   │   +   │    +    │    +     │     +    │
────────────┼───────┼─────────┼──────────┼──────────┼────────
no modifier │   +   │    +    │    +     │          │
────────────┼───────┼─────────┼──────────┼──────────┼────────
private     │   +   │         │          │          │

 + : accessible         blank : not accessible







- HelloWorld is a `valid Java qualified name`

System is a `final` class from the `java.lang` package, .
It turns out that there are three packages that are automatically imported into a Java project: First, the package with no name. Second, the `java.lang` package. And third, the current package (the package in which the current file is defined).
`System` is a `class`, a clue for why this is the case comes from the naming convention that states that all classes should start with a capital letter.
`out` is a `field`
`println()` is a `method`, this can be easily spotted because all methods have `()` parenthesis behind the method name.


out is a class variable of type PrintStream declared in the System class.

println is a method of the PrintStream class.
```java
class System {
  public static final PrintStream out;
  //...
}
```
the Prinstream class belongs to java.io package
```java
class PrintStream{
public void println();
//...
}
```
