package lamda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int sub(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // 宣言した関数を関数オブジェクトに代入する
        MyFunction func = Main::sub;
        int result = func.call(2,5);
        System.out.println("計算結果:" + result);

        // 関数を宣言せず利用タイミングで生成し、即時利用する(ラムダを理解するためにここでは略記を使わない)
        MyFunction func2 = (x, y) -> {return x + y;};

        List<String> list = new ArrayList<>();
        list.add("hoge");
        list.add("piyo");
        list.add("fuga");
        list.forEach(System.out::println);

    }
}
