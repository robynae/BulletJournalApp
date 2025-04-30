package edu.umn.d.mclau448.robynplanner;

public class DailyPlannerPage extends Planner implements Page{


    public DailyPlannerPage(String plannerTitle) {
        super(plannerTitle);
    }

    @Override
    public String getPageType() {
        return "DailyPlanner";
    }

    @Override
    public void save() {

    }

    @Override
    public void load(String data) {

    }
}
