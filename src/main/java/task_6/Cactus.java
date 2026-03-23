package task_6;

public class Cactus extends Plant{
    @Override
    public void printCareInstructions() {
        System.out.println("Требует много света и редкий полив");
    }

    @Override
    public String toString() {
        return "'Кактус'";
    }
}
