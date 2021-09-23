package designPattern.composite;

public class Main {
    public static void main(String[] args) {
        Directory hospitalDir = new Directory("hospital");
        Directory profileDir = new Directory("profile");
        Directory areaDir = new Directory("area");
        hospitalDir.add(profileDir);
        hospitalDir.add(areaDir);

        File yuki = new File("yuki", 100);
        File taro = new File("taro", 200);
        profileDir.add(yuki);
        profileDir.add(taro);

        hospitalDir.printList();
    }
}
