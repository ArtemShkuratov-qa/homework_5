package task_3;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
        System.out.println("Позиция " + dish + " была добавлена в меню!");
    }

    public void deleteDish() {
        System.out.println("Позиция " + dish + " была удалена из меню!");
        System.out.println();
        this.dish = null;
    }

    public void callDishInfo() {
        if (this.dish == null) {
            System.out.println("Позиция отсутвует");
            System.out.println();
        } else this.dish.getInfo();
    }
}
