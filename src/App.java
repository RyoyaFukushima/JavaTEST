import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import bean.FooBean;
import func.CollectionTask;
import func.TestBeanListFactory;

public class App {
    public static void main(String[] args) throws Exception {
        TestBeanListFactory factory = new TestBeanListFactory();

        for (FooBean f : factory.fooBeanList()) {
            System.out.println(f.getValue1() + f.getValue2());
        }

        try {
            // 出力ファイルの作成
            FileWriter fw = new FileWriter("Userdata.csv", false);
            // PrintWriterクラスのオブジェクトを生成
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            // ヘッダーの指定
            pw.print("value1             ");
            pw.print(",");
            pw.print("value2             ");
           
            pw.println();

            // データを書き込む

            for (FooBean f : factory.fooBeanList()) {
                System.out.println(f.getValue1() + f.getValue2());
                pw.print(f.getValue1());
                pw.print(",");
                pw.print(f.getValue2());

                pw.println();
            }
            // ファイルを閉じる
            pw.close();

            // 出力確認用のメッセージ
            System.out.println("csvファイルを出力しました");

            // 出力に失敗したときの処理
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
// https://qiita.com/neko_the_shadow/items/2b41b05fb0440ca8410e