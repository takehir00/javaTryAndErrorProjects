package Iterator.Singleton.Q1;

public class Triple {
    private static final Triple[] instanseList = new Triple[3];

    private Triple() {

    }

    public static Triple getInstance(int id) {
        return instanseList[id];
    }

}
