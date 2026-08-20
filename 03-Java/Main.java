public class Main {
    public static void main(String[] args) {

        Hero myHero = new Hero(); // コンストラクタの呼び出し

        // new Hero() - メモリ（RAM）の空き領域を探し、Heroクラスをそのまま複製して新規作成し、そのメモリアドレスを返します。

        // newの実行時に、ヒープ（Heap）領域へHeroクラスのデータを保存できるオブジェクト（インスタンス）が生成されます。

        myHero.name = "ironMan"; // 「.」は参照演算子であり、myHeroが指し示すオブジェクトのname変数にアクセスして値を代入します。
        myHero.hp = 100;

        myHero.attack();

        if (args.length == 0) {
            System.out.println("No arguments provided.");

            return; // メソッド内でreturnが実行されると、メソッドの実行が終了します。
        }
        System.out.println("Hero: " + args[0]);

        System.out.println("program end");
    }
}

// Javaプログラムを実行する際、ターミナルでコマンドを入力して実行した時点で、データがmainメソッドに渡されます。

// 入力値が想定より多く渡される分には問題ありませんが、少ないとエラーが発生します。

// 解決策：
// - if文を使って想定された入力数になるようチェックする
// - for文とlengthを活用してすべての入力値を処理する
// - 三項演算子を用いて柔軟に対応する