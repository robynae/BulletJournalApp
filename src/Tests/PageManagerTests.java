import edu.umn.d.mclau448.robynplanner.PageManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageManagerTests {
    PageManager p;

    @BeforeEach
    public void setup(){
        p = new PageManager();
    }
    @Test
    public void testAddPage(){
        p.addPage("DailyPlanner", "CS Final Project");
        assertEquals(1, p.getPages().size());
    }
}
