package javaoop.homework1;

public class Main {
    public static void main(String[] args) {
        Children child = new Children("Маргарита", "Мартынова", 15, "Дочь");
        System.out.println(child);
        System.out.println(child.tutorMath());
        System.out.println(child.tutorEng());
        System.out.println(child.Father());
        System.out.println(child.Mother());
    }
}