package edu.umn.d.mclau448.robynplanner;

public class PageFactory {
    public Page createPage(String pageType, String pageTitle){
        switch (pageType) {
            case "PlannerPage":
                return new PlannerPage(pageTitle);
            default:
                return null;
        }
    }
}
