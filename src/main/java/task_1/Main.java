package task_1;

public class Main {
    static void main(String[] args) {
        Zoo zoo = new Zoo();
        Elephant elephant = new Elephant();
        Bird bird = new Bird();

        zoo.setAnimal(elephant);
        zoo.callMakeMove();
        zoo.callMakeSound();
        zoo.deleteAnimal();

        zoo.setAnimal(bird);
        zoo.callMakeMove();
        zoo.callMakeSound();
    }
}
