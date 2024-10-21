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












