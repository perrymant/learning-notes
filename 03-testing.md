# Description of how I learned about unit testing
### TDD cycle           ==> fail, pass, refactor

After creating a class, use (cmd + shift + T) to create a test class. So far I have been using JUnit4 for testing.
*An initial test will look like this:*
```java
public void class <<TestName>> {
    @Test
    // Test goes here
}
```

*Important: tests must be public void*

### The JUnit Assert class provides the following methods:
| Method            | Function                                                              |
|-------------------|-----------------------------------------------------------------------|
| assertEquals      | Asserts that two objects (or primitives) are equal.                   |
| assertTrue        | Asserts that a statement is true.                                     |
| assertFalse       | Asserts that a statement is false.                                    |
| assertNull        | Asserts that an object reference is null.                             |
| assertNotNull     | Asserts that an object reference is not null.                         |
|  *uncommon assertions below*                                                              |
| assertSame        | Asserts that two object references point to the same instance.        |
| assertNotSame     | Asserts that two object references do not point to the same instance. |
| assertThat        | Asserts that an object matches the given conditions.                  |
| assertArrayEquals | Asserts that two arrays have the same items.                          |


A good convention is to name a test class with in the form `givenX_doY`:
```java
@Test
    void givenNullObject_NoResults() {
        Assertions.assertEquals(<<expected>>, <<actual>>);
    }
```

At the start of the test, create a `target` variable:
```java
<<Object type in class to test>> target = new <<Object type in class to test>>();
```
*For example:*
```java
@Test
public void canWriteAndGetJsonPath() {
    JsonPath target = new JsonPath();
    target.setJsonPath("number.value");
    String result = target.getJsonPath();
    Assertions.assertEquals("number.value", result);
}
```

*Make sure your tests are properly writen before you utilise them!
Trying to get the code to pass a bad test (unaware this might be the cause of EVERY SINGLE PROBLEM!) will drive you crazy!
In the following example, I'm trying to find the unique element in a array of type double. Notice that the answer should be `3.0`, but that the test asserts that it should be `1.0`!*
```java
 @Test
    public void FindUniqueElementTest() {
        assertEquals(1.0, FindUniqueElement.finder(new double[]{0.0, 0.0, 3.0, 0.0}), 0.0000000000001 );
    }
```

*Refactoring = amplify clarity of intent while minimizing duplication.*
Refactor after you have a passing test.
