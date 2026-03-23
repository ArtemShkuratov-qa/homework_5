package task_2;

public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет");
    }

    @Override
    public String toString() {
        return "'Кошка'";
    }

}
