package task_4;

public class Aquarium {
    private SeaAnimal seaAnimal;

    public void setSeaAnimal(SeaAnimal seaAnimal) {
        this.seaAnimal = seaAnimal;
        System.out.println("Морское существо " + this.seaAnimal + " было добавлено в аквариум!");
    }

    public void deleteSeaAnimal() {
        System.out.println("Морское существо " + this.seaAnimal + " было удалено из аквариума!");
        System.out.println();
        this.seaAnimal = null;
    }

    public void getSeaAnimalInfo() {
        System.out.println("Поведение морского существа: " + this.seaAnimal.getAction());
        this.seaAnimal.move();
    }
}
