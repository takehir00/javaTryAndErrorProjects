package designPattern.decorator;


public class Main {
    public static void main(String[] args) {

        StringDisplay sd = new StringDisplay("こんにちはまた後で");

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("おはようございます");
        md.add("こんにちは");
        md.add("おやすみなさい、また明日。");
        md.show();

//        SideBorder sb = new SideBorder(md, '@');
//        sb.show();

        FullBorder fb = new FullBorder(sd);
        fb.show();
    }


}
