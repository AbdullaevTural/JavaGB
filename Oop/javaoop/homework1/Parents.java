package javaoop.homework1;

public class Parents extends GrandParents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String tutorMath(){
        firstName = "Мария";
        secondName = "Сызова";
        age = 30;
        status = "Репетитор, Математика";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

    public String tutorEng(){
        firstName = "Павел";
        secondName = "Токарь";
        age = 37;
        status = "Репетитор, Английский";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}