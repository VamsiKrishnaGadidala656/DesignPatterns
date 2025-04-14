package org.learning.IteratorPattern_PaginatedAPI.services;

import org.learning.IteratorPattern_PaginatedAPI.iterators.Iterator;
import org.learning.IteratorPattern_PaginatedAPI.iterators.UserIterator;
import org.learning.IteratorPattern_PaginatedAPI.repositories.UserRepository;
import org.learning.IteratorPattern_PaginatedAPI.repositories.UserRepositoryImpl;

import java.util.List;

public class UserService {

    public UserRepository userRepository;
    private Iterator<List<String>> userIterator;

    public UserService(UserRepository userRepository) {
        this.userRepository = new UserRepositoryImpl();
        this.userIterator = new UserIterator(10);
    }

    public void getUsersOnPlatform() {
//        userRepository.getUsers(10,1);

        while (userIterator.hasNext()) {
            List<String> users = userIterator.next();
            System.out.println(users);
        }
    }
}
