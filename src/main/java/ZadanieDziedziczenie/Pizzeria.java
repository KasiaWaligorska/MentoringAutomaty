package ZadanieDziedziczenie;

import java.util.HashMap;
import java.util.Map;

public class Pizzeria extends Restaurant {

    private String pizzeriaEmployee;
    Map<String, Integer> meals = new HashMap<>();
    public Pizzeria(int cashAmount, String name, String owner, String pizzeriaEmployee) {
        super(cashAmount, name, owner);
        this.pizzeriaEmployee = pizzeriaEmployee;
        meals.put("Pizza", 40);
    };

    public void sellMeals(String meal){
        int mealPrice = this.meals.get(meal);
        if (this.meals.containsKey(meal)) {
            System.out.println("Ordered element with name " + meal + " and price " + mealPrice);
            this.cashAmount += mealPrice;
        } else {
            System.out.println("We're sorry. There is no such meal in our menu :(");
        }
    }

    public void getCashAmount(){
        System.out.println("Your cash amount is: " + this.cashAmount);
    }

    public int getPrice(String meal){
        int price = this.meals.get(meal);
        return price;
    };

}
