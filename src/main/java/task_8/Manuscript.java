package task_8;

public class Manuscript extends Exhibit {
    @Override
    public void printCareInstruction() {
        System.out.println("Экспонату требуется контроль влажности");
    }

    @Override
    public String toString() {
        return "'Манускрипт'";
    }
}
