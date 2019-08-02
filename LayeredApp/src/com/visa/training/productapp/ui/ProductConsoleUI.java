package com.visa.training.productapp.ui;

import java.util.Scanner;

import com.visa.training.productapp.domain.Product;
import com.visa.training.productapp.service.ProductService;
import com.visa.training.productapp.service.ProductServiceIMPL;

public class ProductConsoleUI {
    
    ProductService service = new ProductServiceIMPL();
    
    public void createProductWithUI() {
        String name = fromKeyboard("Enter name: ");
        float price = Float.parseFloat(fromKeyboard("Enter price: "));
        int qoh = Integer.parseInt(fromKeyboard("Enter QoH: "));
        
        Product p = new Product(name, price, qoh);
        int id = service.createNewProduct(p);
        System.out.println("Product created with id : "+id);
    }

    private String fromKeyboard(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

}
