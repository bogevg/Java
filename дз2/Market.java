// 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
// 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
// 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{ // класс магазина, "в котором" можно использовать механики работы очереди
     ArrayDeque queueActors = new ArrayDeque<Actor>(); // список покупателей в очереди
     List actors = new ArrayList<>(); // список всех людей, которые есть в магазине

    public void enterQueue (Actor actor){
        queueActors.addLast(actor);
    }
    public void outQueue (Actor actor){
        queueActors.pollFirst();
    }
    public void getOrder(Actor actor){
        actor.isTakeOrder();
    }
    public void giveOrder(Actor actor){
        actor.isMakeOrder();
    }
    public void enterToMarket(Actor actor ){
        actors.add(actor);
    }
    public void leaveFromMarket(Actor actor){
        actors.remove(actor);
    }
    public List<Actor> getStatus(){
        return actors;
    }
}