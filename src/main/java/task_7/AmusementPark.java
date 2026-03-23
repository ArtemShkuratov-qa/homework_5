package task_7;

public class AmusementPark {
    private MaintenanceInfo attraction;

    public void setAttraction(MaintenanceInfo attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион " + attraction + " добавлен в парк развлечений!");
    }

    public void deleteAttraction() {
        System.out.println("Аттракцион " + attraction + " удален из парка развлечений!");
        System.out.println();
        this.attraction = null;
    }

    public void getMaintenanceInfo() {
        if (this.attraction == null) {
            System.out.println("Аттракцион отсутсвует");
            System.out.println();
        } else {
            System.out.print("Информация о ежедневном обслуживании: ");
            this.attraction.printMaintenanceInfo();
        }
    }
}
