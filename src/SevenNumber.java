
public class SevenNumber {

    public static void main(String[] args) {
     // iの値を0から10より小さい間、1ずつカウントアップして繰り返す
        for (int i = 0; i < 101; i++) {

            // iの値が7で割り切れるとき
            if(i % 7 == 0 || i % 10 == 7 || i % 7 == 10) {
                // iの値を表示する
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }


        }
    }

}
