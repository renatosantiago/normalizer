import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.NormalizeService;

public class NormalizeTest {

    private final String SOFTWARE_ENGINEER = "Software engineer";
    private final String ACCOUNTANT = "Accountant";


    @Test
    public void testNormalizeShouldNormalizeToSoftwareEngineer() {
        String jobTitle = "Java engineer";
        String result = NormalizeService.normalize(jobTitle);
        Assertions.assertEquals(result, SOFTWARE_ENGINEER);

        jobTitle = "C# engineer";
        result = NormalizeService.normalize(jobTitle);
        Assertions.assertEquals(result, SOFTWARE_ENGINEER);
    }

    @Test
    public void testNormalizeShouldNormalizeToAccountant() {
        String jobTitle = "Chief Accountant";
        String result = NormalizeService.normalize(jobTitle);
        Assertions.assertEquals(result, ACCOUNTANT);

        jobTitle = "Accountant";
        result = NormalizeService.normalize(jobTitle);
        Assertions.assertEquals(result, ACCOUNTANT);
    }
}
