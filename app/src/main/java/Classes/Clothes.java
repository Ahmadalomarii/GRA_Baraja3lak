package Classes;

import android.graphics.Color;
enum Size{XXXL,XXL,Xl,L,S}
public class Clothes {
    String name;
    long id;
    Color color;
    Size size;
    String brand;
    Category category;

    public Clothes(String name, long id, Color color, Size size, String brand, Category category) {
        this.name = name;
        this.id = id;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.category = category;
    }
}
