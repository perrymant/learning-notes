# Generics

With `generics`, you tell the compiler what types of objects are permitted in each collection. The compiler inserts casts for you automatically and tells you at compile time if you try to insert an object of the wrong type. This results in programs that are both safer and clearer, but these benefits come with complications.

A class or interface whose declaration has one or more *type parameters* is a *generic* class or interface.

A List interface can have a single type parameter, E, representing the element type of the list. The name of the interface is now List<E> (read “list of E”), but people often call it *List* for short. Generic classes and interfaces are collectively known as `generic types`.

Each generic type defines a set of *parameterized types*, which consist of the class or interface name followed by an angle-bracketed list of *actual type parameters* corresponding to the generic type’s formal type parameters. For example, List<String> (read “list of string”) is a parameterized type representing a list whose elements are of type String.

It is an unwritten convention that type parameter names are one character, and to use T to indicate that the parameter is a type, E to indicate that the parameter is an element, K to indicate that the parameter is a key, N to indicate the parameter is a number, and V to indicate that the parameter is a value.

`Unbounded wildcard types`: If you want to use a generic type but you don’t know or care what the actual type parameter is, you can use a question mark instead. For example, the unbounded wildcard type for the generic type Set<E> is Set<?> (read “set of some type”). It is the most general parameterized Set type, capable of holding any set.

## Generics: Terms and Examples

| Term                    | Example                          |
|-------------------------|----------------------------------|
| Parameterized type      | List<String>                     |
| Actual type parameter   | String                           |
| Generic type            | List<E>                          |
| Formal type parameter   | E                                |
| Unbounded wildcard type | List<?>                          |
| Raw type                | List                             |
| Bounded type parameter  | <E extends Number>               |
| Recursive type bound    | <T extends Comparable<T>>        |
| Bounded wildcard type   | List<? extends Number>           |
| Generic method          | static <E> List<E> asList(E[] a) |
| Type token              | String.class                     |

