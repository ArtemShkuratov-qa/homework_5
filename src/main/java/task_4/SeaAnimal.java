package task_4;

public abstract class SeaAnimal implements Movable{
    private String action;

    public SeaAnimal (String action) {
        this.action = action;
    }

    public void setAction(String newAction) {
        this.action = newAction;
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public void move() {
        System.out.println("Морское существо плавает");
    }
}
