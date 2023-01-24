import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalizerApp {
    public static String normalize(String entryKey) {
        String[] jobTitles = {"Software engineer", "Accountant"};
        List<NormalizedString> normalizedStringList = new ArrayList<>();
        List<String> jobs = Arrays.asList(jobTitles);

        jobs.forEach(title -> {
            int score = Utils.getLevenshteinDistance(entryKey, title);
            normalizedStringList.add(new NormalizedString(score, title));
        });

        NormalizedString normalized = normalizedStringList.stream()
                .sorted(((o1, o2) -> o1.getScore() - o2.getScore()))
                .findFirst().get();

        return normalized.getNormalization();
    }

    public static void main(String[] args) {
        String jobTitle = "Java engineer";
        System.out.println("NORMALIZED JOB TITLE --> " + normalize(jobTitle));
        jobTitle = "C# engineer";
        System.out.println("NORMALIZED JOB TITLE --> " + normalize(jobTitle));
        jobTitle = "Accountant";
        System.out.println("NORMALIZED JOB TITLE --> " + normalize(jobTitle));
        jobTitle = "Chief Accountant";
        System.out.println("NORMALIZED JOB TITLE --> " + normalize(jobTitle));
    }
}

class NormalizedString {
    private int score;
    private String normalization;

    public NormalizedString() {}
    public NormalizedString(int score, String normalization) {
        this.score = score;
        this.normalization = normalization;
    }
    public int getScore() {return score; }
    public void setScore(int score) { this.score = score; }
    public String getNormalization() { return normalization; }
    public void setNormalization(String normalization) { this.normalization = normalization; }
}