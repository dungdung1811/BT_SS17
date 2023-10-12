package bt.bt1.run;

import bt.bt1.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bt.bt1.model.FileObject.exportFileobject;
import static bt.bt1.model.FileObject.importFileObject;

public class Run {
    public static List<Product> products =new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        products = importFileObject();
        System.out.println(products);
        int choise;
        do {
            System.out.println("________MENU______");
            System.out.println("1: Nhap vao thong tin san pham");
            System.out.println("2: Hien thi thong tin san pham ");
            System.out.println("3: Tim kiem san pham  bang ten san pham");
            System.out.println("4: Thoat");
            choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise){
                case 1:
                    inputData();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    seach();
                    break;
                case 4:
                    exportFileobject(products);
                    System.exit(0);
                    break;
                default:
                    System.out.println("lua chon khong co");
            }

        }while (choise != 4);
    }
    public static void inputData(){
        Product product = new Product();
        product.inputData();
        products.add(product);
    }
    public static void display(){
        for (Product product: products) {
            product.displayData();
        }
    }
    public static void seach(){
        System.out.println("nhap vao ten san pham");
        String inputName = scanner.nextLine();
        for (Product name: products) {
            if(name.getProductName().equals(inputName)){
                name.displayData();
            }
        }

    }


}
