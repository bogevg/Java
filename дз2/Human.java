public class Human extends Actor{  // класс человека, который может стоять в очереди, унаследован от "стоящего в очереди"
    
    public Human (String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

}