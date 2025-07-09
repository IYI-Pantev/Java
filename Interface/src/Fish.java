public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("Fish flees from bigger fishes");
    }

    @Override
    public void hunt(){
        System.out.println("Fish hunts for smaller fishes");
    }

}
