package ZadanieDziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pizzeria amoreMio = new Pizzeria(0, "amoreMio", "Mario", "Luigi");
/*        amoreMio.sellMeals("Pizza");
        amoreMio.sellMeals("Pizza");
        amoreMio.getCashAmount();*/

        FastFood burgerKing = new FastFood(0, "Burger King", "John", "Janusz Kowalski");
/*        burgerKing.sellMeals("Burger");
        burgerKing.sellMeals("French fries");
        burgerKing.getCashAmount();
        burgerKing.getListWithOrderedMeals();*/

        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(amoreMio);
        restaurants.add(burgerKing);

        Customer customer = new Customer("Kasia", 1000000);
        customer.buyMealFromPizzeria("Pizza", amoreMio);
        customer.buyMealFastFood("Burger", burgerKing);
        customer.getCash();
        customer.getOrderedList();
    }
}
