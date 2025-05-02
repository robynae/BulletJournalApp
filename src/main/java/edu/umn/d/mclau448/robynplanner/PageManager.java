package edu.umn.d.mclau448.robynplanner;

import java.util.HashMap;

/**
 * This acts as the homepage for our entire app. It manages all the pages that are created by the user. It is
 * where the user can add new pages, and remove pages they no longer need. It is also a Page itself, so it will need
 * to save and load data.
 */

public class PageManager implements Page{

    private HashMap<String, Page> pages = new HashMap<>();

    @Override
    public String getPageType() {
        return "PageManager";
    }

    @Override
    public void save() {
        System.out.println("I've no clue what I'm gonna do here.");
    }

    @Override
    public void load(String data) {

    }

    /**
     * This will take a page type and a title for the page by the user, and send that information to the PageFactory class
     * to create a new page based on the user's input
     *
     *
     * @param pageType String representing what kind of page will be created. The user will be limited to a dropdown menu.
     * @param pageTitle String representing the title of the page.
     */
    public void addPage(String pageType, String pageTitle){
        PageFactory p = new PageFactory();
        pages.put(pageTitle, p.createPage(pageType, pageTitle));
    }

    /**
     * This method will remove the page from the hashmap.
     *
     * @param pageTitle String representing the page's title. This should be the key for the Page inside our HashMap.
     */
    public void removePage(String pageTitle){
        pages.remove(pageTitle);
    }

    /**
     * This just returns the HashMap of Pages. Useful for loading
     *
     * @return a HashMap which contains all of the pages the user creates
     */
    public HashMap<String, Page> getPages(){
        return this.pages;
    }

}
