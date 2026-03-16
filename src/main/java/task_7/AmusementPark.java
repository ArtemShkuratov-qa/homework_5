package task_7;

public class AmusementPark {
    private MaintenanceInfo attraction;

    public void setAttraction(MaintenanceInfo attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион " + this.attraction + " добавлен в парк развлечений!");
    }

    public void deleteAttraction() {
        System.out.println("Аттракцион " + this.attraction + " удален из парка развлечений!");
        System.out.println();
        this.attraction = null;
    }

    public void getMaintenanceInfo() {
        System.out.print("Информация о ежедневном обслуживании: ");
        this.attraction.printMaintenanceInfo();
    }
}
