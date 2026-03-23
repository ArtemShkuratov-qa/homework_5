package task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Экспонат " + exhibit + " добавлен в музей!");
    }

    public void deleteExhibit() {
        System.out.println("Экспонат " + exhibit + " удален из музея!");
        System.out.println();
        this.exhibit = null;
    }

    public void getCareInstruction() {
        if (exhibit == null) {
            System.out.println("Экспонат отсутвует");
            System.out.println();
        } else {
            System.out.print("Информация о экспонате: ");
            this.exhibit.printCareInstruction();
        }
    }
}
