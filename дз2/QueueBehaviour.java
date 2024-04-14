public interface QueueBehaviour {
    public void enterQueue (Actor actor);
    public void outQueue (Actor actor);
    public void getOrder(Actor actor);
    public void giveOrder(Actor actor);
}
