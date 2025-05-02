import edu.umn.d.mclau448.robynplanner.DailyPlannerPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DailyPlannerTests {
    DailyPlannerPage p;

    @BeforeEach
    void setup(){
        p = new DailyPlannerPage("Today");
    }

    @Test
    public void testDate(){
        assertEquals("Fri, May 02", p.getDate()); //honestly a horrible test, but i just want to make sure it's formatting correctly right now
    }
}
