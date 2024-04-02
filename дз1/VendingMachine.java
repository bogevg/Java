import java.util.List;

public interface VendingMachine {
    
    public abstract void InitProducts(List<Product> products);
        
    public abstract Product GetProduct(String name);

    public abstract Product GetProduct(int volume);


}
