package task_5;

public class Main {
    static void main(String[] args) {
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        farm.setFarmAnimal(cow);
        farm.feedFarmAnimal();
        farm.collectProduct();
        farm.deleteFarmAnimal();

        farm.setFarmAnimal(chicken);
        farm.feedFarmAnimal();
        farm.collectProduct();
    }
}
