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


    /**
     * @require stringday is a complete string representation of a day
     *
     * @param stringday
     * @return
     */
    public static Day stringToDay(String stringday){
        // xs is the list of variables to be passed to the Day constructor
        String[] xs = stringday.split(",");
        Double take = Double.parseDouble(xs[0]);
        Double hugo = Double.parseDouble(xs[1]);
        Double jess = Double.parseDouble(xs[2]);
        Double kate = Double.parseDouble(xs[3]);
        Double tim = Double.parseDouble(xs[4]);
        Double totalWages = Double.parseDouble(xs[5]);
        Double profit = Double.parseDouble(xs[6]);
        return new Day(take, hugo, jess, kate, tim, totalWages, profit, xs[7], xs[8]);
    }

    public static Week stringToWeek(String stringweek){
        String[] listOfDaysAndTotalProfit = stringweek.split("\n") ;
        Week week = new Week();

        // Does not count the final entry if the week is full
        if (listOfDaysAndTotalProfit.length >= 8) {

            for (int i = 0; i < listOfDaysAndTotalProfit.length - 1; i++) {
                week = new Week(week, stringToDay(listOfDaysAndTotalProfit[i]));
            }
        } else { // else it counts every line
            for (String day : listOfDaysAndTotalProfit){
                week = new Week(week, stringToDay(day));
            }
        }

        return week;

    }

}
