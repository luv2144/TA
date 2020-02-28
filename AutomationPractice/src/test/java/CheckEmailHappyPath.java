import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "validEmail")
<<<<<<< HEAD
    public static Object[] credentials() {
        return new Object[] {"vu_@me.cm", "p!AZXGVFJDvdjfshdMOD@z79aA.abcdz", "_098EsazAZ@a8nz.com"};
=======
    public static Object[][] credentials() {
        return new Object[][] {{"vu_@me.cm"}, {"p!AZXGVFJDvdjfshdMOD@z79aA.abcdz"}, {"_098EsazAZ@a8nz.com"}};
>>>>>>> 53e2d5f01046fd09210682d60d407dc00198b999
    }

    @Test(dataProvider = "validEmail")
    public void verifyValidEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
