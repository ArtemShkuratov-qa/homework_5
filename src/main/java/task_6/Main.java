package task_6;

public class Main {
    static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Cactus cactus = new Cactus();
        Orchid orchid = new Orchid();

        botanicalGarden.setPlant(cactus);
        botanicalGarden.getPlantInstruction();
        botanicalGarden.deletePlant();
        botanicalGarden.getPlantInstruction();

        botanicalGarden.setPlant(orchid);
        botanicalGarden.getPlantInstruction();
    }
}
