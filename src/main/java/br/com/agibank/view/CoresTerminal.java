package br.com.agibank.view;

public class CoresTerminal {
    private static  final String RESET = "\u001B[0m";
    private static  final String RED = "\u001B[31m";
    private static  final String GREEN = "\u001B[32m";
    private static  final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

    public static String getRESET() {
        return RESET;
    }

    public static String getRED() {
        return RED;
    }

    public static String getGREEN() {
        return GREEN;
    }

    public static String getYELLOW() {
        return YELLOW;
    }

    public static String getBLUE() {
        return BLUE;
    }

}