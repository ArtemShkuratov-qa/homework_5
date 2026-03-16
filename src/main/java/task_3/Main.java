package task_3;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        MainDish friedChicken = new MainDish(65);
        Drink americano = new Drink(0.2);

        menu.setDish(friedChicken);
        menu.callDishInfo();
        menu.deleteDish();

        menu.setDish(americano);
        menu.callDishInfo();
    }
}
