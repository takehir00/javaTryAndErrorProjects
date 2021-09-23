package designPattern.builder;

public abstract class Builder {
    private boolean initialized;
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
