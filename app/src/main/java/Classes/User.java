package Classes;

import java.util.List;

public interface User {
    public List<Store> searchForStore();
    public Setting viewSetting();
    public void setSetting(Setting S);
}
