import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    double price;
    String company;
    int count;

    public Product(){
    }

    public Product(String name, double price, String company, int count) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", count=" + count +
                '}';
    }
}
class Ecommerce{
    List<Product> productList = new ArrayList<>();

    void addProductToList(Product product){
        if(productList.contains(product)){
            productList.add(product);
            System.out.println("Count updated Product added already exists");
        }else{
            productList.add(product);
            System.out.println("Product added successfully");
        }
    }
    List<Product> showAllProduct(){
        System.out.println(productList);
        return null;
    }
}

class Main{
    public static void main(String[] args) {
        Ecommerce ec = new Ecommerce();
        ec.addProductToList(new Product("Shoes",2000,"Adidas",12));
        ec.addProductToList(new Product("Ipad",100000,"Apple",2));
        ec.addProductToList(new Product("Ipad",100000,"Apple",4));
        ec.addProductToList(new Product("Shoes",4000,"Nike",4));
        ec.addProductToList(new Product("Shoes",2000,"Adidas",8));

        System.out.println(ec.showAllProduct());


    }
}
