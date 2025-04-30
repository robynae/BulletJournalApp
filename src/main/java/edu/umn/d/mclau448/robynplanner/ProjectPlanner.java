package edu.umn.d.mclau448.robynplanner;

public class ProjectPlanner extends Planner implements Page{
    public ProjectPlanner(String plannerTitle) {
        super(plannerTitle);
    }

    @Override
    public String getPageType() {
        return "ProjectPlanner";
    }

    @Override
    public void save() {

    }

    @Override
    public void load(String data) {

    }
}
