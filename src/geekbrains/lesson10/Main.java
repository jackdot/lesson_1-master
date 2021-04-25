package geekbrains.lesson10;

import java.util.*;

import static geekbrains.lesson2.Main.filledArray;

public class Main {

    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>(Arrays.asList("иван", "свинка", "танк", "машина", "свинка", "иван", "компромат", "сапромат", "танк"));
        List<String> arrayList2 = new ArrayList<>(Arrays.asList("шесть","шерсть","шерсть","шесть"));

        duplicatesCount(arrayList2);


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