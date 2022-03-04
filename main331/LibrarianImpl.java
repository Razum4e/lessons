package main331;

public class LibrarianImpl extends User implements Librarian, Administrator{
    public LibrarianImpl (String name, String female) {
        super(name, female);
    }

    @Override
    public void toGiveBook(Reader reader, String book) {
        System.out.println("Библиотекарь " + getName() + " дал книгу \"" + book + "\" читателю " + reader.getName());
    }

    @Override
    public void toTakeBook(Reader reader, String book) {
        System.out.println("Библиотекарь " + getName() + " забрал книгу \"" + book + "\" у читателя " + reader.getName());
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал грузовик книг у доставщика " + supplier.getName());
    }
}
