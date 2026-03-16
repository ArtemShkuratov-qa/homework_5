package task_7;

public class Main {
    static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();
        Carousel carousel = new Carousel();
        RollerCoaster rollerCoaster = new RollerCoaster();

        amusementPark.setAttraction(carousel);
        amusementPark.getMaintenanceInfo();
        amusementPark.deleteAttraction();

        amusementPark.setAttraction(rollerCoaster);
        amusementPark.getMaintenanceInfo();
    }
}
