package animal;

public class Review04 {

    public static void main(String[] args) {
        //Humanクラスのインスタンスを3つ作成してください
        //それぞれ、変数名は tanaka・suzuki・sato とします
        //名前・年齢・趣味の各情報は、コンストラクタで初期化するようにしてください
        //それぞれ、以下のように初期値を設定してください
        Human tanaka = new Human();
        tanaka.setName("田中　太郎");
        tanaka.setAge(25);
        tanaka.setInterest("電車");

        tanaka.say();
        tanaka.think();

        Human suzuki = new Human();
        suzuki.setName("鈴木　次郎");
        suzuki.setAge(30);
        suzuki.setInterest("野球");

        suzuki.say();
        suzuki.think();

        Human sato = new Human();
        sato.setName("佐藤　花子");
        sato.setAge(20);
        sato.setInterest("映画");

        sato.say();
        sato.think();
    }

}
