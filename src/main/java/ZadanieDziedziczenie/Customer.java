package ZadanieDziedziczenie;

import java.util.LinkedList;
import java.util.List;

public class Customer {

    public String name;
    public int cash;

    List<String> orderedMeals = new LinkedList<>();

    public Customer(String name, int cash){
        this.name = name;
        this.cash = cash;
    }

    public void addToOrderedMealsList(String mealNote){
        this.orderedMeals.add(mealNote);
    }

    public void buyMealFromPizzeria(String meal, Pizzeria pizzeria){
        int price = pizzeria.getPrice(meal);
        this.cash -= price;
        pizzeria.sellMeals();
        addToOrderedMealsList("Ordered meal: " + meal);
    }

    public void buyMealFastFood(String meal, FastFood fastFood){
        int price = fastFood.getPrice(meal);
        this.cash -= price;
        fastFood.sellMeals();
        addToOrderedMealsList("Ordered meal: " + meal);
    }

    public void getCash(){
        System.out.println("Cash: " + this.cash);
    };

    public void getOrderedList(){
        for (int i = 0; i < orderedMeals.size(); i++) {
            System.out.println(orderedMeals.get(i));
        }
    }
}


//skąd mam wziąć cenę posiłku?
//jak połączyć klienta z pozostałymi klasami?
//dlaczego w metodach buyMeal odwołuje się do klasy restaurant