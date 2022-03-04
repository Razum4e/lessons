package main331;

public interface Reader {
    void tookBook(Reader reader, Administrator administrator, String book);
    void returnedBook(Reader reader, Administrator administrator, String book);

    String getName();
}
