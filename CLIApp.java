package example.main;

import java.util.UUID;

import example.domain.AIdentified;
import example.domain.ISellable;
import example.domain.Product;

//Hello world!
public class CLIApp 
{
    public static void main( String[] args )
    {
        ISellable testProduct = new Product(UUID.randomUUID());
        System.out.println(testProduct);
    }
}
