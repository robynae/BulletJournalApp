package edu.umn.d.mclau448.robynplanner;

public class PlannerManagerMVPContract {
    interface Presenter{
        void createPage(String pageType, String pageTitle);
    }
}
