package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.UserStorage;

import java.util.List;

public class UserStorageService {

    private final UserStorage userStorage;

    public UserStorageService(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void saveUser(User user) {
        userStorage.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userStorage.getUsers();
    }

    public User getUserByLogin(String login) {
        return userStorage.getUsers().stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst()
                .orElse(null);
    }
}