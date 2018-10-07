# Casting
```
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
// "/".equals(stringRep.substring(1))  --> null safe-er (... not super null safe though...)


# Debugging Tool in IntelliJ
TODO: write about debugging



---
GIT speedup: git add .;git commit -m "review comment: constructors in abstract classes";git push
Markdown -> HTML:   https://dillinger.io/
Tables:             https://www.tablesgenerator.com/markdown_tables
Reliable sites: mkyong, baeldung
Note: When dealing with finance/money - leave values as integers, and when displaying, divide by 100.
---



---
Remember: avoid checked exception - always wrap in (preferably your own implementation of a) RuntimeException.
a method declaration that throws BlahException is a sign that you're doing something wrong!
checked exception: caught as low as possible
unchecked can be causght close to main level.

HW: 10 Questions about computing.

1. How much JS should I know? -> node, npm
1. Closures/inner functions
1. ports and sockets
1. S SH
1. REST APIs
1. When would you avoid using an external library
1. When will you adopt Java 11? http://jdk.java.net/

```javascript
function fish() {
    var a = "hello"
    function dog() {
        console.log(a)
    }
    someOtherObject.doStuff(dog) //not invoking dog, just passing the function itself
}
```


CSV -> JSON online converter



### Q: What's the difference between an interface and an abstract class?
#### interface: To implement a contract by multiple unrelated objects
An interface is a contract: The person writing the interface says, "hey, I accept things looking that way", and the person using the interface says "OK, the class I write looks that way".
An interface is an empty shell. There are only the signatures of the methods, which implies that the methods do not have a body. The interface can't do anything. It's just a pattern.
Consider using interfaces if :
You expect that unrelated classes would implement your interface. For example,many unrelated objects can implement Serializable interface.
You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.
You want to take advantage of multiple inheritance of type.
interface provides "has a" capability for classes.
#### abstract class: To implement the same or different behaviour among multiple related objects
Consider using abstract classes if :
You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields.
abstract class establishes "is a" relation with concrete classes.


https://en.wikipedia.org/wiki/Anti-pattern


### Lambda Expressions

```
(n) -> n*n
```
parameters required by the expression -> the actions of the lambda expression
“n becomes n\*n”, or “n becomes n squared”.


Q2) You can pretty safely ignore getters/setters for pojos, built-in Java interfaces, and the mention of the Main class. Also, let's keep arrows super simple for now, only indicating what calls what (not relationships between classes)

Q3) where/when do you add backlog requirements - specific branch?

Q4) Not sure how to deal with:
Let's be explicit about how the application knows it's a transaction, and not a report or even gibberish.

An introductory note to a diagram is not neccessary - treat the image as text.

Reply to the individual comment, not global comment.

Timeboxing: investigations


Q0) How is this choice made?
When `Main` is called, it starts the `Application` class, where a choice mey be made to create a `transaction` or a `report` using the eponymous public methods.


Q1) Note that the design phase is where you have the power to make decisions, and they should be made at this stage rather than in development. Be assertive. If there's something you don't like about the current design of the application then re-write it. You don't have to stick to what's already been done (within reason, of course).
Don't like the class names? Change them. Don't like the way we've structured the data model? Change it.
Let's avoid any temporal references (e.g. 'future sprints' etc) in designs as the time of implementation and design could be months apart. When designing we instead mention that feature X is out of scope for this design.

Tradeoff between: `What I want it to do` vs `this sprint`.
--> out of scope for this design


As the application develops, the future commands might be:

| Request                               | CLI command                                                                   |
|:--------------------------------------|:------------------------------------------------------------------------------|
| Open new account:                     | $java moneymaker -accnew <username> <DOB> <address> <contact details>         |
| Delete existing account:              | $java moneymaker -accdelete <id> <username>                                   |
| Edit account details                  | $java moneymaker -accedit <id> <description> <field to update> <updated info> |
| Report: last 10 transactions          | $java moneymaker -report10 <id>                                               |
| Report: last months' transactions     | $java moneymaker -reportmonth <id>                                            |
| Report: transactions between dates    | $java moneymaker -reportdates <id> <start date> <end date>                    |
| Report: all transactions              | $java moneymaker -reportall <id>                                              |
| Report: search by description keyword | $java moneymaker -reportsearchkw <id> <keyword>                               |




## Check contents of directory and sub-directories:

```java
void checkFile() {
    File curDir = new File(".");
    getAllFiles(curDir);
}

private static void getAllFiles(File curDir) {
    File[] filesList = curDir.listFiles();
    for (File f : filesList) {
        if (f.isDirectory())
            System.out.println(f.getName());
        if (f.isFile()) {
            System.out.println(f.getName());
        }
    }
}
from: https://stackoverflow.com/questions/15482423/how-to-list-the-files-in-current-directory
```

- The thing (class/object) that relies on the dependency should only ask for an abstraction.
- whoever wants to use this thing needs to specify the implementation of the abstraction.
- the abstraction is ideally an interface.
- Coding to interfaces.


PO - product owner
