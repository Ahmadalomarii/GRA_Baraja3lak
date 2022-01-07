package Classes;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    long id;
    int phone;
    double rate;
    int reserveTime;
    List<Clothes> ListOfClothes=new ArrayList<Clothes>();

    public Store(String name, long id, int phone, double rate, int reserveTime) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.rate = rate;
        this.reserveTime = reserveTime;
    }
    public boolean addItem(Clothes c){
      this.ListOfClothes.add(c);
      return true;
    }
    public boolean updateItem(Clothes c,Clothes newc){
        for(int i=0;i<ListOfClothes.size();i++){
            if(ListOfClothes.get(i).equals(c))
                //some code
                return true;
        }
        return false;
    }
    public boolean deleteItem(Clothes c){
        for(int i=0;i<ListOfClothes.size();i++){
            if(ListOfClothes.get(i).equals(c))
                //some code
                return true;
        }
        return false;
    }
    public List<Clothes> checkReserveditem(){
       return this.ListOfClothes;
    }
}
