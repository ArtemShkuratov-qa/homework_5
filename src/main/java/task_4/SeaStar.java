package task_4;

public class SeaStar extends SeaAnimal{
    public SeaStar() {
        super("медленное");
    }

    @Override
    public void move() {
        System.out.println("Морское существо ползает");
    }

    @Override
    public String toString() {
        return "'Морская звезда'";
    }
}
