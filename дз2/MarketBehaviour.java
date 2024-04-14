import java.util.List;

public interface MarketBehaviour {
    public void enterToMarket(Actor actor );
    public void leaveFromMarket(Actor actor);
    public List<Actor> getStatus();
}
