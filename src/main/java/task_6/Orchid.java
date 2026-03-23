package task_6;

public class Orchid extends Plant{
    @Override
    public void printCareInstructions() {
        System.out.println("Требует высокую влажность и тень");
    }

    @Override
    public String toString() {
        return "'Орхидея'";
    }
}
