package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class MenuA {
    private Date lastUpdated;
    private ArrayList<MenuItemA> items;

    public MenuA(Date d, ArrayList<MenuItemA> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItemA> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItemA> getItems() {
        return items;
    }
}
