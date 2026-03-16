package task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal (Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + this.animal + " добавлено в зоопарк");
    }

    public void deleteAnimal() {
        System.out.println("Животное " + this.animal + " удалено из зоопарка");
        System.out.println();
        this.animal = null;
    }

    public void callMakeMove() {
        this.animal.makeMove();
    }

    public void callMakeSound() {
        this.animal.makeSound();
    }
}
