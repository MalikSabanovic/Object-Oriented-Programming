/*package org.example;

import java.util.Scanner;
import java.util.Random;*/

//--------------------------------------------------------Lab 2 Task Solutions--------------------------------------------------------

//public class Main {

    /*public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void draw(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void draw2(int rows){
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void draw3(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }*/


    //public static void main(String[] args) {


        /*Task 1.*/

        /*Scanner sc = new Scanner(System.in);
        String password = "";

        while (!password.equals("1234")) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (password.equals("1234")) {
                System.out.println("Right!");
                System.out.println("Secret message is: gg!");
            } else {
                System.out.print("Incorrect, enter the password again: ");
            }
        }*/

        /*Task 2.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Second Number: ");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Third Number: ");
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum is: " + sum);*/

        /*Task 3.*/

        /*Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        while(true) {
            System.out.print("Enter a number: ");
            number=Integer.parseInt(sc.nextLine());

            if(number==0) {
                break;
            }else {
                sum+=number;
            }
        }
        System.out.println("The sum of the numbers is: "+sum);*/

        /*Task 4*/

        /*Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the last number: ");
        int lastNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Numbers between " + firstNumber + " and " + lastNumber + ":");


        if (firstNumber <= lastNumber) {
            int temp = firstNumber;
            while (temp <= lastNumber) {
                System.out.println(temp);
                temp++;
            }
        }
        else {
            int temp = firstNumber;
            while (temp >= lastNumber) {
                System.out.println(temp);
                temp--;
            }
        }*/

        /*Task 5.*/

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number= Integer.parseInt(sc.nextLine());

        System.out.println("Enter the power: ");
        int power= Integer.parseInt(sc.nextLine());

        int sum=0;
        for(int temp=0; temp<=power; temp++){
            sum +=Math.pow(number,temp);

        }
        System.out.println("The sum of the numbers is: "+sum);*/

        /*Task 6.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print out the text: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++){
            printText();
        }*/

        /*Task 7.*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw(number);*/

        /*Task 8.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw2(number);*/

        /*Task 9.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw3(number);*/

        /*Task 10.*/
        /*
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int targetNumber=rand.nextInt(101);
        int guess=-1;
        int attempts=0;

        while (guess != targetNumber){

            attempts++;

            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(sc.nextLine());

            if (guess < targetNumber) {
                System.out.println("The number is greater.");
            } else if (guess > targetNumber) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("Congratulations, your guess is correct!");
                System.out.println("It took you " + attempts + " guesses.");
            }

        }*/

    //}
//}

//--------------------------------------------------------Lab 3 Task Solutions--------------------------------------------------------

//Task 1.

/*package org.example;

import java.util.ArrayList;
import java.util.Collections;

 class DataStructures {
    public static void main(String[] args) {
        ArrayList<TaskItem> tasks = new ArrayList<>();


        Collections.addAll(tasks,
                new TaskItem(1,"Push lab code to GitHub", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED)
        );


        getAllObjects(tasks);
        getByStatus(tasks, Status.TO_DO);
        getById(tasks);
        getDescription(tasks);
    }


    public static void getAllObjects(ArrayList<TaskItem> tasks) {
        for (TaskItem task : tasks) {
            task.printInformation();
        }
    }


    public static void getByStatus(ArrayList<TaskItem> tasks, Status status) {
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                task.printInformation();
            }
        }
    }


    public static void getById(ArrayList<TaskItem> tasks) {
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= 2) {
                task.printInformation();
            }
        }
    }


    public static void getDescription(ArrayList<TaskItem> tasks) {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }
}


enum Status {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}


class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    // Constructor to initialize TaskItem
    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }


    public void printInformation() {
        System.out.println(
                "ID: " + taskId +
                        " Task Description: " + taskDescription +
                        " Task Status: " + taskStatus
        );
    }


    public int getTaskId() {
        return taskId;
    }


    public String getTaskDescription() {
        return taskDescription;
    }


    public Status getTaskStatus() {
        return taskStatus;
    }
}*/

//Task 2.

/*
package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
    class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private Connection connection = null;

    public DbConnect() {
        try {
            // Ensure MySQL driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Successfully connected to the database.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("MySQL JDBC Driver not found.", e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.", e);
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection successfully closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) throws SQLException {
        DbConnect database = new DbConnect();
        database.getAllTasks();
        database.getById(2);
        database.createNewTask(7, "Test.", Status.TO_DO);
        database.updateTaskName(2, "New description.");
        database.closeConnection();
    }

    public void getAllTasks() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM tasks"
        );
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void getById(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM tasks WHERE id = ?"
        );
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void createNewTask(int id, String task_description, Status task_status) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO tasks (id, task_description, task_status) VALUES (?, ?, ?)"
        );
        statement.setInt(1, id);
        statement.setString(2, task_description);
        statement.setString(3, task_status.name());

        int insertedRows = statement.executeUpdate();
        if (insertedRows > 0) {
            System.out.println("New task has been successfully created.");
        } else {
            System.out.println("Task has not been created.");
        }
    }

    public void updateTaskName(int id, String task_description) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "UPDATE tasks SET task_description = ? WHERE id = ?"
        );
        statement.setString(1, task_description);
        statement.setInt(2, id);
        int newTaskDescription = statement.executeUpdate();
        if (newTaskDescription > 0) {
            System.out.println("Task description has been succesfully updated.");
        } else {
            System.out.println("Task description was not updated.");
        }
    }

    enum Status{
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }

    public class TaskItem {
        private int taskId;
        private String taskDescription;
        private Status taskStatus;

        public TaskItem(int taskId, String taskDescription, Status taskStatus){
            this.taskId = taskId;
            this.taskDescription = taskDescription;
            this.taskStatus = taskStatus;
        }

        public void printInformation() {
            System.out.println(
                    "ID: " + taskId +
                            " Task Description: " + taskDescription +
                            " Task Status: " + taskStatus
            );
        }

        public int getTaskId() {
            return taskId;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public Status getTaskStatus(){
            return taskStatus;
        }
    }
}*/


//--------------------------------------------------------Lab 4 Task Solutions--------------------------------------------------------


//Task 1

/*package org.example;
import java.util.ArrayList;
import java.util.List;

    class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }


    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return name + "\n" + address;
    }
}
    class Student extends Person {
        private int credit;

        public Student(String name,String address){
            super(name,address);
            this.credit = 0;
        }
        public int getCredit() {
            return this.credit;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        public void study() {
            this.credit += 1;
        }

    }

    class Teacher extends Person {
        private double salary;

        public Teacher(String name, String address, double salary) {
            super(name, address);
            this.salary = salary;
        }


        @Override
        public String toString() {
            return super.toString() + "\nSalary: " + salary;  // Adds salary information
        }
    }

    public class Main {

        public static void printDepartment(List<Person> people) {

            System.out.println("Department Members:");

            for (Person person : people) {
                System.out.println(person);
                System.out.println();
            }
        }

        public static void main(String[] args) {

            List<Person> people = new ArrayList<Person>();
            people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
            people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

            printDepartment(people);
        }
    }*/

//Task 2

/*package org.example;

enum Fill {
    FILLED,
    NOT_FILLED
}


class Shape {
    private String color;
    private Fill filled;

    public Shape(String color, Fill filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public Fill getFilled() {
        return filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        if (filled == Fill.FILLED) {
            System.out.println("Filled");
        }else{
            System.out.println("Not filled");
        }
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, Fill filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
}


class Circle extends Shape {
    private double radius;
    private double PI = 3.141592653589793;

    public Circle(String color, Fill filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + calculateCircumference(radius));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Blue", Fill.FILLED, 4.0, 6.0);
        rectangle.displayInfo();

        System.out.println();

        Circle circle = new Circle("Red", Fill.NOT_FILLED, 5.5);
        circle.displayInfo();
    }
}*/


//Task 3

/*package org.example;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name, String address, int age, String country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return name + "\n" + address;
    }
}
class Student extends Person {
    private int credit;

    public Student(String name,String address,int age,String country) {
        super(name,address,age,country);
        this.credit = 0;
    }


    public int getCredit() {
        return this.credit;
    }

    @Override
    public String toString() {
        return super.toString(); // Uses Person's toString method
    }

    public void study() {
        this.credit += 1;
    }

}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, String address, double salary,int age,String country) {
        super(name, address, age, country);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;  // Adds salary information
    }
}

public class Main {
    public static void printDepartment(List<Person> people) {
        System.out.println("Department Members:");
        for (Person person : people) {
            System.out.println(person);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 4500, 18, "Finland"));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 21, "Finland"));

        printDepartment(people);
    }
}*/

//Task 4

/*package org.example;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String address;
    private int age;
    private String country;


    public Person(String name, String address, int age, String country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return name + "\n" + address;
    }
}
class Student extends Person {
    private int credit;
    private int student_id;
    private  List<Integer> grade;


    public Student(String name,String address,int age,String country,int student_id) {
        super(name,address,age,country);
        this.credit = 0;
        this.student_id = student_id;
        this.grade = new ArrayList<>();
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public int getStudent_id() {
        return this.student_id;
    }

    public int getCredit() {
        return this.credit;
    }
    public void addGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            this.grade.add(grade);
            System.out.println("Grade "+ grade +" has been added.");
        }else {
            System.out.println("Grade "+ grade +" has not been added.");
        }
    }

    @Override
    public String toString() {
        return super.toString(); // Uses Person's toString method
    }

    public void study() {
        this.credit += 1;
    }


}

class Teacher extends Person {
        private double salary;

        public Teacher(String name, String address, double salary,int age,String country) {
            super(name, address, age, country);
            this.salary = salary;
        }


        @Override
        public String toString() {
            return super.toString() + "\nSalary: " + salary;
        }
}

public class Main {

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 21, "Finland", 12345);

        System.out.println(olli);

        olli.addGrade(65);
        olli.addGrade(110);
        olli.addGrade(95);

        System.out.println("\nUpdated student details:");
        System.out.println(olli);
    }
}*/






