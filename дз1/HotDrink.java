public class HotDrink extends Product {
    private int temp;
    private double volume;

    HotDrink(String name, String category, int temp, double volume){
        super(name, category);
        this.temp = temp;
        this.volume = volume;
    }
    HotDrink(String name, String category, int temp){
        this(name, category, temp, 0.5);
    }
    public double GetVolume(){
        return this.volume;
    }
    public void SetVolume(double volume){
        this.volume = volume;
    }

    public int GetTemp(){
        return this.temp;
    }
    public void SetTemp(int temp){
        this.temp = temp;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
        "temperature=" + temp +
        ", volume=" + this.GetVolume() + 
        ", name='" + this.GetName() + 
        "}";
    }    
}