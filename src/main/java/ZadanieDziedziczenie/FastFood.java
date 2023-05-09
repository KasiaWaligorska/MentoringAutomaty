package ZadanieDziedziczenie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FastFood extends Restaurant{

    private String fastFoodEmployee;
    Map<String, Integer> meals = new HashMap<>();
    List<String> listWithOrderedMeals = new LinkedList<>();

    public FastFood(int cashAmount, String name, String owner, String fastFoodEmployee) {
        super(cashAmount, name, owner);
        this.fastFoodEmployee = fastFoodEmployee;
        meals.put("French fries", 10);
        meals.put("Burger", 30);
        meals.put("Tortilla", 25);
    }

    public void sellMeals(String meal){
        if (this.meals.containsKey(meal)) {
            int mealPrice = this.meals.get(meal);
            this.cashAmount += mealPrice;
            String orderNote = "Ordered element with name " + meal + " and price " + mealPrice;
            addToListWithOrderedMeals(orderNote);
        } else {
            System.out.println("We're sorry. There is no such meal in our menu :(");
        }
    }

    public void addToListWithOrderedMeals(String orderNote){
        this.listWithOrderedMeals.add(orderNote);
    };

    public int getPrice(String meal){
        int price = this.meals.get(meal);
        return price;
    };

    public void getListWithOrderedMeals(){
        for (int i = 0; i < listWithOrderedMeals.size(); i++) {
            System.out.println(listWithOrderedMeals.get(i));
        }
    }

    public void getCashAmount(){
        System.out.println("Your cash amount is: " + this.cashAmount);
    }


}

//dlaczego nie ndapisały się metody sellMeals?
//dlaczego listy i mapy nie dodaje w konstruktorze, a i tak obiekt to posiada?
