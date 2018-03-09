import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by oem on 3/10/18.
 */
public class graphTest extends TestCase {
    public void testGraph(){
        graph g = new graph("osman");
        Assert.assertEquals(true,g.getDeneme().equals("osmasn"));
    }
}
