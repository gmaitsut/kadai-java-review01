
public class Review01 {

    public static void main(String[] args) {
        //
        int taxrate = 10;
        int percent = 100;
        int price = 1500;
        double result = taxpercent(taxrate, percent);
        int result2 = tax(price, result);

        System.out.println(price + "円の商品の税込価格は" + (price + result2) + "円（消費税額は" + (result2) + "円）です。");
    }

    public static int tax(int price,double result) {
        //消費税額
        int result2 = (int) (price * result);
        return result2;
    }
    public static double taxpercent(int taxrate, int percent) {
        //消費税率
        double result = ((double)taxrate / percent);
        return result;
    }



}
