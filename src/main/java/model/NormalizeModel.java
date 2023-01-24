package model;

public class NormalizeModel {
    private int score;
    private String normalization;

    public NormalizeModel() {}
    public NormalizeModel(int score, String normalization) {
        this.score = score;
        this.normalization = normalization;
    }
    public int getScore() {return score; }
    public void setScore(int score) { this.score = score; }
    public String getNormalization() { return normalization; }
    public void setNormalization(String normalization) { this.normalization = normalization; }
}
