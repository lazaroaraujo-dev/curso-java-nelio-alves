import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Product #"+(i+1)+" data: ");
            System.out.print("Common, used or imported (c/u/i)");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            Product product = null;
            if (true){
            if (type=='c' || type == 'C'){
                product = new Product(name, price);
            } else if (type == 'U' || type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY)");
                String dateString = sc.next();
                LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product = new UsedProduct(name, price, localDate);
            } else if (type == 'I' || type == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            }}
            productList.add(product);
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : productList){
            System.out.println(product.priceTag());
        }



        sc.close();
    }
}