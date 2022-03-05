package main331;

public class ReaderImpl extends User implements Reader{
    public ReaderImpl(String name, String female) {
        super(name, female);
    }

    @Override
    public void tookBook(Reader reader, Administrator administrator, String book) {
        System.out.println("Читатель " + getName() + " попросил книгу \"" + book + "\" у администратора " + administrator.getName());
        administrator.toGiveBook(reader, book);
    }

    @Override
    public void returnedBook(Reader reader, Administrator administrator, String book) {
        System.out.println("Читатель " + getName() + " оставил заявку на возврат книгу \"" + book + "\" администратору " + administrator.getName());
        administrator.toTakeBook(reader, book);
    }
}
