//precode setup thing
import java.lang.Math;
public class Shipping {
    //private variables
    private boolean shareLetter;
    private String shipName;
    //default constructor
    public Shipping() {}
    //methods
    public String shipNameGenerator(String name1, String name2) {
        shipName = " ";
        shareLetter = false;
        if (name1.substring(0, 1).equals(name2.substring(0, 1))) {
            shipName = "The " + name1.substring(0, 1) + "'s!!!";
        }
        else if (name1.length() >= 4 && name2.length() >= 4) {
            for (int i = 0; i < name1.length(); i++) {
                for (int j = 0; j < name2.length(); j++) {
                    if (name2.substring(j, j + 1).equals(name1.substring(i, i + 1))) {
                        shareLetter = true;
                        shipName = name1.substring(0, i) + name2.substring(j);
                    }
                }
            }
            if (shareLetter == false) {
                shipName = name1.substring(0, 4) + name2.substring(0, 4);
            }
            return shipName;
        }
        else if (name1.length() < 4 && name2.length() > 4) {
            shipName = name1 + (name2.substring(name1.length()));
        }
        else if (name1.length() > 4 && name2.length() < 4) {
            shipName = name2 + (name1.substring(name2.length()));
        }
        else if (name1.length() > 4 && name2.length() > 4) {
            shipName = (name1.substring(0, 5) + name2.substring(0, 5));
        }
        else if (name1.length() <= 4 && name2.length() <= 4) {
            shipName = name1 + name2;
        }
        return shipName;
    }
}
