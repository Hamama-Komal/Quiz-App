package com.example.oopquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.oopquiz.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;
    ArrayList<ModelClass> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String key = getIntent().getStringExtra("Key");


        list = new ArrayList<>();

        // Encapsulation Questions
        if (key.equals("Encapsulation")) {
            list.add(new ModelClass("1. What is Encapsulation in Java? Why is it called Data hiding? ", "Ans: The process of binding data and corresponding methods (behavior) together into a single unit is called encapsulation in Java.\n" + "\n" + "In other words, encapsulation is a programming technique that binds the class members (variables and methods) together and prevents them from being accessed by other classes, thereby we can keep variables and methods safes from outside interference and misuse.\n" + "\n" + "If a field is declared private in the class then it cannot be accessed by anyone outside the class and hides the fields within the class. Therefore, Encapsulation is also called data hiding.\n" + "\n"));
            list.add(new ModelClass("2. What are the important features of Encapsulation?", "Ans: Encapsulation means combining the data of our application and its manipulation in one place. It allows the state of an object to be accessed and modified through behavior. It reduces the coupling of modules and increases the cohesion inside them" + "\n"));
            list.add(new ModelClass("3. What is the advantage of Encapsulation?", "Ans: There are the following advantages of encapsulation in Java. They are as follows:\n" + "\n" + "The encapsulated code is more flexible and easy to change with new requirements.\n" + "It prevents the other classes to access the private fields.\n" + "Encapsulation allows modifying implemented code without breaking other code who have implemented the code.\n" + "It keeps the data and codes safe from external inheritance. Thus, Encapsulation helps to achieve security.\n" + "It improves the maintainability of the application." + "\n"));
            list.add(new ModelClass("4. What are the main benefits of using encapsulation in Java?", "Ans: The main benefits of using encapsulation are:\n" + "The main benefit of encapsulation is the ability to modify the implemented code without breaking the others code who have implemented the code.\n" + "It also provides us with maintainability, flexibility, and extensibility to our code.\n" + "The fields of a class can be made read-only or write-only.\n" + "A class can have total control over what is stored in its fields." + "\n"));
            list.add(new ModelClass("5. How to achieve encapsulation in Java? Give an example.", "Ans: There are two key points that should be kept in mind to achieve the encapsulation in Java. They are as follows:\n" + "\n" + "Declare the variable of the class as private.\n" + "Provide public setter and getter methods to modify the values of variables.\n" + "Let’s understand it with the help of an example program.\n" + "\n" + "public class EncapsulationTest{\n" + " private String name; \n" + " private String idNum; \n" + " private int age; \n" + "\n" + "public int getAge() { \n" + "   return age; \n" + "} \n" + "public String getName() { \n" + "   return name; \n" + "} \n" + "public String getIdNum() { \n" + "    return idNum; \n" + "} \n" + "public void setAge( int newAge) { \n" + "    age = newAge; \n" + "} \n" + "public void setName(String newName) { \n" + "    name = newName; \n" + "} \n" + "public void setIdNum( String newId) { \n" + "    idNum = newId; \n" + "  } \n" + "}" + "\n"));
            list.add(new ModelClass("6. What is data hiding in Java?", "Ans: An outside person cannot access our internal data directly or our internal data should not go out directly. This oops feature is called data hiding n Java. After validation or authentication, the outside person can access our internal data." + "\n"));
            list.add(new ModelClass("7. How to achieve Data hiding programmatically?", "Ans: By declaring data members (variables) as private, we can achieve or implement data hiding. If the variables are declared as private in the class, nobody can access them from outside the class.\n" + "\n" + "The biggest advantage of data hiding is we can achieve security." + "\n"));
            list.add(new ModelClass("8. What is a Tightly encapsulated class in Java?", "Ans: If each variable is declared as private in the class, it is called tightly encapsulated class in Java. For tightly encapsulated class, we are not required to check whether class contains getter and setter method or not and whether these methods are declared as public or not." + "\n"));
            list.add(new ModelClass("9. What is the difference between Abstraction and Encapsulation?\nOr, how abstraction is different from encapsulation in Java?", "Ans: There are the following differences between Abstraction and Encapsulation:\n" + "\n" + "a) Abstraction solves the problem at the design level whereas encapsulation solves the problem at the implementation level.\n" + "\n" + "b) Abstraction is implemented in Java using Interface and Abstract class whereas encapsulation is implemented using private and protected access modifiers.\n" + "\n" + "c) Abstraction is used to hide the unwanted data and giving relevant data whereas encapsulation is used for hiding data and code in a single unit to prevent access from outside.\n" + "\n" + "d) The real-time example of Abstraction is TV Remote Button whereas the real-time example of Encapsulation is medical medicine." + "\n"));
            list.add(new ModelClass("10. Can we achieve abstraction without encapsulation in Java?", "Ans: Yes, we can achieve abstraction without encapsulation because both are different things and different concepts" + "\n"));
        }
        // Inheritance
        if (key.equals("Inheritance")) {
            list.add(new ModelClass("1. What is Inheritance in Java?", "Ans: The technique of creating a new class by using an existing class functionality is called inheritance in Java. In other words, inheritance is a process where a child class acquires all the properties and behaviors of the parent class." + "\n"));
            list.add(new ModelClass("2. Why do we need to use inheritance?", "Ans: Inheritance is one of the main pillars of OOPs concept. Some objects share certain properties and behaviors. By using inheritance, a child class acquires all properties and behaviors of parent class.\n" + "\n" + "There are the following reasons to use inheritance in java.\n" + "\n" + "We can reuse the code from the base class.\n" + "Using inheritance, we can increase features of class or method by overriding.\n" + "Inheritance is used to use the existing features of class.\n" + "It is used to achieve runtime polymorphism i.e method overriding." + "\n"));
            list.add(new ModelClass("3. What is Is-A relationship in Java?", "Ans: Is-A relationship represents Inheritance. It is implemented using the “extends” keyword. It is used for code reusability." + "\n"));
            list.add(new ModelClass("4. What is super class and subclass?", "Ans: A class from where a subclass inherits features is called superclass. It is also called base class or parent class.\n" + "\n" + "A class that inherits all the members (fields, method, and nested classes) from other class is called subclass. It is also called a derived class, child class, or extended class." + "\n"));
            list.add(new ModelClass("5. How is Inheritance implemented/achieved in Java?", "Ans: Inheritance can be implemented or achieved by using two keywords:\n" + "\n" + "extends: extends is a keyword that is used for developing the inheritance between two classes and two interfaces.\n" + "implements: implements keyword is used for developing the inheritance between a class and interface." + "\n"));
            list.add(new ModelClass("6. Write the syntax for creating the subclass of a class?\n", "Ans: A subclass can be created by using the “extends” keyword. The syntax for declaring a subclass of class is as follows:\n" + "class subclassName extends superclassName\n" + "{\n" + "  // Variables of subclass\n" + "  // Methods of subclass\n" + "}\n" + "where class and extends are two keywords." + "\n"));
            list.add(new ModelClass("7. Which class in Java is superclass of every other class?", "Ans: In Java, Object class is the superclass of every other class." + "\n"));
            list.add(new ModelClass("8. Are constructor and instance initialization block inherited to subclass?", "Ans: No, constructor and instance initialization block of the superclass cannot be inherited to its subclass but they are executed while creating an object of the subclass." + "\n"));
            list.add(new ModelClass("9. Can a class extend itself?", "Ans: No, a class cannot extend itself." + "\n"));
            list.add(new ModelClass("10. Can we assign superclass to subclass?", "Ans: No." + "\n"));
        }
        // Abstraction
        if (key.equals("Abstraction")) {
            list.add(new ModelClass("1. What is Abstraction in Java?", "Ans: Abstraction in Java is a technique by which we can hide the data that is not required to users. It hides all unwanted data so that users can work only with the required data."));
            list.add(new ModelClass("2. How to achieve or implement Abstraction in Java?", " Ans: There are two ways to implement abstraction in java. They are as follows:\n" + "\n" + "a) Abstract class (0 to 100%)\n" + "b) Interface (100%)"));
            list.add(new ModelClass("3. What is Abstract class in Java? How to define it?", "3. What is Abstract class in Java? How to define it?" + "\n"));
            list.add(new ModelClass("4. What is the difference between abstract class and concrete class?", "Ans: There are mainly two differences between an abstract class and concrete class. They are:\n" + "\n" + "a) We cannot create an object of abstract class. Only objects of its non-abstract (or concrete) sub classes can be created.\n" + "\n" + "b) It can have zero or more abstract methods that are not allowed in a non-abstract class (concrete class)." + "\n"));
            list.add(new ModelClass("5. What is Abstract in Java?", "Ans: Abstract is a non-access modifier in java that is applicable for classes, interfaces, methods, and inner classes." + "\n"));
            list.add(new ModelClass("6. Can abstract modifier applicable for variables?", "Ans: No." + "\n"));
            list.add(new ModelClass("7. What is Abstract method in Java?", "Ans: A method which is declared with abstract modifier and has no implementation (means no body) is called abstract method in java.\n" + "\n" + "It does not contain any body. It has simply a signature declaration followed by a semicolon. It has the following general form as given below.\n" + "\n" + "Syntax: \n" + "       abstract type MethodName(arguments); // No body\n" + "\n" + "For example:\n" + "      abstract void msg(); // No body." + "\n"));
            list.add(new ModelClass("8. Can an abstract method be declared as static?", "Ans: No." + "\n"));
            list.add(new ModelClass("9. Can an abstract method be declared with private modifier?", "Ans: No, it cannot be private because the abstract method must be implemented in the child class. If we declare it as private, we cannot implement it from outside the class." + "\n"));
            list.add(new ModelClass("10. When to use Abstract class in Java?", "Ans: An abstract class can be used when we need to share the same method to all non-abstract sub classes with their own specific implementations." + "\n"));
        }
        // Polymorphism
        if (key.equals("Polymorphism")) {
            list.add(new ModelClass("1. What is Polymorphism in Java OOPs?", "Ans: Polymorphism in java is one of the core concepts of object-oriented programming system. Polymorphism means “many forms” in Greek. That is one thing that can take many forms.\n" + "Polymorphism is a concept by which we can perform a single task in different ways. That is, when a single entity (object) behaves differently in different cases, it is called polymorphism.\n" + "\n" + "\n" + "In other words, if a single object shows multiple forms or multiple behaviors, it is called polymorphism." + "\n"));
            list.add(new ModelClass("2. What are the types of Polymorphism in Java?", "Ans: There are two types of polymorphism in java. They are:\n" + "\n" + "Static polymorphism (Compile time Polymorphism)\n" + "Dynamic polymorphism (Runtime Polymorphism)" + "\n"));
            list.add(new ModelClass("3. What are different ways to achieve or implement polymorphism in Java?", "Ans: Polymorphism in Java can be primarily achieved by subclassing or by implementing an interface. The subclasses can have their own unique implementation for certain features and can also share some of the functionality through inheritance." + "\n"));
            list.add(new ModelClass("4. How is Inheritance useful to achieve Polymorphism in Java?", "Ans: Inheritance represents the parent-child relationship between two classes and polymorphism take the advantage of that relationship to add dynamic behavior in the code (or to make the program more dynamic)." + "\n"));
            list.add(new ModelClass("5. What are the advantages of Polymorphism?\n" + "Or what is the use of polymorphism?", "Ans: There are the following advantages of polymorphism in java:\n" + "\n" + "a. Using polymorphism, we can achieve flexibility in our code because we can perform various operations by using methods with the same names according to requirements.\n" + "\n" + "b. The main benefit of using polymorphism is when we can provide implementation to an abstract base class or an interface." + "\n"));
            list.add(new ModelClass("6. What are the differences between Polymorphism and Inheritance in Java?", "Ans: The differences between polymorphism and inheritance in java are as follows:\n" + "\n" + "a. Inheritance represents the parent-child relationship between two classes. On the other hand, polymorphism takes the advantage of that relationship to make the program more dynamic.\n" + "b. Inheritance helps in code reusability in child class by inheriting behavior from parent class. On the other hand, polymorphism enables child class to redefine already defined behavior inside parent class.\n" + "Without polymorphism, it is not possible for a child class to execute its own behavior." + "\n"));
            list.add(new ModelClass("7. What is Compile time polymorphism (Static polymorphism)?", "Ans: A polymorphism where object binding with methods happens at compile time is called static polymorphism or compile-time polymorphism.\n" + "\n" + "In static polymorphism, the behavior of method is decided at compile-time based on the parameters or arguments of method." + "\n"));
            list.add(new ModelClass("8. How to achieve or implement static polymorphism in Java?", "Ans: Static polymorphism can be achieved by method overloading. Other examples of compile time polymorphism are constructor overloading and method hiding." + "\n"));
            list.add(new ModelClass("9. How Java compiler differentiate between methods in Compile time Polymorphism?", "Ans: During compilation, Java compiler differentiates multiple methods having the same name by their signatures." + "\n"));
            list.add(new ModelClass("10. What is Runtime Polymorphism (Dynamic Polymorphism)?", "Ans: A polymorphism where object binding with methods happens at runtime is called runtime polymorphism. In runtime polymorphism, the behavior of a method is decided at runtime.\n" + "\n" + "JVM (Java Virtual Machine) binds the method call with method definition/body at runtime and invokes the relevant method during runtime when the method is called. This happens because objects are created at runtime and the method is called using an object of the class." + "\n"));
        }
        /*list.add(new ModelClass("", "" + "\n"));
        list.add(new ModelClass("", "" + "\n"));*/


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        AdapterClass adapterClass = new AdapterClass(list);

        binding.recyclerView.setLayoutManager(linearLayoutManager);
        binding.recyclerView.setAdapter(adapterClass);


    }
}