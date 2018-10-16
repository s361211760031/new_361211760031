package lab9;

import java.io.*;

public class FileDomo {
    public static void main(String[] args) {

        try {
            File myFile = new File("D:\\361211760031\\src\\lab9\\mit.txt");//mit.txt
            if (myFile.createNewFile())
                System.out.println("New File created.");
            else
                System.out.println("File already exited.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //write Filo
        //WrileMyFile();
        //readFilo
        readMyFile();

    }//mail

    private static void readMyFile() {
        try {
            FileReader reader = new FileReader("D:\\361211760031\\src\\lab9\\mit.txt");
            int i;
            while ((i = reader.read()) != -1) {
                    System.out.println((char) i);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//




    private static void wrileMyFile() {
        Writer w = null;
        try {
            w = new FileWriter("D:\\361211760031\\src\\lab9\\mit.txt", true);
            String content = "MIT SAIYAT 2018";
            w.write(content);
            System.out.println("Done.");
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            try {
                w.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}
