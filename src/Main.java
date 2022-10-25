public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, задание 2:");
        int age = 26;
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок должен ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Ребёнок закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек закончил университет и пора искать первую работу."); // пока что работает не совсем правильно :(
        }
    }
}