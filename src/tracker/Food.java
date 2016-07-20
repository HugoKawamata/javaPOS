package tracker;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class Food {

    private String name;
    private String size;
    private Double cost;

    public Food(String name){
        this.name = name;
        switch (this.name){
            // Coffee and cake
            case "SLICE": cost = 4.0;
                break;
            case "CAKE": cost = 5.0;
                break;

            // Brunch
            case "BNC": cost = 12.0;
                break;
            case "VIL": cost = 14.0;
                break;
            case "VEG": cost = 11.0;
                break;
            case "SAM": cost = 10.0;
                break;
            case "PAN": cost = 12.0;
                break;
            case "BBQ": cost = 8.0;
                break;
            case "ASS": cost = 13.0;
                break;
            case "BRBURG": cost = 14.0;
                break;
            case "RAI": cost = 5.0;
                break;

            // Weekdays
            case "HCT": cost = 6.0;
                break;
            case "CCA1": cost = 7.0;
                break;
            case "CCA2": cost = 7.5;
                break;
            case "BPIE": cost = 6.5;
                break;
            case "CPIE": cost = 8.5;
                break;
            case "QUI": cost = 7.5;
                break;
            case "CHW": cost = 6.5;
                break;
            case "SAL": cost = 2.0;
                break;
            case "BURG": cost = 8.0;
                break;
            case "BURGNC": cost = 10.0;
        }
    }

    public Food(String name, String size){
        this.name = name;
        this.size = size;
        switch (this.size){
            case "CUP": cost = 3.5;
                break;
            case "MUG": cost = 4.0;
                break;
            case "DUB": cost = 5.0;
                break;
            case "BKT": cost = 5.0; //TODO: check correct pricing
                break;
        }
    }

    public Double getCost(){
        return this.cost + 0;
    }

    public String getName(){
        return this.name;
    }
}
