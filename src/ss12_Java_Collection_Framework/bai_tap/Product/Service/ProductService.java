package ss12_Java_Collection_Framework.Exercise.Product.Service;

import ss12_Java_Collection_Framework.Exercise.Product.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements Iproduct{
    ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewProduct() {
        System.out.println("Input id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Name");
        String name = scanner.nextLine();
        double prices = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, prices);
        products.add(product);
    }
}
