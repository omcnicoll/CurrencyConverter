package OM.StylightCurrencyConverter;
import org.javamoney.moneta.Money;
import javax.money.MonetaryAmount;
import javax.money.convert.*;
import java.util.HashMap;

/**
 * Created by Olivier on 6/21/2017.
 */
public class MoneyConversion {
    public static HashMap<String, CurrencyConversion> ConversionMap = new HashMap<String, CurrencyConversion>();

    //Initialized a map, otherwise the first request for conversion fails due to timeout
    public static void InitializeConversionMap(){
        ConversionMap.put("USD", MonetaryConversions.getConversion("USD"));
        ConversionMap.put("EUR", MonetaryConversions.getConversion("EUR"));
        ConversionMap.put("JPY", MonetaryConversions.getConversion("JPY"));
    }

    public static String Convert(String inputCurrency, double amount, String outputCurrency){
        MonetaryAmount inputMoney = Money.of(amount,inputCurrency);
        MonetaryAmount convertedAmount = inputMoney.with(ConversionMap.get(outputCurrency));
        return convertedAmount.toString();
    }
}
