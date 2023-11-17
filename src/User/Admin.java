package User;

public class Admin extends AUser {


    public Admin(String username, String password, Boolean admin) {
        super(username, password, admin);
    }

    AdminHandler handler = new AdminHandler();


    @Override
    public void setUserName() {

    }

    @Override
    public void setPassword() {

    }
}
