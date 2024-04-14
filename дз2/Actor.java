/**
 * Actor
 */
public abstract class Actor {   //стоящий в очереди
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract String getName();
    
    Actor(){
        isMakeOrder = false;
        isTakeOrder = false;
    }
    abstract public void setMakeOrder();
    abstract public void setTakeOrder();
    abstract public boolean isMakeOrder();
    abstract public boolean isTakeOrder();
    
}