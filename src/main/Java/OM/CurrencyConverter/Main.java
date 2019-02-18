package OM.CurrencyConverter;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        MoneyConversion.InitializeConversionMap();

        get("/convert/dollar/*/to/euro", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("USD", amount, "EUR");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });

        get("/convert/dollar/*/to/yen", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("USD", amount, "JPY");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });

        get("/convert/euro/*/to/dollar", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("EUR", amount, "USD");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });

        get("/convert/euro/*/to/yen", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("EUR", amount, "JPY");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });

        get("/convert/yen/*/to/dollar", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("JPY", amount, "USD");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });

        get("/convert/yen/*/to/euro", (req, res) ->
        {
            double amount = 0;
            try
            {
                amount = Double.parseDouble(req.splat()[0]);
                return MoneyConversion.Convert("JPY", amount, "EUR");
            }
            catch(Exception e){
                return "Invalid Money Amount";
            }
        });
    }
}