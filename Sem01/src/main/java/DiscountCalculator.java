
public class DiscountCalculator {
public static double calculatingDiscount(double purchaseAmount, int discountAmount){
    if(purchaseAmount < 0 || discountAmount < 0) throw new ArithmeticException("Недопустимый ввод");
    return purchaseAmount - discountAmount;
}
}
