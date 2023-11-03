package edu.hw3;

import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    private final String firstName;

    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Task5(String name) {
        firstName = name.split(" ")[0];
        if (name.split(" ").length > 1) {
            lastName = name.split(" ")[1];
        } else {
            lastName = null;
        }
    }

    public static Task5[] parseContacts(String[] names, String sortingParameter) {
        if (names == null) {
            return new Task5[0];
        }
        Task5[] contactsSort = new Task5[names.length];
        for (int i = 0; i < names.length; i++) {
            contactsSort[i] = new Task5(names[i]);
        }
        if ("DESC".equals(sortingParameter)) {
                Arrays.sort(contactsSort, new ComparatorForContacts().reversed());
        } else {
            Arrays.sort(contactsSort, new ComparatorForContacts());
        }
        return contactsSort;
    }

    static class ComparatorForContacts implements Comparator<Task5> {
        @Override
        public int compare(Task5 object1, Task5 object2) {
            String comparingParameter1 = object1.lastName == null ? object2.firstName : object1.lastName;
            String comparingParameter2 = object2.lastName == null ? object2.firstName : object2.lastName;
            return comparingParameter1.compareTo(comparingParameter2);
        }
    }
}
