package task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Животное " + farmAnimal + " добавлено на ферму!");
    }

    public void deleteFarmAnimal() {
        System.out.println("Животное " + farmAnimal + " удалено с фермы!");
        System.out.println();
        this.farmAnimal = null;
    }

    public void feedFarmAnimal() {
        if (this.farmAnimal == null) {
            System.out.println("Домашнее животное отсутвует");
            System.out.println();
        } else this.farmAnimal.feed();
    }

    public void collectProduct() {
        if (this.farmAnimal == null) {
            System.out.println("Домашнее животное отсутвует");
            System.out.println();
        } else this.farmAnimal.produce();
    }
}
