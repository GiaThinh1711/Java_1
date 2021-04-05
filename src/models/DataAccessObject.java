package models;

import java.util.ArrayList;

public interface DataAccessObject<S> {
    ArrayList<S> getlist();
    boolean create(S s);
}
