package edu.umn.d.mclau448.robynplanner;

import java.util.HashMap;

public class PlannerPage implements Page{
    private String plannerTitle;
    private HashMap<String, Todo> taskList = new HashMap<>();

    public PlannerPage(String plannerTitle){
        this.plannerTitle = plannerTitle;
    }



    @Override
    public String getPageType() {
        return "PlannerPage";
    }

    @Override
    public void save() {

    }

    @Override
    public void load(String data) {

    }

}
