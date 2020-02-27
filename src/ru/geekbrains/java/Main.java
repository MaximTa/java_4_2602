package ru.geekbrains.java;

class Person {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String telephone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void prnPerson() {
        System.out.println(name + " " + position + " " + email + " " + telephone + " " + salary + " " + age);
    }
}
public class Main {

    public static void main(String[] args) { //Задание4
        Person[] personsArray = new Person[5];
        personsArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personsArray[1] = new Person("Ivanova Ivanka", "Tester", "ivivanka@mailbox.com", "892312314", 35000, 60);
        personsArray[2] = new Person("Ivanidze Vano", "Manager", "vivan0@mailbox.com", "892312316", 30000, 41);
        personsArray[3] = new Person("Iva Ivan", "Top Engineer", "iviv@mailbox.com", "892312318", 130000, 50);
        personsArray[4] = new Person("Ivanyan Van", "Engineer", "iivan@mailbox.com", "892312317", 40000, 53);


        for (Person item : personsArray) {
        if (item.getAge() > 40) {
            item.prnPerson();
         }
       }
    }
}
