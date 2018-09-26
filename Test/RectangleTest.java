import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void test(){
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(2,3);
        double result = rect2.area();
        assertEquals(6,result);
    }
}