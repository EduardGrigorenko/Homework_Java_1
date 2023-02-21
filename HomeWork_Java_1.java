package Homework_1;

public class HomeWork_Java_1 {
    public static void main(String[] args) {
        class Person {
            String fullName;
            int age;
            public Person(String fullName, int age) {
            }
            public Person() {
            }
            void talk() {
                System.out.println("Такой-то Person говорит");
            }
            void voice() {
                System.out.println("Такой-то Person говорит");
            }
            Person person = new Person();
            Person personOne = new Person(fullName, age);
        }
    }


}
