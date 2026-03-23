package task_3;

public class Drink implements Dish{
    private double value;

    public Drink(double value) {
        this.value = value;
    }

    public void setValue(double newValue) {
        this.value = newValue;
    }

    @Override
    public void getInfo() {
        System.out.println("Объем наптика: " + this.value + " мл.");
    }

    @Override
    public String toString() {
        return "'Напиток'";
    }
}
