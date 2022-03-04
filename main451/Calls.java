package main451;

import java.util.*;

public class Calls {
    private Set<PhoneContact> phoneContacts;
    private Map<Date, Contact> missingCall = new TreeMap<>();

    public Calls(Set<PhoneContact> phoneContacts) {
        this.phoneContacts = phoneContacts;
    }

    public void call(String number) { //реализация вызова, каждый раз соединение не производится
        Contact contact = null;
        for (PhoneContact phoneContact : phoneContacts) {
            contact = phoneContact.findContactByNumber(number);
            if (contact != null) {
                missingCall.put(new Date(), contact);
                break;
            }
        }
        if (contact == null) {
            missingCall.put(new Date(), new Contact(null, number));
        }
    }

    public String printMissingCall() {
        String outMissing = "Список непринятых вызовов:\n";
        for (Map.Entry<Date, Contact> entry : missingCall.entrySet()) {
            if (entry.getValue().getName() != null) {
                String missing = String.format("В %tT звонили: " + entry.getValue() + "\n", entry.getKey());
                outMissing += missing;
            } else {
                String missing = String.format("В %tT звонили на неизвестный номер: " +
                        entry.getValue().getNumber() + "\n", entry.getKey());
                outMissing += missing;
            }
        }
        return outMissing;
    }
}
