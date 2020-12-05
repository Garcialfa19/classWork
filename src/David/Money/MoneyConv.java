package David.Money;

public class MoneyConv {
    Currency colon;
    Currency dollar;
    Currency euro;

    public MoneyConv() {
    }

    public MoneyConv(Currency colon, Currency dollar, Currency euro) {
        this.colon = colon;
        this.dollar = dollar;
        this.euro = euro;
    }


    //this method requires that currencyOrigin and targetCurrency to be established
    public float convert(Currency currencyOrigin, Currency targetCurrency, float amount) {
        float result = 0;
        if (currencyOrigin != null && targetCurrency != null) {

            if (currencyOrigin.getName().equals("Colon")) {
                if (targetCurrency.getName().equals("Colon")) {
                    result = amount;
                } else if (targetCurrency.getName().equals("Dollar")) {
                    result = amount / dollar.getValueColon();
                } else if (targetCurrency.getName().equals("Euro")) {
                    result = amount / euro.getValueColon();
                }
            } else if (currencyOrigin.getName().equals("Dollar")) {

            } else {

            }
        }
        return result;
    }

    public Currency getMonedaColon() {
        return colon;
    }

    public void setMonedaColon(Currency monedaColon) {
        this.colon = monedaColon;
    }

    public Currency getMonedaDolar() {
        return dollar;
    }

    public void setMonedaDolar(Currency monedaDolar) {
        this.dollar = monedaDolar;
    }

    public Currency getMonedaEuro() {
        return euro;
    }

    public void setMonedaEuro(Currency monedaEuro) {
        this.euro = monedaEuro;
    }
}
