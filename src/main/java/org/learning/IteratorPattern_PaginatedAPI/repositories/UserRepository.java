package org.learning.IteratorPattern_PaginatedAPI.repositories;

import java.util.List;

public interface UserRepository {

    public List<String> getUsers(int limit, int offset);
}
