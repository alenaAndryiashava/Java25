package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("task 1");
        Computer computer1 = new Computer();
        computer1.cpu = "Apple M1 PRO 10‑Core";
        computer1.ram = 4;
        computer1.hdd = 512;
        computer1.price = 1310.08;

        Computer computer2 = new Computer();
        computer2.cpu = "Intel® Core";
        computer2.ram = 6;
        computer2.hdd = 256;
        computer2.price  = 755.46;

        Computer computer3 = new Computer();
        computer3.cpu = "AMD Ryzen";
        computer3.ram = 6;
        computer3.hdd = 1024;
        computer3.price  = 1646.22;

        Computer[] computers = {computer1, computer2, computer3};
        for (Computer computer : computers) {
            printComputer(computer);
        }

        System.out.println("Task 2");

        Book book = new Book();
        book.title = "The Master and Margarita";

        Author author = new Author();
        author.firstName = "Mikhail";
        author.lastName = "Bulgakov";
        author.yearOfBirth = 1891;
        book.author = author;
        printBook(book);

        System.out.println("Task 3");

        Student student1 = new Student();
        student1.name = "Jack";
        student1.grad = new int[]{3, 5, 2};

        Student student2 = new Student();
        student2.name = "Nick";
        student2.grad = new int[]{5,5,5,4};

        Student student3 = new Student();
        student3.name = "John";
        student3.grad = new int[]{5,5,5,5,5,5,5,5};

        Student[] students = {student1, student2, student3};
        for (Student student : students) {
            student.calculateAverage();
        }

        bubbleSort(students);
        print(students);

    }
    //1
    //Make a class Computer with the following attributes
    // (String cpu, int ram, int hdd, double price).
    // Implement the method that print all information about the Computer.
    // Create several objects of Computer and put it into array. Print all computers.
    public static void printComputer(Computer computer){
        System.out.println("CPU: " + computer.cpu);
        System.out.println("RAM: " + computer.ram + ";  HDD: "+computer.hdd);
        System.out.println("Price: " + computer.price +" EUR");
        System.out.println();
    }
    //2.
    //Make class Book. It should contain two fields: author and title.
    // The author is a Class with the following field firstName,
    // lastName, yearOfBirth. Implement the method of printing the Book
    public static void printBook(Book book){
        System.out.println(book.author + " "+book.title);
    }

    //3.
    //Do you remember the tasks about students and grades?
    // Try to create the class or classes this ft best for this task
    public static void bubbleSort(Student[] students){
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < students.length; i++) {
                if (students[i].average > students[i - 1].average) {
                    Student temp = students[i];
                    students[i] =students[i - 1];
                    students[i - 1] = temp;
                    flag = true;

                }
            }
        }
    }

    public static void print(Student[]students) {
        for (Student student : students) {
            System.out.println(student + " ");

        }
    }
}
