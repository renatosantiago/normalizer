import service.NormalizeService;

public class NormalizerApp {

    public static void main(String[] args) {
        String jobTitle = "Java engineer";
        System.out.println("NORMALIZED JOB TITLE --> " + NormalizeService.normalize(jobTitle));
        jobTitle = "C# engineer";
        System.out.println("NORMALIZED JOB TITLE --> " + NormalizeService.normalize(jobTitle));
        jobTitle = "Accountant";
        System.out.println("NORMALIZED JOB TITLE --> " + NormalizeService.normalize(jobTitle));
        jobTitle = "Chief Accountant";
        System.out.println("NORMALIZED JOB TITLE --> " + NormalizeService.normalize(jobTitle));
    }
}
