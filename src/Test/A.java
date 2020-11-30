package Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements Serializable {
    private transient Room room = new Room();

    public static void main(String[] args) {
        A h = new A();
        try{
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
class Room{

}
