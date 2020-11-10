package com.company;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriterToFile {

    private static Formatter output;

    private static String fileName = "superheroes.txt";

    public void CreateTextFile() {
        OpenFile();
        AddRecords();
        CloseFile();

    }

    public void CreateTextFile(String _filename) {
        fileName = _filename;
        OpenFile();
        //add records();
        AddCapitalCities();
        CloseFile();

    }


    public static void OpenFile() {
        try {
            output = new Formatter(fileName);
        }
        catch (SecurityException securityException) {
            System.out.println("write permission denied");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("error opening file, terminating");
            System.exit(1);

        }




    }
    public static void AddRecords() {

        for(int i=0; i < 10; i++) {
            output.format("This line %d %n", i);
        }


    }

    public static void AddCapitalCities() {


        output.format("Ireland %s %n", "Dublin");
        output.format("England %s %n", "London");
        output.format("France %s %n", "Paris");
    }




        public static void CloseFile() {
        if (output != null) {
            output.close();
        }



    }


}
