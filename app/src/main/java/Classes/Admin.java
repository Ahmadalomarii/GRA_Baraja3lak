package Classes;

public class Admin {
    Long id;
    String name;
    String password;
    String email;

    public Admin(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public boolean giveStoreAccount(){
        return true;
    }

}
