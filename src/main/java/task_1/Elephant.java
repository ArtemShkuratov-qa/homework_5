package task_1;

public class Elephant extends Animal{
    @Override
    void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    void makeMove() {
        System.out.println("Слон ходит");
    }

    @Override
    public String toString() {
        return "'Слон'";
    }
}
