package org.learning.IteratorPattern_PaginatedAPI.repositories;

import org.learning.IteratorPattern_PaginatedAPI.InMemoryDatabase;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    private InMemoryDatabase inMemoryDatabase;

    public UserRepositoryImpl() {
        this.inMemoryDatabase = new InMemoryDatabase();
    }

    @Override
    public List<String> getUsers(int limit, int offset) {

        List<String> allUsers = inMemoryDatabase.getUsers();
        int start = (offset-1)*limit;
        int end = Math.max(start,allUsers.size());
        if(start >= allUsers.size()) {
            return List.of();
        }

        return allUsers.subList(start,end);
    }


}
