package edu.umn.d.mclau448.robynplanner;

import java.util.HashMap;


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


    public void addPage(String pageType, String pageTitle){
        PageFactory p = new PageFactory();
        pages.put(pageType, p.createPage(pageType, pageTitle));
    }

    public void removePage(String pageTitle){
        pages.remove(pageTitle);
    }

}
