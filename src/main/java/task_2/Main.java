package task_2;

public class Main {
    static void main(String[] args) {
        PetSystem petSystem = new PetSystem();
        Dog dog = new Dog();
        Cat cat = new Cat();

        petSystem.setPet(dog);
        petSystem.callEat();
        petSystem.callWalk();
        petSystem.callPlay();
        petSystem.deletePet();

        petSystem.setPet(cat);
        petSystem.callEat();
        petSystem.callWalk();
        petSystem.callPlay();
    }
}
