import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment1Test {
    @org.junit.Test
    public void getLowest() throws Exception {

        int expected =  3;

        Assert.assertEquals(expected,Assignment1.getLowest(5,9,3));

    }

}