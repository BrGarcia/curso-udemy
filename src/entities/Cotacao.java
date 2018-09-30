package entities;

public class Cotacao {
public static double dolar;
public static double IOF = 1.06;

public static double conversaoReal(double money){
    return dolar * money * 1.06;
}

}
