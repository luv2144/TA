import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "invalidEmail")
<<<<<<< HEAD
    public static Object[] credentials() {
        return new Object[] {"", "a$nt@09bz.lt", "pmL9A!@_Z.am", "uha@zAl.v*", "uhazAl.vq", "pmL9A!@_Zam",
                "28ilqlwwe81294378tfgcawbyu4gnuaBCA@tydk.efw", "47euewuV@0Gukef7.wey", "fyhunN@wew.wqwearstdyyjhtsrg",
                "3C@kjhN.lug", "VR7ftyh@hfhHG.t", "ITJGJ6dfj@0.efj"};
=======
    public static Object[][] credentials() {
        return new Object[][] {{""}, {"a$nt@09bz.lt"}, {"pmL9A!@_Z.am"}, {"uha@zAl.v*"}, {"uhazAl.vq"}, {"pmL9A!@_Zam"},
                               {"28ilqlwwe81294378tfgcawbyu4gnuaBCA@tydk.efw"}, {"47euewuV@0Gukef7.wey"}, {"fyhunN@wew.wqwearstdyyjhtsrg"},
                               {"3C@kjhN.lug"}, {"VR7ftyh@hfhHG.t"}, {"ITJGJ6dfj@0.efj"}};
>>>>>>> 53e2d5f01046fd09210682d60d407dc00198b999
    }

    @Test(dataProvider = "invalidEmail")
    public void verifyInvalidEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "Unexpected value passed.");
    }
}
