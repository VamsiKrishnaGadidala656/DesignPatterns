package org.learning.IteratorPattern_PaginatedAPI;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {

    List<String> users = new ArrayList<>();


    public void seeder() {
        for (int i=1;i<=2000;i++) {
            users.add("users " + i );
        }
    }

    public List<String> getUsers() {
        return users;
    }
}
