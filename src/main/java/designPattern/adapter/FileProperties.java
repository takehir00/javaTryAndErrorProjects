package designPattern.adapter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
/**
練習問題2-2回答 by 俺
 回答はjava6より古くinputStreamとかoutPutStreamでやってたのでbufferedとかpaths使って実装
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        Path path = Paths.get("/Users/takehir00/projects/javaProjects/java-design-patern学習/src/main/resources/" + fileName);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            load(reader);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        Path path = Paths.get("/Users/takehir00/projects/javaProjects/java-design-patern学習/src/main/resources/" + fileName);
        try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            store(writer, "writtenByFileProperties");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void setValue(String key, String value) throws IOException {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
