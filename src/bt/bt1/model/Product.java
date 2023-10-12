package bt.bt1.model;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private  static  final long  serialVersionUID = 37383855416157176l;
    private int productId;
    private String productName;
    private String commpany;
    private float price;
    private String descretion;

    public Product() {
    }

    public Product(int productId, String productName, String commpany, float price, String descretion) {
        this.productId = productId;
        this.productName = productName;
        this.commpany = commpany;
        this.price = price;
        this.descretion = descretion;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommpany() {
        return commpany;
    }

    public void setCommpany(String commpany) {
        this.commpany = commpany;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescretion() {
        return descretion;
    }

    public void setDescretion(String descretion) {
        this.descretion = descretion;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào Id");
        this.productId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm");
        this.productName = scanner.nextLine();
        System.out.println("Nhập vào tên công ty sản xuất");
        this.commpany = scanner.nextLine();
        System.out.println("Nhập vào gía san phẩm");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào miêu tả san phẩm");
        this.descretion = scanner.nextLine();
    }

    public void displayData(){
        System.out.printf("ID sản phẩm :%d, Tên sản phẩm: %s, Tên công ty sản xuất: %s, Giá sản phẩm: %2f, Miêu tar: %s",productId,productName,commpany,price,descretion);
    }

}

