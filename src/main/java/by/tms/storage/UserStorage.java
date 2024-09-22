package by.tms.storage;

import by.tms.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private static UserStorage instance;
    public List<User> users;

    private UserStorage() {
        this.users = new ArrayList<>();
    }

    public static synchronized UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public void saveUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

}
