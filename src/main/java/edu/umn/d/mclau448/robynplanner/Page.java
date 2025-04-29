package edu.umn.d.mclau448.robynplanner;

public interface Page {
    String getPageType();

    void save();

    void load(String data);
}
