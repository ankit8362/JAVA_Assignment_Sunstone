package Assignments;

class Student{
    String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    int total;
    double percentage;
    Student(String name,int age,char section,char gender,int subject1,int subject2,int subject3){
        this.name =name;
        this.age = age;
        this.section =section;
        this.gender =gender;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 =subject3;
        calculateTotalAndPercentage();
    }
    Student(String name,int age,char section,char gender,int subject2,int subject3){
        this(name, age, section, gender, 0, subject2, subject3);
    }
    private void calculateTotalAndPercentage(){
        total = subject1 + subject2 + subject3;
        percentage = total / 3.0;
    }

    // Method to display student details
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("------------------------------");
    }
}

public class Assignment3{

    public static void main(String[] args){
        // Creating 4 student objects
        Student s1 = new Student("Alice",18,'A','F',85,90,88);
        Student s2 = new Student("Bob",19,'B','M',78,82);        // subject1 = 0
        Student s3 = new Student("Charlie",18,'A','M',65,70);    // subject1 = 0
        Student s4 = new Student("Daisy",20,'C','F',92,89,95);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
