import java.io.IOException;
import java.util.Scanner;

public class UserMenu {
    private int userOption;
    private double inputValue;

    public void showInitialMenu() throws IOException, InterruptedException {
        CurrencyApi currencyApi = new CurrencyApi();
        UserMessage userMessage = new UserMessage();
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println(userMessage.getInitialMessage());
        setUserOption(scanner.nextInt());
        while (getUserOption() != 7){
            System.out.println(userMessage.getChoiceMessage(getUserOption()));
            switch (getUserOption()){
                case 1:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("USD", "EUR"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "USD", "EUR"));
                    showInitialMenu();
                    break;
                case 2:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("EUR", "USD"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "EUR", "USD"));
                    showInitialMenu();
                    break;
                case 3:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("USD", "BRL"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "USD", "BRL"));
                    showInitialMenu();
                    break;
                case 4:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("BRL", "USD"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "BRL", "USD"));
                    showInitialMenu();
                    break;
                case 5:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("USD", "RUB"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "USD", "RUB"));
                    showInitialMenu();
                    break;
                case 6:
                    setInputValue(scanner.nextDouble());
                    currencyConverter.setInputValue(getInputValue());
                    currencyConverter.setConversionRate(currencyApi.getConversionRate("RUB", "USD"));
                    System.out.println(userMessage.getConvertedMessage(currencyConverter.getInputValue(), currencyConverter.getConvertedValue(), "RUB", "USD"));
                    showInitialMenu();
                    break;
                case 7:
                    break;
            }
        }
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public void setUserOption(int userOption) {
        this.userOption = userOption;
    }

    public int getUserOption() {
        return userOption;
    }

    public double getInputValue() {
        return inputValue;
    }
}