package org.launchcode;


import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuList;
    private Date date;

    public Menu(ArrayList<MenuItem> menuList, Date date) {
        this.menuList = menuList;
        this.date = date;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}