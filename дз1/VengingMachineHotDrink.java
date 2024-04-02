import java.util.List;

public class VengingMachineHotDrink implements VendingMachine{

    private List<Product>  products;

    public void InitProducts(List<Product> products){
        this.products = products;

    }

    public Product GetProduct(String name){
        for (Product product : products) {
            if (product.GetName().equals(name))
                        return product;
        }
        return null;
    }

    public Product GetProduct(double volume, String name){
        for (Product product : products) {
            if ( ((HotDrink) product).GetVolume() == volume  && (product.GetName().equals(name)))
                        return product;
        }
        return null;
    }

    public Product GetProduct(int temp){
        for (Product product : products) {
            if ( ((HotDrink) product).GetTemp() == temp)
                        return product;
        }
        return null;
    }

}
