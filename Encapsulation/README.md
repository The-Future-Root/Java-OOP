Encapsulation is the process of wrapping data (fields) and methods (functions) together into a single unit — typically a class — and restricting direct access to some of the object's components.

It promotes data hiding, so an object's internal state cannot be changed directly from outside its class.

In Java, access modifiers are keywords used to set the visibility or access level of classes, constructors, methods, and variables. They help implement encapsulation by restricting access to the internal workings of a class.

default:

Also called package-private
Access Level: Within the same package
Use Case: For helper classes/methods that should not be accessed outside the package.

public: 

Access Level: Accessible from anywhere.
Use Case: For APIs, entry points (public static void main), or shared utilities.

private:

Access Level: Only within the same class.
Use Case: To hide internal data and prevent direct access from outside.

protected:

Access Level: Within the same package and in subclasses (even in other packages via inheritance).
Use Case: To allow subclasses to access parent class members.

Best Practices:

-- Use private for all fields, then expose them via getters/setters.
-- Use public methods to expose intended behavior.
-- Use protected for extensibility in subclass hierarchies.
-- Avoid default access unless working within a tight package scope.