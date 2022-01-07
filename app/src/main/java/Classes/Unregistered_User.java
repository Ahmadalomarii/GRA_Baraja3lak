package Classes;

import java.util.List;

public class Unregistered_User implements User {

    public boolean creaeAccount(Registered_User R){
        return true;
    }
    public boolean applyForStoreAccount(Store S){
        return true;
    }
    @Override
    public List<Store> searchForStore() {
        return null;
    }

    @Override
    public Setting viewSetting() {
        return null;
    }

    @Override
    public void setSetting(Setting S) {

    }
}
