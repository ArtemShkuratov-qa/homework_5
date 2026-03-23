package task_2;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }

    @Override
    public String toString() {
        return "'Собака'";
    }
}
