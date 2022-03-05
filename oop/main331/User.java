package main331;

public class User {
    private String name;
    private String female;

    public User (String name, String female) {
        this.name = name;
        this.female = female;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFemale(String female) {
        this.female = female;
    }
    public String getName() {
        return name;
    }
    public String getFemale() {
        return female;
    }
}
