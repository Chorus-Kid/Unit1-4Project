//precode setup
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
        if (name1.equals(name2)) {
            shipName = "Just " + name1;
        }
        else if (name1.substring(0, 1).equals(name2.substring(0, 1))) {
            shipName = "The " + name1.substring(0, 1) + "'s!!!";
        }
        else if (name1.length() >= 4 && name2.length() >= 4) {
            for (int i = 0; i < name1.length(); i++) {
                for (int j = 0; j < name2.length(); j++) {
                    if (name2.charAt(j) == name1.charAt(i) && name2.charAt(name2.length() - 1) != name1.charAt(i)) {
                        shareLetter = true;
                        shipName = name1.substring(0, i) + name2.substring(j);
                        return shipName;
                    }
                }
            }
            if (shareLetter == false) {
                shipName = name1.substring(0, 4) + name2.substring(name2.length() - 4, name2.length());
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
    //just in case someone has numbers as their name
    public String shipNameGenerator(int name1, String name2) {
        shipName = " ";
        shareLetter = false;
        String nameOne = Integer.toString(name1);
        if (nameOne.substring(0, 1).equals(name2.substring(0, 1))) {
            shipName = "The " + nameOne.substring(0, 1) + "'s!!!";
        }
        else if (nameOne.length() >= 4 && name2.length() >= 4) {
            for (int i = 0; i < nameOne.length(); i++) {
                for (int j = 0; j < name2.length(); j++) {
                    if (name2.charAt(j) == nameOne.charAt(i)) {
                        shareLetter = true;
                        shipName = nameOne.substring(0, i) + name2.substring(j);
                    }
                }
            }
            if (shareLetter == false) {
                shipName = nameOne.substring(0, 4) + name2.substring(name2.length() - 4, name2.length());
            }
            return shipName;
        }
        else if (nameOne.length() < 4 && name2.length() > 4) {
            shipName = name1 + (name2.substring(nameOne.length()));
        }
        else if (nameOne.length() > 4 && name2.length() < 4) {
            shipName = name2 + (nameOne.substring(name2.length()));
        }
        else if (nameOne.length() > 4 && name2.length() > 4) {
            shipName = (nameOne.substring(0, 5) + name2.substring(0, 5));
        }
        else if (nameOne.length() <= 4 && name2.length() <= 4) {
            shipName = name1 + name2;
        }
        return shipName;
    }
    public String shipNameGenerator(String name1, int name2) {
        shipName = " ";
        shareLetter = false;
        String nameTwo = Integer.toString(name2);
        if (name1.substring(0, 1).equals(nameTwo.substring(0, 1))) {
            shipName = "The " + name1.substring(0, 1) + "'s!!!";
        }
        else if (name1.length() >= 4 && nameTwo.length() >= 4) {
            for (int i = 0; i < name1.length(); i++) {
                for (int j = 0; j < nameTwo.length(); j++) {
                    if (nameTwo.charAt(j) == name1.charAt(i)) {
                        shareLetter = true;
                        shipName = name1.substring(0, i) + nameTwo.substring(j);
                    }
                }
            }
            if (shareLetter == false) {
                shipName = name1.substring(0, 4) + nameTwo.substring(nameTwo.length() - 4, nameTwo.length());
            }
            return shipName;
        }
        else if (name1.length() < 4 && nameTwo.length() > 4) {
            shipName = name1 + (nameTwo.substring(name1.length()));
        }
        else if (name1.length() > 4 && nameTwo.length() < 4) {
            shipName = name2 + (name1.substring(nameTwo.length()));
        }
        else if (name1.length() > 4 && nameTwo.length() > 4) {
            shipName = (name1.substring(0, 5) + nameTwo.substring(0, 5));
        }
        else if (name1.length() <= 4 && nameTwo.length() <= 4) {
            shipName = name1 + name2;
        }
        return shipName;
    }
    public String shipNameGenerator(int name1, int name2) {
        shipName = " ";
        shareLetter = false;
        String nameOne = Integer.toString(name1);
        String nameTwo = Integer.toString(name2);
        if (nameOne.substring(0, 1).equals(nameTwo.substring(0, 1))) {
            shipName = "The " + nameOne.substring(0, 1) + "'s!!!";
        }
        else if (nameOne.length() >= 4 && nameTwo.length() >= 4) {
            for (int i = 0; i < nameOne.length(); i++) {
                for (int j = 0; j < nameTwo.length(); j++) {
                    if (nameTwo.charAt(j) == nameOne.charAt(i)) {
                        shareLetter = true;
                        shipName = nameOne.substring(0, i) + nameTwo.substring(j);
                    }
                }
            }
            if (shareLetter == false) {
                shipName = nameOne.substring(0, 4) + nameTwo.substring(nameTwo.length() - 4, nameTwo.length());
            }
            return shipName;
        }
        else if (nameOne.length() < 4 && nameTwo.length() > 4) {
            shipName = name1 + (nameTwo.substring(nameOne.length()));
        }
        else if (nameOne.length() > 4 && nameTwo.length() < 4) {
            shipName = name2 + (nameOne.substring(nameTwo.length()));
        }
        else if (nameOne.length() > 4 && nameTwo.length() > 4) {
            shipName = (nameOne.substring(0, 5) + nameTwo.substring(0, 5));
        }
        else if (nameOne.length() <= 4 && nameTwo.length() <= 4) {
            shipName = nameOne + name2;
        }
        return shipName;
    }
    public void compatibilityPercent(String name1, String name2) {
        if (name1.equals(name2)) {
            System.out.println("Y'know what? Frick romance.\n∞%\nHappiness comes from within, not from someone else \uD83D\uDE0E\nYou don't need to be in love to be happy!");
        }
        else if (!name1.equals(name2)){
            int percent = (int) (Math.random() * 100);
            if (percent == 0) {
                System.out.print("0%\nEUGH absolutely abhorrent. Shame on you if you ship this.");
            } else if (percent == 100) {
                System.out.print("100%!!!!!\nThey're literally perfect for each other!!!!!");
            } else if (percent <= 99 && percent >= 95) {
                System.out.print(percent + "%\nThey're married with kids and they told me this themselves trust me");
            } else if (percent <= 94 && percent >= 90) {
                System.out.print(percent + "%\nYour ship is basically canon at this point");
            } else if (percent <= 89 && percent >= 80) {
                System.out.print(percent + "%\nYour ship must be pretty popular if it's this compatible");
            } else if (percent <= 79 && percent >= 70) {
                System.out.print(percent + "%\nY'know what? That's about a 3 out of 4 chance they'll be good together. Those are some pretty good odds.");
            } else if (percent == 69) {
                System.out.print("69%\nNice.");
            } else if (percent <= 68 && percent >= 60) {
                System.out.print(percent + "%\nIt's getting there, yeah. I can see why people would ship this");
            } else if (percent <= 59 && percent >= 50) {
                System.out.print(percent + "%\nMight or might not be better off as friends tbh");
            } else if (percent <= 49 && percent >= 40) {
                System.out.print(percent + "%\nThat's a pretty nice rare pair you got there");
            } else if (percent <= 39 && percent >= 30) {
                System.out.print(percent + "%\n...\nI mean... they MIGHT be good together...\nNot too sure though...");
            } else if (percent <= 29 && percent >= 20) {
                System.out.print(percent + "%\nYou uhhhh... Sure that they would go well together? You really really sure?");
            } else if (percent <= 19 && percent >= 11) {
                System.out.print(percent + "%\nHooo BOY you got some weird conceptions about love");
            } else if (percent <= 10 && percent >= 1) {
                System.out.print(percent + "%\nThey uhhhhh... Ummmm...\nIdk what to say");
            }
        }
    }
}
