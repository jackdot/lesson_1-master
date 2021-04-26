package geekbrains.lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Медведев", "+8999123321");
        phoneBook.add("Карпов", "+899921");
        phoneBook.add("Иванов", "+89123321");
        phoneBook.add("Фёдоров", "+8642321");
        phoneBook.add("Мальцев", "+8999123321");
        phoneBook.add("Медведев", "+8999123321");
        phoneBook.add("Давыдов", "+1199123321");
        phoneBook.add("Медведев", "+3499123321");
        phoneBook.add("Давыдов", "+7699123321");
        phoneBook.add("Колобов", "+8999143321");

        System.out.println(phoneBook.get("Давыдов"));


//        List<String> arrayList = new ArrayList<>(Arrays.asList("иван", "свинка", "танк", "машина", "свинка", "иван", "компромат", "сапромат", "танк"));
//        List<String> arrayList2 = new ArrayList<>(Arrays.asList("шесть","шерсть","шерсть","шесть"));
//
//        duplicatesCount(arrayList2);




    }

    private static void duplicatesCount(List<String> arrayList) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : arrayList) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }

        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : arrayList) {
                String a = arr.toLowerCase();
                if (tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " Количество элементов:  = " + count);

        }
    }
}