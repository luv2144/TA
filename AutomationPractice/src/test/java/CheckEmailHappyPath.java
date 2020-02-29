import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "validEmail")
    public static Object[][] credentials() {
        return new Object[][] {{"vu_@me.cm"}, {"p!AZXGVFJDvdjfshdMOD@z79aA.abcdz"}, {"_098EsazAZ@a8nz.com"}};
    }

    @Test(dataProvider = "validEmail")
    public void verifyValidEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
