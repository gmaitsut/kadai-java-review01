package animal;

public class Human extends Animal implements Thinkable {

    //趣味の情報を保管するフィールドを定義してください
    //変数名は自由とします
    //カプセル化を使ってください
    private String interest;// 趣味


    //コンストラクタで名前・年齢・趣味の情報を格納する引数を設定し、
    //処理内容として名前・年齢・趣味の各変数を引数の情報で初期化するようにしてください
    //引数の名前は自由とします
    //名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用するようにしてください
    public Human() {
    }

    // 引数ありコンストラクタ
    public Human(String name, int age, String interest) {
        super(name, age);
        this.interest = interest;
  }
    public String getInterest(){
        return interest;
      }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    //think メソッドを実装してください。
    //このメソッドは、趣味のフィールドに入っている文字列の中身を利用して、
    //私は□□について考えています。 と画面に System.out.println() で表示するような処理としてください
    @Override
    public void think() {
        System.out.println("私は" + interest +"について考えています。" );

    }


}
