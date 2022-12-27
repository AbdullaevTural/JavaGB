package les5;
import java.util.HashMap;
import java.util.Map;

public class Phone {
    public static void main(String[] args) {
        Map<String, String> bookFone = new HashMap<>();
        bookFone.put("Дроздов", "2-23-23");
        bookFone.put("Токарь", "3-23-63");
        bookFone.put("Колос", "2-76-53");
        bookFone.put("Мамонтов", "3 -15-78");
        bookFone.put("Мартынов", "2-23-89, 2-43-53");
        bookFone.put("Фельш", "2-15-13");
        bookFone.put("Самсонов", "513-12-02, 520-29-00");
        System.out.println(bookFone.get("Дроздов"));
        System.out.println(bookFone.get("Бастард"));

        addPhoneBook(bookFone, "Шишкин", "2-02-45");

        System.out.println(bookFone.get("Шишкин"));

        deletePhoneBook(bookFone, "Фельш");

        System.out.println(bookFone);
    }

    // Добавить или изменить или изменить данные
    public static void addPhoneBook(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deletePhoneBook(Map<String, String> dict, String name){
        dict.remove(name);
    }
}
