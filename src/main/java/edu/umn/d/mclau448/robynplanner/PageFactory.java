package edu.umn.d.mclau448.robynplanner;

/**
 * This class is in charge of creating Pages. This will be utilized when a user creates a new Page, and when the
 * application is first opened.
 *
 */
public class PageFactory {

    /**
     *The createPage method is in charge of actually creating a Page.
     *
     * @param pageType String representing the type of Page that is being created
     * @param pageTitle String representing the name of the Page that will be
     * @return a new Page using the type and title that is entered.
     */
    public Page createPage(String pageType, String pageTitle){
        switch (pageType) {
            case "DailyPlanner":
                return new DailyPlannerPage(pageTitle);
            default:
                return null;
        }
    }
}
