package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double source = this.getCurrencyType().getRate();
        Double target = currencyType.getRate();
        return target/source;
    }
    CurrencyType getCurrencyType();
}
