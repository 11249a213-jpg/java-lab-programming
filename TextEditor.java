import java.io.*;

class TextEditor {
    public static void main(String[] args) throws IOException {
        String text = "Hello, this is my text file.";

        FileWriter fw = new FileWriter("text.txt");
        fw.write(text);
        fw.close();

        FileReader fr = new FileReader("text.txt");
        int ch;

        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);

        fr.close();
    }
}
