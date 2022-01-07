package Classes;

import java.util.ArrayList;
import java.util.List;

public class Registered_User implements User {
    String name;
    long id;
    String email;
    String Password;
    double rate;
    String password;
    List<Clothes> reserveList=new ArrayList<Clothes>();

    public Registered_User(String name, long id, String email, String password, double rate, String password1) {
        this.name = name;
        this.id = id;
        this.email = email;
        Password = password;
        this.rate = rate;
        this.password = password1;
    }
    public boolean reserveItem(Clothes C){
        this.reserveList.add(C);
        return true;
    }
    public boolean Login(String Email,String Password){
        return  true;
    }

    @Override
    public String toString() {
        return "Registered_User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", Password='" + Password + '\'' +
                ", rate=" + rate +
                ", password='" + password + '\'' +
                ", reserveList=" + reserveList +
                '}';
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
