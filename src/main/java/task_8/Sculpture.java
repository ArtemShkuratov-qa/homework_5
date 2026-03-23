package task_8;

public class Sculpture extends Exhibit{
    @Override
    public void printCareInstruction() {
        System.out.println("Экспонат нуждается в реставрации");
    }

    @Override
    public String toString() {
        return "'Скульптура'";
    }
}
