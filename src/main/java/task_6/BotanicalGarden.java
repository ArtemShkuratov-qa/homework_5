package task_6;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant (Plant plant) {
        this.plant = plant;
        System.out.println("Растение " + this.plant + " добавлено в ботанический сад!");
    }

    public void deletePlant() {
        System.out.println("Растение " + this.plant + " удалено из ботанического сада!");
        System.out.println();
        this.plant = null;
    }

    public void getPlantInstruction() {
        System.out.print("Информация об уходе: ");
        this.plant.printCareInstructions();
    }
}
