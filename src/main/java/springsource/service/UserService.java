package springsource.service;

import springsource.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    User createOrUpdateUser(User user);

    void deleteUserById(long id) throws RuntimeException;
}
