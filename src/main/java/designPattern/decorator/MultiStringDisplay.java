package designPattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private List<String> stringList = new ArrayList<>();

    public void add(String string) {
        stringList.add(string);
    }

    @Override
    public int getColumns() {
        String maxString = "";
        for (String s : stringList) {
            if (s.getBytes().length > maxString.getBytes().length) {
                maxString = s;
            }
        }
        return maxString.getBytes().length;
    }

    @Override
    public int getRows() {
        return stringList.size();
    }

    @Override
    public String getRowText(int row) {
        String string = stringList.get(row);
        StringBuilder sb = new StringBuilder();

        //最大文字数の要素との差分を取得、差分だけホワイトスペースを入れる。
        int co = getColumns();
        int b = string.getBytes().length;

        int diff = getColumns() - string.getBytes().length;
        for (int i = 0; i < diff; i++) {
            sb.append(' ');
        }
        return string + sb.toString();
    }
}
