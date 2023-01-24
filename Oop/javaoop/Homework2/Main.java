package javaoop.Homework2;

public class Main {

    private static final String GERALT_NAME = "Геральт из Ривии";
    private static final String YENNEFER_NAME = "Йеннифэр из Венгерберга";
    private static final String TRISS_NAME = "Трисс Меригольд";
 
    public static void main(String[] args) {
 
        System.out.println("Ведьмак 4");
        System.out.println("Это уже четвертая часть Ведьмака, а " + GERALT_NAME + " никак не определится кто ему" +
                " нравится больше: " + YENNEFER_NAME + " или " + TRISS_NAME);
 
        System.out.println("Но если вы никогда не играли в Ведьмака - начнем сначала.");
        System.out.println("Главного героя зовут " + GERALT_NAME);
        System.out.println(GERALT_NAME + " - ведьмак, охотник на чудовищ");
        GERALT_NAME.replace("Ривии", "России");//попробуем изменить состояние GERALT_NAME, заменив слово "Ривии" на “Python”
        System.out.println(GERALT_NAME);
     
    }
 }