package task_3;

public class MainDish implements Dish{
    private int temperature;

    public MainDish (int temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
    }

    @Override
    public void getInfo() {
        System.out.println("Температура подачи блюда: " + this.temperature);
    }

    @Override
    public String toString() {
        return "'Основное блюдо'";
    }
}
