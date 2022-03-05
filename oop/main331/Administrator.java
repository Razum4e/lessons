package main331;

public interface Administrator {
    void toGiveBook (Reader reader, String book);
    void toTakeBook (Reader reader, String book);

    String getName();
}
