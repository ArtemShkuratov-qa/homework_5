package task_5;

public class Chicken extends FarmAnimal{
    @Override
    public void produce() {
        System.out.println("Курица несет яйца");
    }

    @Override
    public void feed() {
        System.out.println("Курица клюет зерно");
    }
}
