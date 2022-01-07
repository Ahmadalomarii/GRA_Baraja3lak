package Classes;
enum Type{Sweater,Dress,Hoodies,T_shirt,Flip_flops,Shorts,Skirt,Jeans}
enum Gender{Male,Female}
public class Category {
   Type type;
   Gender gender;

    public Category(Type type, Gender gender) {
        this.type = type;
        this.gender = gender;
    }
}
