import java.lang.Math;
/**
 * This is where the ship name and compatibility percent is generated!
 */
public class Shipping {
    private boolean shareLetter;
    private String shipName;

    /**
     * Creates an instance of someone wanting to ship two people whenever the code boots up
     */
    public Shipping() {}

    /**
     *Creates the portmanteau of the two names the user wants to combine
     * @param name1 represents the first name
     * @param name2 represents the second name
     * @return returns the smushed together name.
     * The basis of how to combine names are different depending on if the two names have shared letters and the length of the names
     * If both names have a common letter, they will be combined by that letter (i.e. Akito + Toya = Akitoya)
     * If both names do NOT have a common letter and both name1 and name2 have at least 4 letters in their name
     * the ship name will be the first 4 letters of name1 and the last 4 letters of name2
     * (i.e. Cabanela + Yomie = Cabaomie)
     * However, if either name1 or name2 is less than 4 letters long, the full name of whichever one is shorter will replace the first n letters of the longer name
     * regardless if they have a shared letter or not
     * (i.e. Tsukasa + Rui = Ruikasa)
     * If both name1 and name2 have 4 or fewer letters in both of them, then the full names will be smushed together (i.e. Rui + Nene = Ruinene)
     * If the first letter of both names are the same, then the ship name will be "The [insert first letter here]'s!!!"
     * (i.e. An + Akito = The A's!!!)
     * If the names are the exact same (aka the user put the same person twice, then the name will be "Just [insert name here]"
     * (i.e. Monika + Monika = Just Monika)
     */
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
                        name2 = name2.toLowerCase();
                        shipName = name1.substring(0, i) + name2.substring(j);
                        return shipName;
                    }
                }
            }
            if (shareLetter == false) {
                name2 = name2.toLowerCase();
                shipName = name1.substring(0, 4) + name2.substring(name2.length() - 4);
            }
            return shipName;
        }
        else if (name1.length() < 4 && name2.length() > 4) {
            shipName = name1 + (name2.substring(name1.length()));
        }
        else if (name1.length() > 4 && name2.length() < 4) {
            shipName = name2 + (name1.substring(name2.length()));
        }
        else if (name1.length() <= 4 && name2.length() <= 4) {
            name2 = name2.toLowerCase();
            shipName = name1 + name2;
        }
        return shipName;
    }

    /**
     * This method follows most of the same rules as above. This is in case name1 is fully composed of numbers.
     * @param name1 represents the first name (full of numbers)
     * @param name2 represents the second name
     * @return returns the portmanteau following the same rules as above without the shared letters of course
     */
    public String shipNameGenerator(int name1, String name2) {
        shipName = " ";
        String nameOne = Integer.toString(name1);
        if (nameOne.length() < 4 && name2.length() > 4) {
            shipName = name1 + (name2.substring(nameOne.length()));
        }
        else if (nameOne.length() > 4 && name2.length() < 4) {
            shipName = name2 + (nameOne.substring(name2.length()));
        }
        else if (nameOne.length() <= 4 && name2.length() <= 4) {
            shipName = name1 + name2;
        }
        return shipName;
    }

    /**
     * The same as the method before except in this case name2 is the name that's only numbers
     * @param name1 represents the first name
     * @param name2 represents the second name (full of numbers)
     * @return returns the portmanteau following the same rules as above without the shared letters of course
     */
    public String shipNameGenerator(String name1, int name2) {
        shipName = " ";
        String nameTwo = Integer.toString(name2);
        if (name1.length() < 4 && nameTwo.length() > 4) {
            shipName = name1 + (nameTwo.substring(name1.length()));
        }
        else if (name1.length() > 4 && nameTwo.length() < 4) {
            shipName = name2 + (name1.substring(nameTwo.length()));
        }
        else if (name1.length() <= 4 && nameTwo.length() <= 4) {
            shipName = name1 + name2;
        }
        return shipName;
    }

    /**
     * In the case both names are entirely composed of numbers
     * @param name1 represents the first name (full of numbers)
     * @param name2 represents the second name (also full of numbers)
     * @return returns the portmanteau with the same rules as the first method
     */
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
        else if (nameOne.length() <= 4 && nameTwo.length() <= 4) {
            shipName = nameOne + name2;
        }
        return shipName;
    }

    /**
     * This method prints a randomly generated percent and a comment that goes along with the percent.
     * If the names are the exact same, then the generator will print a special percent and comment.
     * @param name1 represents the first name. It's only here to check if the names are the exact same.
     * @param name2 represents the second name. It's only here to check if the names are the exact same.
     */
    public String compatibilityPercent(String name1, String name2) {
        if (name1.equals(name2)) {
            String celibacySWEEP = "Y'know what? Frick romance.\n∞%\nHappiness comes from within, not from someone else \uD83D\uDE0E\nYou don't need to be in love to be happy!";
            return celibacySWEEP;
        } else if (!name1.equals(name2)) {
            int percent = (int) (Math.random() * 100);
            if (percent == 0) {
                String die = "0%\nEUGH absolutely abhorrent. Shame on you if you ship this.";
                return die;
            } else if (percent == 100) {
                String LIVE = "100%!!!!!\nThey're literally perfect for each other!!!!!";
                return LIVE;
            } else if (percent <= 99 && percent >= 95) {
                String married = percent + "%\nThey're married with kids and they told me this themselves trust me";
                return married;
            } else if (percent <= 94 && percent >= 90) {
                String canon = percent + "%\nYour ship is basically canon at this point";
                return canon;
            } else if (percent <= 89 && percent >= 80) {
                String popular = percent + "%\nYour ship must be pretty popular if it's this compatible";
                return popular;
            } else if (percent <= 79 && percent >= 70) {
                String testYourLuck = percent + "%\nY'know what? That's about a 3 out of 4 chance they'll be good together. Those are some pretty good odds.";
                return testYourLuck;
            } else if (percent == 69) {
                String lennyFace = "69%\nNice.";
                return lennyFace;
            } else if (percent <= 68 && percent >= 60) {
                String mmmmm = percent + "%\nIt's getting there, yeah. I can see why people would ship this";
                return mmmmm;
            } else if (percent <= 59 && percent >= 50) {
                String coinToss = percent + "%\nMight or might not be better off as friends tbh";
                return coinToss;
            } else if (percent <= 49 && percent >= 40) {
                String rarePair = percent + "%\nThat's a pretty nice rare pair you got there";
                return rarePair;
            } else if (percent <= 39 && percent >= 30) {
                String maybe = percent + "%\n...\nI mean... they MIGHT be good together...\nNot too sure though...";
                return maybe;
            } else if (percent <= 29 && percent >= 20) {
                String stretchingIt = percent + "%\nYou uhhhh... Sure that they would go well together? You really really sure?";
                return stretchingIt;
            } else if (percent <= 19 && percent >= 11) {
                String wtf = percent + "%\nHooo BOY you got some weird conceptions about love";
                return wtf;
            } else if (percent <= 10 && percent >= 1) {
                String stop = percent + "%\nThey uhhhhh... Ummmm...\nIdk what to say";
                return stop;
            }
        }
        return "how'd you get here";
    }
}
