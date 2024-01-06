import org.junit.Assert;
import org.junit.Test;

public class StringSwap {

    @Test
    public void swapOneString(){
        StringSwapHelper help = new StringSwapHelper();
        Assert.assertEquals("1", help.swaplasttwochars("1"));
    }

    @Test
    public void swapTwoString(){
        StringSwapHelper help = new StringSwapHelper();
        Assert.assertEquals("BA", help.swaplasttwochars("AB"));
    }

    @Test
    public void swapLongString(){
        StringSwapHelper help = new StringSwapHelper();
        Assert.assertEquals("SELENIMU", help.swaplasttwochars("SELENIUM"));
    }
}

