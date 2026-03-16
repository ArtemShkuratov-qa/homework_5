package task_5;

public class Cow extends FarmAnimal{
    @Override
    public void produce() {
        System.out.println("Короова дает молоко");
    }

    @Override
    public void feed() {
        System.out.println("Корова пасется на лугу");
    }
}
