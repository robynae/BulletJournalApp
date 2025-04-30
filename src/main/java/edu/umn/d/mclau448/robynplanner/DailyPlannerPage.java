package edu.umn.d.mclau448.robynplanner;

import java.util.Date;

public class DailyPlannerPage extends Planner implements Page{


    public DailyPlannerPage(String plannerTitle) {
        super(plannerTitle);
    }

    public String getDate(){
      Date d = new Date();
      String[] formatDate = d.toString().split(" ");
      return formatDate[1] + " " + formatDate[2];
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
