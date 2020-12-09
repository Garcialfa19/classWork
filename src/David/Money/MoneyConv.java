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
                if (targetCurrency.getName().equals("Colon")) {
                    result = amount * 500;
                } else if (targetCurrency.getName().equals("Dollar")) {
                    result = amount;
                } else if (targetCurrency.getName().equals("Euro")) {
                    result = (float) (amount / 1.53);
                }

            } else if (currencyOrigin.getName().equals("Euro")) {
                if (targetCurrency.getName().equals("Colon")) {
                    result = amount * 750;
                } else if (targetCurrency.getName().equals("Dollar")) {
                    result = (float) (amount * 1.53);
                } else if (targetCurrency.getName().equals("Euro")) {
                    result = amount;

                }
            }
            return result;
        }

        return result;
    }

    public Currency getColon() {
        return colon;
    }

    public void setColon(Currency colon) {
        this.colon = colon;
    }

    public Currency getDollar() {
        return dollar;
    }

    public void setDollar(Currency dollar) {
        this.dollar = dollar;
    }

    public Currency getEuro() {
        return euro;
    }

    public void setEuro(Currency euro) {
        this.euro = euro;
    }
}