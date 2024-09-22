package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.UserStorage;

public class UserService {

    private final UserStorageService userStorageService;

    public UserService(UserStorageService userStorageService) {
        this.userStorageService = userStorageService;
    }

    public boolean addUser(User user) {
        if (!isExistByLogin(user.getLogin())) {
            userStorageService.saveUser(user);
            return true;
        }
        return false;
    }

    public User getUserByLogin(String login) {
        return userStorageService.getUserByLogin(login);
    }

    private boolean isExistByLogin(String login) {
        return userStorageService.getUserByLogin(login) != null;
    }

    public boolean authorization(String login, String password) {
        User user = userStorageService.getUserByLogin(login);
        return user != null && user.getPassword().equals(password);
    }
}
