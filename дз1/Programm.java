import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        List<Product> products =  new ArrayList();
        products.add(new HotDrink("Coffee", "not alcohol", 60, 1));
        products.add(new HotDrink("Coffee", "not alcohol", 60 ));
        products.add(new HotDrink("Hot chocolate", "not alcohol", 50));
        products.add(new HotDrink("Mullied wine", " alcohol", 40, 2));

        VengingMachineHotDrink Vending = new VengingMachineHotDrink();
        Vending.InitProducts(products);

        System.out.println(Vending.GetProduct("Coffee"));
        System.out.println(Vending.GetProduct(50));
        System.out.println(Vending.GetProduct(0.5,"Coffee"));

    }
    
}
