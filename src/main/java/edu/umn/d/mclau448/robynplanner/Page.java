package edu.umn.d.mclau448.robynplanner;

public interface Page {
    public String getPageType();

    public void save();

    public void load(String data);

    public void onPageClose();
}
