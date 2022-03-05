package main451;

import java.util.*;

//программа пишется на базе локальной сети номеров воинской части
//для начальника продовольственной службы, которому доступны все контакты
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Set<PhoneContact> phoneContacts = phoneContacts();
        Calls calls = new Calls(phoneContacts);
        calls.call("1");
        Thread.sleep(2000);
        calls.call("70");
        Thread.sleep(1000);
        calls.call("12");
        Thread.sleep(3000);
        calls.call("100");
        Thread.sleep(2500);
        calls.call("14");
        Thread.sleep(1500);
        calls.call("2");
        System.out.println(calls.printMissingCall());
    }

    public static Set<PhoneContact> phoneContacts() {
        //подобие локальной сети номеров военной части
        Set<PhoneContact> phoneContacts = new HashSet<>();
        PhoneContact staff = new PhoneContact("Отдел кадров");
        staff.addContact("Начальник ОК", "12");
        staff.addContact("Делопроизводитель", "13");
        staff.addContact("Бухгалтер", "14");
        PhoneContact commanders = new PhoneContact("Начальство");
        commanders.addContact("Командир части", "1");
        commanders.addContact("Начальник штаба", "2");
        commanders.addContact("Заместитель командира", "3");
        PhoneContact communications = new PhoneContact("Батальон связи");
        communications.addContact("Дежурный по связи", "67");
        communications.addContact("Командир батальона", "68");
        communications.addContact("Начальник станции", "69");
        phoneContacts.add(staff);
        phoneContacts.add(commanders);
        phoneContacts.add(communications);
        return phoneContacts;
    }

    public static void printPhoneContact(Set<PhoneContact> phoneContacts) {
        System.out.println("Справочник контактов:");
        List<PhoneContact> listPhoneContacts = new ArrayList<>(phoneContacts);
        listPhoneContacts.sort(PhoneContact::compareTo);
        for (PhoneContact contact : listPhoneContacts) {
            System.out.println(contact.printPhoneContact());
        }
    }
}
