package task_7;

public class Carousel implements MaintenanceInfo{
    @Override
    public void printMaintenanceInfo() {
        System.out.println("Требуется провести техническое обслуживание");
    }

    @Override
    public String toString() {
        return "'Карусель'";
    }
}
