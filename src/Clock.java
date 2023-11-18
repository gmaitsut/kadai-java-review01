
public class Clock {

    public static void main(String[] args) {
        // int
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);
    }

        //int型引数３つ受け取るaddメソッドの定義（戻り値なし）
        public static int getSeconds(int h, int m, int s) {
            int result = h * 3600 + m * 60 + s;
            return result;
        }

    }


