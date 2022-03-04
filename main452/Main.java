package main452;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Candidate> candidates = new TreeSet<>
                (Comparator.comparing(Candidate::getInterviewsEvaluation, Comparator.reverseOrder())
                        .thenComparing(Candidate::getResumeEvaluation, Comparator.reverseOrder())
                        .thenComparing(Candidate::getFio));
        candidates.add(new Candidate("Иванов И.И.", 'M', 15, 5, 0));
        candidates.add(new Candidate("Бухающий Индус", 'M', 80, 5, 5));
        candidates.add(new Candidate("Сидоров С.С.", 'M', 20, 3, 3));
        candidates.add(new Candidate("Нестеров Н.Н.", 'M', 30, 3, 3));
        candidates.add(new Candidate("Мариновна М.М.", 'Ж', 40, 3, 5));
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
