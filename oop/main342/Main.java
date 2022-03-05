package main342;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        validEvent(getMovies());
        validEvent(getTheatre());
        System.out.println("Все события корректны");
    }
    public static Event[] getMovies(){
        return new Event[] {
            new Event("Приключения Иванова", 1991, 6),
            new Event("Очень страшное кино", 1231,12)
        };
    }
    public static Event[] getTheatre(){
        return new Event[]{
            new Event("Дюймовочка", 0, 0),
            new Event("Мастер и Маргарита", 2000, 18)
        };
    }
    public static void validEvent(Event[] events) throws RuntimeException {
        for (Event event : events) {
            if(event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null) {
                throw new RuntimeException("ошибка");
            }
        }
    }
}
