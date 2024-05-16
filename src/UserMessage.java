import java.util.*;

public class UserMessage {
    public String getConvertedMessage(double inputValue, double convertedValue, String baseCurrency, String targetCurrency){
        return """
                %s %s é igual a %s %s
                """.formatted(inputValue, currencyCodeToName(baseCurrency), convertedValue, currencyCodeToName(targetCurrency));
    }

    public String currencyCodeToName(String code){
        Map<String, String> currencyCodeList = new HashMap<>();
        currencyCodeList.put("USD", "dólares americanos");
        currencyCodeList.put("BRL", "reais brasileiros");
        currencyCodeList.put("EUR", "euros");
        currencyCodeList.put("RUB", "rublos russos");
        if (currencyCodeList.containsKey(code)){
            return currencyCodeList.get(code);
        }
        return null;
    }

    public String getInitialMessage(){
        return """
                ******************************************
                Seja bem-vindo/a ao Conversor de Moeda 
                ******************************************
                
                1) Dólar americano   => Euro
                2) Euro              => Dólar americano
                3) Dólar americano   => Real brasileiro
                4) Real brasileiro   => Dólar americano
                5) Dólar americano   => Rublo russo
                6) Rublo russo       => Dólar americano
                7) Sair
                
                Escolha uma opção válida:
                ******************************************
                """;
    }
    public String getChoiceMessage(int option){
        switch (option){
            case 1:
                return "Digite um valor para converter Dólar em Euro";
            case 2:
                return "Digite um valor para converter Euro em Dólar";
            case 3:
                return "Digite um valor para converter Dólar em Real brasileiro";
            case 4:
                return "Digite um valor para converter Real brasileiro em Dólar";
            case 5:
                return "Digite um valor para converter Dólar em Rublo russo";
            case 6:
                return "Digite um valor para converter Rublo russo em Dólar";
        }
        return "";
    }
}