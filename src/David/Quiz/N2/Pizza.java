package David.Quiz.N2;

public class Pizza {

    Ingredient pepperoni;
    Ingredient cheese;
    Ingredient mushrooms;
        int tprice;

    public Pizza(){
    }

    public Pizza(Ingredient pepperoni, Ingredient cheese, Ingredient mushrooms, int price) {
        this.pepperoni = pepperoni;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.tprice = tprice;
    }

    public void printPizza(){
        System.out.println(pizza.toString);
    }

    public void printPizza(){
        System.out.println(pepperoni + " " + cheese + " " + mushrooms + " " + tprice);
    }

    public Ingredient getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Ingredient pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Ingredient getCheese() {
        return cheese;
    }

    public void setCheese(Ingredient cheese) {
        this.cheese = cheese;
    }

    public Ingredient getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(Ingredient mushrooms) {
        this.mushrooms = mushrooms;
    }

    public int getPrice() {
        return tprice;
    }

    public void setPrice(int price) {
        this.tprice = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pepperoni=" + pepperoni +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                ", price=" + tprice +
                '}';
    }
}
