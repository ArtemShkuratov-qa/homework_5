package task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal (Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal + " добавлено в зоопарк");
    }

    public void deleteAnimal() {
        System.out.println("Животное " + animal + " удалено из зоопарка");
        System.out.println();
        this.animal = null;
    }

    public void callMakeMove() {
        if (animal == null) {
            System.out.println("Животное отсутствует");
            System.out.println();
        } else this.animal.makeMove();
    }

    public void callMakeSound() {
        if (animal == null) {
            System.out.println("Животное отсутствует");
            System.out.println();
        } else this.animal.makeSound();
    }
}
