package javaoop.homework1;

public class GrandParents {
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String Mother(){
        firstName = "Таисия";
        secondName = "Боркова";
        age = 45;
        status = "Мать";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
    public String Father(){
        firstName = "Андрей";
        secondName = "Мартынов";
        age = 40;
        status = "Отец";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}