package task_4;

public class Aquarium {
    private SeaAnimal seaAnimal;

    public void setSeaAnimal(SeaAnimal seaAnimal) {
        this.seaAnimal = seaAnimal;
        System.out.println("Морское существо " + seaAnimal + " было добавлено в аквариум!");
    }

    public void deleteSeaAnimal() {
        System.out.println("Морское существо " + seaAnimal + " было удалено из аквариума!");
        System.out.println();
        this.seaAnimal = null;
    }

    public void getSeaAnimalInfo() {
        if (this.seaAnimal == null) {
            System.out.println("Морское существо отсутствует");
            System.out.println();
        } else {
            System.out.println("Поведение морского существа: " + this.seaAnimal.getAction());
            this.seaAnimal.move();
        }
    }
}
