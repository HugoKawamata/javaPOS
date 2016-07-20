package tracker;

import java.io.*;
import java.util.*;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class LogReader {

    public static Orderlog read(String filename) throws IOException{
        return stringToLog(fileToString(filename));

    }

    private static String fileToString(String filename) throws IOException{
        // tempstr is a temporary string which is used to write to out.
        String tempstr;

        // out is the final string which will be returned.
        // out may contain several newlines depending on how many sections
        // are specified in the file.
        String out = "";

        // try with resources
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((tempstr = br.readLine()) != null){
                if (out.equals("")){
                    out += tempstr;
                } else {
                    out += System.getProperty("line.separator") + tempstr;
                }
            }
            return out;
        }
    }

    private static Orderlog stringToLog(String stringlog){

        Orderlog log = new Orderlog();
        ArrayList<String[]> listedFile = new ArrayList<>();

        for (String line : stringlog.split("\n")){
            listedFile.add(line.split(" "));
        }

        for (String[] pair : listedFile){
            Food tempFood = new Food(pair[0]);
            Integer tempNum;
            try{
                tempNum = Integer.parseInt(pair[1]);
            } catch (NumberFormatException e){
                return new Orderlog();
            }
            log.addOrder(tempFood, tempNum);
        }

        return log;
    }

    public static void write(Orderlog log, String filename)
            throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        writer.print(log.toString());
    }

}
