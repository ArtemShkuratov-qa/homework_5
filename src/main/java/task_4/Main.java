package task_4;

public class Main {
    static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        SeaStar seaStar = new SeaStar();

        aquarium.setSeaAnimal(shark);
        aquarium.getSeaAnimalInfo();
        aquarium.deleteSeaAnimal();
        aquarium.getSeaAnimalInfo();

        aquarium.setSeaAnimal(seaStar);
        aquarium.getSeaAnimalInfo();
    }
}
