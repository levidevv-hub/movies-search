package br.com.guilhermelevi.addressearch.model;

public abstract class Title {

    private String name;
    private String runtime;
    private double classification;
    private int yearOfRelease;
    private int totalOfReview;

    protected Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRuntime() {
        return runtime;
    }

    public double getClassification() {
        return classification;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getTotalOfReview() {
        return totalOfReview;
    }
}
