package edu.umn.d.mclau448.robynplanner;

/**
 * This is our MVP contract for our PageManager page. So, this controls the view and backend logic concerning our homepage of our app.
 */
public class PlannerManagerMVPContract {

    /**
     * This interface represents the presenter. It allows us to connect the creation and removal of pages between our
     * back and front ends.
     */
    interface Presenter{
        void createPage(String pageType, String pageTitle);
        void deletePage(String pageTitle);
    }

    /**
     * This interface represents the view. These are the methods that will cause update to the GUI when our program is run.
     */
    interface View{
        void addPage(Page page);
        void removePage(Page page);
    }
}
