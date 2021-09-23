package Iterator.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // ¥°¡¼¤òÉ½¤¹ÃÍ
    public static final int HANDVALUE_CHO = 1;  // ¥Á¥ç¥­¤òÉ½¤¹ÃÍ
    public static final int HANDVALUE_PAA = 2;  // ¥Ñ¡¼¤òÉ½¤¹ÃÍ
    public static final Hand[] hand = {         // ¤¸¤ã¤ó¤±¤ó¤Î¼ê¤òÉ½¤¹3¤Ä¤Î¥¤¥ó¥¹¥¿¥ó¥¹
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // ¤¸¤ã¤ó¤±¤ó¤Î¼ê¤ÎÊ¸»úÎóÉ½¸½
            "グー", "チョキ", "パー",
    };
    private int handvalue;                      // ¤¸¤ã¤ó¤±¤ó¤Î¼ê¤ÎÃÍ
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // ÃÍ¤«¤é¥¤¥ó¥¹¥¿¥ó¥¹¤òÆÀ¤ë
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this¤¬h¤è¤ê¶¯¤¤¤È¤­true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this¤¬h¤è¤ê¼å¤¤¤È¤­true
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // °ú¤­Ê¬¤±¤Ï0, this¤Î¾¡¤Á¤Ê¤é1, h¤Î¾¡¤Á¤Ê¤é-1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // Ê¸»úÎóÉ½¸½¤ØÊÑ´¹
        return name[handvalue];
    }
}
