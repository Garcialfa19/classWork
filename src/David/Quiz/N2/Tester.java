package David.Quiz.N2;

public class Tester {

    public static void main(String[] args) {

        String name = "Pepperoni";
        int code = 1;
        String description = "The most delicious pizza topping";
        int price = 1000;
        Ingredient pepperoni = new Ingredient(name, code, description, price);


        name = "Cheese";
        code = 2;
        description = "A must have on any pizza";
        price = 500;
        Ingredient cheese = new Ingredient(name, code, description, price);

        name = "Mushrooms";
        code = 2;
        description = "A perfect match for Pepperoni";
        price = 1000;
        Ingredient mushrooms = new Ingredient(name, code, description, price);

        int tprice = 3250;

<<<<<<< HEAD
        Pizza pizza = new Pizza(pepperoni, cheese, mushrooms, tprice);

        system.printPizza();
=======
        Pizza p = new Pizza(pepperoni, cheese, mushrooms, tprice);

>>>>>>> master

    }
}
