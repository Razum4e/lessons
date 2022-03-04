package main331;

public class AdministratorImpl extends User implements Administrator, Librarian{
    public AdministratorImpl(String name, String female) {
        super(name, female);
    }

    @Override
    public void toGiveBook(Reader reader, String book) {
        System.out.println("Администратор " + getName() + " дал книгу \"" + book + "\" читателю " + reader.getName());
    }

    @Override
    public void toTakeBook(Reader reader, String book) {
        System.out.println("Администратор " + getName() + " забрал книгу \"" + book + "\" у читателя " + reader.getName());
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.println("Администратор " + getName() + " заказал грузовик книг у доставщика " + supplier.getName());
    }
}
