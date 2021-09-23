package designPattern.bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");                          // ÏÈ¤Î³Ñ¤òÉ½¸½¤¹¤ë"+"¥Þ¡¼¥¯¤òÉ½¼¨¤¹¤ë¡£
        for (int i = 0; i < width; i++) {               // width¸Ä¤Î"-"¤òÉ½¼¨¤·¤Æ¡¢
            System.out.print("-");                      // ÏÈÀþ¤È¤·¤ÆÍÑ¤¤¤ë¡£
        }
        System.out.println("+");
    }
}
