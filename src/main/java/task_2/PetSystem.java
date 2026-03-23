package task_2;

public class PetSystem {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Животное " + pet + " добавлено в систему управления питомцами");
    }

    public void deletePet() {
        System.out.println("Животное " + pet + " удалено из системы управления питомцами");
        System.out.println();
        this.pet = null;
    }

    public void callEat() {
        if (this.pet == null) {
            System.out.println("Животное отсутствует");
            System.out.println();
        } else this.pet.eat();
    }

    public void callPlay() {
        if (this.pet == null) {
            System.out.println("Животное отсутствует");
            System.out.println();
        } else this.pet.play();
    }

    public void callWalk() {
        if (this.pet == null) {
            System.out.println("Животное отсутствует");
            System.out.println();
        } else this.pet.walk();
    }
}
