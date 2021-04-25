package ghozti.pokemon.game.savesys;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileCreator {

    private final String mainDir = System.getProperty("user.home") + "/" + "Pokemon2.0";

    private void createMainDir(){
        File directory = new File(mainDir);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    private void createSubDir(String name){
        File directory = new File(mainDir + "/" + name);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static void createFile(String path, String fileName, String content){
        File file = new File(path + "/" + fileName);
        if (!file.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile(File directory, String text) throws FileNotFoundException {
        if (!directory.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
                writer.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getFileText(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void deleteFile(File file){
        file.delete();
    }
}
