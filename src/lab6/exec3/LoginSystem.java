package src.lab6.exec3;

import java.util.Set;

public class LoginSystem {

    private Set<User> users;

    private OnlineStore store;

    public void register(String username, String password) {

    }

    public boolean login(String username, String password) {

        return true;
    }

    public boolean logout(String username) {

        return true;

    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }
}
