package org.learning.IteratorPattern_PaginatedAPI.iterators;

import org.learning.IteratorPattern_PaginatedAPI.repositories.UserRepository;
import org.learning.IteratorPattern_PaginatedAPI.repositories.UserRepositoryImpl;

import java.util.List;

public class UserIterator implements Iterator<List<String>>{

    private UserRepository userRepository;
    private int limit = 1;
    private int offset = 0;

    private List<String> current;

    public UserIterator(int limit) {

        this.limit = limit;
        this.userRepository = new UserRepositoryImpl();
        this.current = userRepository.getUsers(limit,offset);


    }

    @Override
    public boolean hasNext() {
        return !current.isEmpty();
    }

    @Override
    public List<String> next() {
        List<String> result = current;
        this.offset += limit;
        this.current = this.userRepository.getUsers(limit,offset);
        return result;
    }
}
