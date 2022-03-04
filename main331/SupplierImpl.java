package main331;

public class SupplierImpl extends User implements Supplier{
    public SupplierImpl(String name, String female) {
        super(name, female);
    }

    @Override
    public void broughtBooks() {
        System.out.println("Доставщик " + getName() + " привез грузовик книг");
    }
}
