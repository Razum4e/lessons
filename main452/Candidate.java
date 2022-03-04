package main452;

public class Candidate {
    private String fio;
    private char sex;
    private int age;
    private int resumeEvaluation;
    private int interviewsEvaluation;

    public Candidate(String fio, char sex, int age, int interviewsEvaluation, int resumeEvaluation) {
        this.fio = fio;
        this.sex = sex;
        this.age = age;
        this.resumeEvaluation = resumeEvaluation;
        this.interviewsEvaluation = interviewsEvaluation;
    }

    public int getResumeEvaluation() {
        return resumeEvaluation;
    }

    public int getInterviewsEvaluation() {
        return interviewsEvaluation;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return String.format("[%s][%s]%-15s %2s %2s", interviewsEvaluation, resumeEvaluation, fio, sex, age);
    }
}
