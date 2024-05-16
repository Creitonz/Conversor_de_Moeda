public record CurrencyConversion(String base_currency, String target_currency, double conversion_rate) {
    @Override
    public String toString() {
        return "%s".formatted(conversion_rate);
    }
}