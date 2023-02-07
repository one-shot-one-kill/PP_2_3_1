package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> allUsers();
    public void saveUser(User user);
    public void deleteUser(long id);
    public void editUser(long id, User user);
    public User getUserById(long id);
}
