package src.lab6.exec3;

public class UserInterface {

    private LoginSystem loginSystem;

    private OnlineStore store;

    public void loadInterface(){

    }
    public LoginSystem getLoginSystem() {
        return loginSystem;
    }

    public void setLoginSystem(LoginSystem loginSystem) {
        this.loginSystem = loginSystem;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }
}
