package sg.edu.rp.c346.moreimprovedtodolist;

import java.util.Calendar;

/**
 * Created by 16022742 on 17/7/2017.
 */

public class ToDoItem {
    //Define the Fields
    private String title;
    private Calendar date;

    //Constructor
    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }
    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + getTitle() + '\'' +
                ", date=" + getDateString() +
                '}';
    }
}
