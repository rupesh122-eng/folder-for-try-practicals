/*Example 1 : 
class and object */
/*class Student {
    String name;
    int age;

    public void getInfo () {
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }
}
public class OOPS {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Rupesh";
        s1.age = 18;
        s1.getInfo();
        
        // and we can create multiple object
        Student s2 = new Student();
        s2.name = "Ritik";
        s2.age = 17;
        s2.getInfo();
    }
}*/

/*Example 2 : 
class and object */
/*class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of the pen is " + this.color);
    }
}
public class OOPS {
    public static void main(String[] args) {
     
        Pen p1 = new Pen();
        p1.color = "blue";

        Pen p2 = new Pen();
        p2.color = "black";

        Pen p3 = new Pen();
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}*/

// CONSTRUCTOR --> Non - parameterized Constructor
/*class Student1 {
    String name;
    int age;

    Student1() {
        name = "Rupesh";
        age = 18;
        System.out.println("Name and age are " + this.name + " " + this.age);
    }
}

// Parameterized Constructor
class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;

                System.out.println("Name and age are " + this.name + " " + this.age);

    }
}

// Copy Constructor
class Student3 {
    String name;
    int age;

    Student3 (Student2 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class OOPS {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student2 s2 = new Student2("Ritik", 17);
        Student3 s3 = new Student3(s2);
    }
}*/

/* POLYMORPHISM --> Compiler Time Polymorphism and Runtime Polymorphism
Method Overloading */
/*public class OOPS {

    static class Studnet {
        String name;
        int age;

        public void displayInfo (String name) {
            System.out.println(name);
        }

        public void displayInfo (int age) {
            System.out.println(age);
        }

        public void displayInfo (String name, int age) {
            System.out.println(name);
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Studnet s1 = new Studnet();
        s1.name = "Rupesh";
        s1.age = 18;
        s1.displayInfo(s1.name, s1.age);
    }
}*/

/* INHERITANCE --> 
1. Single Inheritance */
/*class Shape {
    public void print() {
        System.out.println("Display area of shape ");
    }
}

class Triangle extends Shape {
    public void area (int h, int b) {
        System.out.println(0.5 * b * h);
    }
}
public class OOPS {
    public static void main(String[] args) {
        
        Triangle t = new Triangle();
        t.print();
        t.area(10,5);
        
    }
}*/

// 2. Multilevel Inheritance
/*class Shape {
    public void print() {
        System.out.println("Display area of shape ");
    }
}

class Triangle extends Shape {
    public void area (int h, int b) {
        System.out.println(0.5 * b * h);
    }
}

class Circle extends Triangle {
    int side;
}
public class OOPS {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.print();
        c.area(10,5);
        c.side = 5;
        System.out.println(c.side);
        
    }
}*/

// 3. Hierarchical Inheritance
/*class Shape {
    public void print() {
        System.out.println("Display area of shape ");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5 * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class OOPS {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        Circle c = new Circle();
        c.print();
        t.area(10, 5);
        c.area(10);

    }
}*/

// 4. Hybrid Inheritance
/*class Shape {
    public void print() {
        System.out.println("Display area of shape ");
    }
}

public class OOPS {

    public static void main(String[] args) {

        Shape s = new Shape();
        s.print();
    }
}*/

// Abstraction --> abstract
/*abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("This animal breathes air");
    }

    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class OOPS {

    public static void main(String[] args) {

        Chicken c = new Chicken();
        c.walk();
        c.breathe();
    }
}*/

// Abstraction --> interface (pure abstraction)
/*interface Animal {
    int eye = 2; // fixed or static

    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
    }
}*/

// Static
class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "New School";
    }
}

public class OOPS {

    public static void main(String[] args) {
        Student.school = "Parul University";
        Student s1 = new Student();
        s1.name = "Rupesh";
        System.out.println(s1.school);
    }
}