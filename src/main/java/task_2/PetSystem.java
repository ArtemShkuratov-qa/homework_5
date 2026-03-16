package task_2;

public class PetSystem {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Животное " + this.pet + " добавлено в систему управления питомцами");
    }

    public void deletePet() {
        System.out.println("Животное " + this.pet + " удалено из системы управления питомцами");
        System.out.println();
        this.pet = null;
    }

    public void callEat() {
        this.pet.eat();
    }

    public void callPlay() {
        if (this.pet instanceof Playable) {
            Playable playable = (Playable) this.pet;
            playable.play();
        } else {
            System.out.println("Ошибка: данное животное не может играть!");
        }
    }

    public void callWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkable = (Walkable) this.pet;
            walkable.walk();
        } else {
            System.out.println("Ошибка: данное животное не может гулять!");
        }
    }
}
