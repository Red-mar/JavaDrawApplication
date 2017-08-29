package sample;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    String name;
    List<DrawingItem> items;

    public Drawing(){
        items = new ArrayList<DrawingItem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
