package David.Money;

public class Currency {

    String name;
    float valueColon;

    public Currency(String name, float valueColon){
        this.name = name;
        this.valueColon = valueColon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValueColon() {
        return valueColon;
    }

    public void setValueColon(float valueColon) {
        this.valueColon = valueColon;
    }
}
