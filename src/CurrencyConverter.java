public class CurrencyConverter {
    private double inputValue;
    private double conversionRate;
    private String baseCurrency;
    private String targetCurrency;

    public CurrencyConverter() {

    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getInputValue() {
        return inputValue;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double getConvertedValue(){
        return this.getConversionRate() * this.getInputValue();
    }
}