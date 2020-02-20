import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckAssertions {

    @Test
    public void checkActualAndExpectedString() {
        Assert.assertEquals("Fail", "Success");
    }

    @Test
    public void verifyUsername() {
        Assert.assertEquals("Invalid username", "Valid username", "You can not access your account");
    }

    @Test
    public void checkBooleanValue() {
        Assert.assertEquals(true, false);
    }

    @Test
    public void verifyCollections() {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Assert.assertEquals(list1, list2, "Collections do not contain the same elements with the same order");
    }

    @Test
    public void checkCondition() {
        Assert.assertTrue(1 == Integer.valueOf("1"));
    }

    @Test
    public void checkConditionWithMessage() {
        Assert.assertTrue(0 != 0, "Condition is false");
    }

    @Test
    public void checkFalseCondition() {
        Assert.assertFalse(false);
    }

    @Test
    public void checkFalseConditionWithMessage() {
        Assert.assertFalse(true, "Expected false condition, found true");
    }
}
