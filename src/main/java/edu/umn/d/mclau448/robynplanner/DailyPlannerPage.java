package edu.umn.d.mclau448.robynplanner;

import java.util.Date;

/**
 * This is a page that acts as a Daily Planner for the user. How it will work is every day at midnight, a new one will
 * be created within the page. The task list will reset, with everything that wasn't completed from yesterday
 * carrying over.
 */

public class DailyPlannerPage extends Planner implements Page{


    public DailyPlannerPage(String plannerTitle) {
        super(plannerTitle);
    }

    /**
     * This just gets Today's date and formats it nicely as a String
     *
     * @return String representing the day's date
     */
    public String getDate(){
      Date d = new Date();
      String[] formatDate = d.toString().split(" ");
      return formatDate[0] + ", " + formatDate[1] + " " + formatDate[2];
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
