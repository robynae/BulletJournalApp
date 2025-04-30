package edu.umn.d.mclau448.robynplanner;

/**
 * The Page interface contains all the methods that all Pages should contain. A Page is any list or tracker that can
 * be added to the planner.
 */

public interface Page {
    /**
     * Every page will have a "type". It might be a RecipeRepository, a HabitTracker, or a DailyPlanner.
     * The type of page it is will be represented by a String, used for page creation, saving, and loading.
     *
     * @return a String representing the type of Page it is
     */
    public String getPageType();

    /**
     * Every page will need to save its own data. I decided that saving and loading should happen within a page, because
     * the way to load and save different types of pages will be very different.
     */
    public void save();

    /**
     * Every page will need to load its own data. This will be done every time the page is opened.
     *
     * @param data This will probably change later.
     */
    public void load(String data);

}
