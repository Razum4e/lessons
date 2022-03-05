package main331;

public class Main {
    public static void main(String[] args) {
        String[] libraryBooks = {
                "Чуковский",
                "Достоевский",
                "Маяковский"
        };
        ReaderImpl vasyaPupkin = new ReaderImpl("Вася", "Пупкин");
        LibrarianImpl mariyaIvanova = new LibrarianImpl("Мария", "Иванова");
        SupplierImpl ahmedMuhamedov = new SupplierImpl("Ахмед", "Мухамедов");
        AdministratorImpl vladimirRaznov = new AdministratorImpl("Владимир", "Разнов");
        vasyaPupkin.tookBook(vasyaPupkin, vladimirRaznov, libraryBooks[0]);
        mariyaIvanova.orderBooks(ahmedMuhamedov);
        ahmedMuhamedov.broughtBooks();
        vasyaPupkin.returnedBook(vasyaPupkin, vladimirRaznov, libraryBooks[0]);
    }
}
