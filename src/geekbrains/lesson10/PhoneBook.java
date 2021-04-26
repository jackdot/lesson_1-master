package geekbrains.lesson10;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneNumberList = phoneBook.get(surname);

        } else {
            phoneNumberList = new ArrayList<>();

        }
        phoneNumberList.add(phoneNumber);
        phoneBook.put(surname, phoneNumberList);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }
}
