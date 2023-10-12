package bt.bt1.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObject {
    public static void exportFileobject  (List<Product> list) throws IOException {
        File product = new File("src/bt/bt1/product.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(product));
        try {
            if (product.createNewFile()) {
                System.out.println("tao file thanh cong");
            }
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("loi");
        }
    }
    public static List<Product> importFileObject() throws IOException {
        List<Product> list = new ArrayList<>();
        try {
            File productFle = new File("src/bt/bt1/product.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(productFle));
            list = (List<Product>) objectInputStream.readObject();
            System.out.println("da nap file");
        } catch (FileNotFoundException e) {
            System.out.println("file khong ton tai");
        } catch (IOException e) {
            System.out.println("loi khi gi file");
        } catch (ClassNotFoundException e) {
            System.out.println("loi");
        }
        return list;
    }
}
