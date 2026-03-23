package task_2;

public abstract class Pet {
    abstract void eat();

    public void walk() {
        System.out.println("Ошибка: данное животное не может гулять!");
    }

    public void play() {
        System.out.println("Ошибка: данное животное не может играть!");
    }
}
