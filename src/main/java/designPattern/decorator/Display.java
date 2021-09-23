package designPattern.decorator;

/**
 * 複数行からなる文字列を表示するための抽象クラス
 */
public abstract class Display {
    /**
     * 横の文字数を得る
     * @return
     */
    public abstract  int getColumns();

    /**
     * たての行数を得る
     * @return
     */
    public abstract int getRows();

    /**
     * row番目の文字列を得る
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * 全部表示する
     */
    public final void show() {
        for (int i=0; i<getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }


}
