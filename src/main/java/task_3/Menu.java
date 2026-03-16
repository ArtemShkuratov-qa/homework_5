package task_3;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
        System.out.println("Позиция " + this.dish + " была добавлена в меню!");
    }

    public void deleteDish() {
        System.out.println("Позиция " + this.dish + " была удалена из меню!");
        System.out.println();
        this.dish = null;
    }

    public void callDishInfo() {
        this.dish.getInfo();
    }
}
