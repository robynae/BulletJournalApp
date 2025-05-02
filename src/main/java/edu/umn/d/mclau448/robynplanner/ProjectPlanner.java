package edu.umn.d.mclau448.robynplanner;

/**
 * The ProjectPlanner class is a type of Page that acts as a Project Manager. It will just contain a todo list concerning
 * one specific project. This will have a few unique attributes such as one for when the overall project is due.
 */
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
