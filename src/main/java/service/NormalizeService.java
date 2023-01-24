package service;

import model.NormalizeModel;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalizeService {
    public static String normalize(String entryKey) {
        String[] jobTitles = {"Architect", "Quantity surveyor", "Software engineer", "Accountant"};
        List<NormalizeModel> normalizedStringList = new ArrayList<>();
        List<String> jobs = Arrays.asList(jobTitles);

        jobs.forEach(title -> {
            int score = Utils.getLevenshteinDistance(entryKey, title);
            normalizedStringList.add(new NormalizeModel(score, title));
        });

        NormalizeModel normalized = normalizedStringList.stream()
                .sorted(((o1, o2) -> o1.getScore() - o2.getScore()))
                .findFirst().get();

        return normalized.getNormalization();
    }
}
