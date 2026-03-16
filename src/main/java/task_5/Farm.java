package task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Животное " + this.farmAnimal + " добавлено на ферму!");
    }

    public void deleteFarmAnimal() {
        System.out.println("Животное " + this.farmAnimal + " удалено с фермы!");
        System.out.println();
        this.farmAnimal = null;
    }

    public void feedFarmAnimal() {
        this.farmAnimal.feed();
    }

    public void collectProduct() {
        this.farmAnimal.produce();
    }
}
