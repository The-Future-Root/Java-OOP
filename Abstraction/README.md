Abstraction is the process of hiding internal details and showing only the essential features of an object.
In Java, this is achieved using abstract classes and interfaces.

Real-world analogy:

You use a payment interface in an app (like PayTM or Razorpay), but you don’t need to know how the API processes UPI or card payments internally.

Abstract Class:
An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without implementation) as well as fully implemented methods.

It serves as a partial blueprint for other classes.

Interface:
An interface is a completely abstract type in Java that defines a set of method signatures (contracts) that implementing classes must define.

It is used to specify behavior that multiple unrelated classes can adopt.
Supports multiple inheritance.

Abstract Method:
An abstract method is a method declared without a body, meant to be overridden in a subclass or implementing class.

Must be inside an abstract class or an interface - Forces subclasses to provide a concrete implementation.

