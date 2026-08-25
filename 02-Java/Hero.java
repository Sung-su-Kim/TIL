public class Hero {
    String name; // 該当クラスが保持する属性値を変数として宣言
    int hp;

    public void attack() {
        System.out.println(name + " attacks!");
    }
}

// ここに String[] args がない理由は、プログラムのエントリーポイント（開始点）である main メソッド専用だからです。

// このファイルは外部（コマンドライン）から入力値を受け取るのではなく、main クラス側から受け取るため、記述する必要はありません。
// もし外部（呼び出し元）から値を受け取って使いたい場合は、以下のような形式で記述します。

// public void attack(String enemy) {
//     System.out.println(name + "が " + enemy + "を攻撃した");
// }

// こうすることで、Main.java から呼び出す際に括弧（引数）の中でターゲットを指定できます。
// 例: myHero.attack("サノス");