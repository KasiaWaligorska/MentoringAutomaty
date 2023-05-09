package ZadanieDziedziczenie;

public abstract class Restaurant {

    public int cashAmount;
    public String name;
    public String owner;

    public Restaurant(int cashAmount, String name, String owner){
        this.cashAmount = cashAmount;
        this.name = name;
        this.owner = owner;
    }

    public void sellMeals(){
        System.out.println("Ta metoda nic nie robi");
    };


}
