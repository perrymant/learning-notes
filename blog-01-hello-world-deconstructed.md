# Hello World! Deconstructed

Have you ever tried writing out a standalone "Hello World!" program in Java, away from an IDE, and instead on a piece of paper or a whiteboard? Go ahead and give it a go if you've never done it before. Go on. I dare you, I double dare you m... (you know what, I'm going to spare you the rest of the Pulp Fiction quote!) Writing it out by hand turns out to be quite a good bit of practice if you're new to Java. Furthermore, making sure you understand each and every term in this simple program is very important if you wish to use Java, as they lay the foundation for much of the concepts you will see in pretty much every Java program out there. Let's get stuck in and see if we can deconstruct each term in a meaningful manner, but also realise that there is a lot going on that you probably take for granted as well. Let's start by taking a look at the program as a whole:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

We can ennumerate and annotate each term to make reffering to the components more obvious:
![Annotated Code](https://github.com/perrymant/learning-notes/blob/master/assets/blog-01-hello-world-deconstructed/helloworld.png)

It's often noted that Java is overly verbose and is composed by a lot of `boilerplate` code, that is to say, template-like code that must be included for the desired code to run. In this example, the first two lines are boilerplate as they are not directly concerned with what we want to achieve - which is to simply display the phrase "Hello World!" to the person operating the computer, which is what the third line does. Part of the reason for this level of verbosity is due to the fact that Java is forcing you to adopt the `Object Oriented Programming` paradigm, in which a program seeks to represent the real-world as a set of `objects`.

## Term 2: `class`

This is a good point to discuss the second term `class`. `class` is a reserved keyword in Java, and like all other reserved keywords, it must start with a lower case letter, but more importantly: it has a very specific purpose. A `class` serves as a blueprint for creating `objects`, and it will define their features (`attributes`) and what they can do (`behaviour`). To make a `class`, all we have to do is write the keyword `class` followed by the name of the class, and then we can add the attributes and behaviour inside the code-block which is contained within the curly brackets. Here's are two examples:

```java
class Frog {

}
```

```java
class Fly {

}
```
We've just made a `Frog class` and a `Fly class`! Notice the initial capital letter - another Java naming convention that we must adhere to for `class names`. Also notice that the words used for classes should be nouns, as they describe either a person, entity, thing, or idea. You can work out from this that in our main example, we have a `class` called `HelloWorld`, indicated by the third term. In fact, not only is the class called `HelloWorld`, the file that this bit of code lives in **HAS** to be called `HelloWorld.java`. We'll see in a moment exactly why this has to be the case for our example, but typically, each file will just have one class in it, and the name of the file and the class must be the same (of course, the file will also include the .java extension). So with our `Frog` and `Fly` classes, the file and class structure will look like this:
```
+---Frog.java--------+     +---Fly.java------------------+
|                    |     |                             |
|  class Frog {      |     |  class Fly {                |
|      int eyes = 2; |     |      void iritateHuman() {  |
|                    |     |                             |
|  }                 |     |      }                      |
|                    |     |  }                          |
|                    |     |                             |
+--------------------+     +-----------------------------+
```
So you see how each class is contained in it's own file, and the class and filename are the same. This is useful because it keeps everything that is specific to the `Frog` in one place, and everything that is specific to the `Fly` in it's own place, which can help us out in the long run by making our overall program more navigatable and readable. I've also taken the liberty to give the `Frog` the attribute of two `eyes`, and I've given the `Fly` the `iritateHuman()` behaviour.

## Term 1: `public`

The first term in our main example is where things get a little trickier. A class has a `modifier`, which in our case is `public`. `public` is fairly self-descriptive in that it makes the class publicly availiable to other classes. If you're not sure what that means, then we need to examine

![Modifiers](https://github.com/perrymant/learning-notes/blob/master/assets/blog-01-hello-world-deconstructed/accessmod.png)
[credit](https://stackoverflow.com/a/215505)

An important thing to note is that a file may only have one `public class`.

Information hiding, or encapsulation

Packages are used for organising related classes .
To put a class in a package, you need to add the line
`package `*packagename*`;`
as the very first instruction in the source file. Typically you will see these in a format that has one or more identifiers separated by periods such as `java.util.random` This format for

![Modifiers](https://github.com/perrymant/learning-notes/blob/master/assets/blog-01-hello-world-deconstructed/iceberg.png)

When no named package statements are included in a source file, then the classes will be placed in the *default package*.

You might hear a description such as: "A class is a type, specifically a reference type". OK, but what's a type you ask?
"An interface is a type. A primitive is a type. An array is a type."

## Term 3: The name of the class
- HelloWorld is a `valid Java qualified name`.

## Term 4: Access modifier
We've seen the `public` access modifier applied to a class, but it can also be applied to fields and methods, as is the case here.

## Term 5: The `Static` keyword
The term `static` indicates that the method belongs to the class. This means that an instance of the object does not need to be created in order to run that method or access the static variables.

## Term 6: The `return type`
`void`: the absence of a return type.

## Term 7: The `main` method
The Java Virtual Machine (JVM) is the underlying entity on your computer that converts Java code into something meaningful that your computer can understand and run. In order to run a program, the JVM requires an entry point, or starting point The `main` method is the entry point for this Java program. You would not be able to start the HelloWorld program if

## Term 8: The `argument type`
The `main` method accepts a single argument, which is an array of strings. This `String[] args` is a mechanism that allows us to pass runtime information to the program, and we also refer to this as the command line arguments.

## Term 9: The `argument variable`
This `args` argument variable must be included as boilerplate, even though it isn't used within the method body. If we wanted to pass something into our program from an external location, and have the program use it, then we would need to modify the code, for example if we used the `program arguments` `John Smith` with the following code:
```java
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " " + args[1]);
        System.out.println("The args array contains: "+ Arrays.toString(args));
    }
}
```
it would would output:
```
Hello John Smith
The args array contains: [John, Smith]
```

## Term 10: The class `System`
Next we look at `System.out.println()`, which can be broken into 3 parts. `System` is a class (a clue for why this is the case comes from the naming convention that states that all classes should start with a capital letter) that is automatically included into all Java projects, and it belongs to the package called `java.lang`. It turns out that there are three packages that are automatically imported into a Java project: First, the package with no name. Second, the `java.lang` package. And third, the current package (the package in which the current file is defined). Furthermore, System is a `final` class, .

## Term 11: the field `out`
out is a class variable of type PrintStream declared in the System class. `out` is a `field`

## Term 12: The method `println()`
`println()` is a `method`, this can be easily spotted because all methods have `()` parenthesis behind the method name. `println()` is a method of the `PrintStream` class:
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

## Term 13: The string `"Hello World!"`
We've finally got here - this is the actual part of the program that we wanted to see all along, and ut took all the rest of the code to get us here. In Java, a `String` (notice the initial capital letter) is an `object` rather than a `primitive` (such as `int`, `boolean` and `double`), and is so commonly used that it's a little special. One thing that makes it special is that it's `immutable`, which means that once it has been created, a String object cannot be change. Normally, `objects` need to be instantiated in this way
```java
Frog frog = new Frog();
```
but javawith Strings, this is not neccessary (you can instantiate them like the above way, but that is rarely done), instead we can assign a String like this:
```
String variableName = "The String we want to store";
```
If you look at the `declaration` of the String class, you can see that under the hood, the implementation of a String is done using an array of characters, and that String objects have many methods available that the primitives do not have:
```java
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {
    /** The value is used for character storage. */
    private final char value[];
    ...
```

## How to run this from the command line?

The first step is to compile the program, which is done using the command `javac` followed by the name of the file we wish to compile. Upon successful compilation, we may run the program using the `java` command, followed by the name of the program we just compiled (no extension required this time.)

```bash
$ javac HelloWorld.java

$ java HelloWorld
Hello World
```
