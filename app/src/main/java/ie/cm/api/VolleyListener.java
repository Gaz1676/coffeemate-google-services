package ie.cm.api;

import java.util.List;

import ie.cm.models.Coffee;


public interface VolleyListener {
    void setList(List list);
    void setCoffee(Coffee c);
}
