package org.example;

 class Person {
    private String firstname;
    private String lastName;
    private int age;
    private String gender;
    private boolean isMarried;
    private int birthYear;


    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String gender, boolean isMarried, int birthYear) {
        this(firstname, lastName, age);
        this.gender = gender;
        this.isMarried = isMarried;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}

 class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Person Test Cases
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        Person person2 = new Person("Jane", "Smith", 18, "Female", false, 2006);
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());

        // Wall Test Cases
        Wall wall = new Wall(5, 4);
        System.out.println("Area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());
    }
}
