package main342;

public class Event {
    private String title;
    private int releaseYear;
    private int age;

    public Event(String title, int releaseYear, int age){
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }
}
