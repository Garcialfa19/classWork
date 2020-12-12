package David.Quiz.N2;

public class Ingredient {
    String name;
    int code;
    String description;
    int price;

    public Ingredient(){
    }

    public Ingredient(String name, int code, String description, int price) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void printIngredient(){
        System.out.println(name + " " + code + " " + description + " " + price);
    }

    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
