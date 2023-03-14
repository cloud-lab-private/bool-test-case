
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdvancedBooleanLogicTest {
    static AdvancedBooleanLogic abl;
    @BeforeClass
    public static void setUp(){
        abl = new AdvancedBooleanLogic();
    }

    /**
     * With inputs true and true, notBoth should return false, because both of the inputs are true.
     */
    @Test
    public void returnNotBothTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = abl.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * With inputs true and false, notBoth should return true, because not both of the inputs are true.
     */
    @Test
    public void returnNotBothTest2(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = abl.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * With inputs false and true, notBoth should return true, because not both of the inputs are true.
     */
    @Test
    public void returnNotBothTest3(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = abl.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * With inputs false and false, notBoth should return true, because not both of the inputs are true.
     */
    @Test
    public void returnNotBothTest4(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = abl.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * With inputs true and true, exclusiveOr should return false, because both of the inputs are true.
     */
    @Test
    public void returnExclusiveOrTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = abl.returnExclusiveOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
   
 
}
