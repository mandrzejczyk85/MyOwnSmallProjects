package MyOwnProject.NotFinished.DirectionOfTheTripOnEurope;

import java.util.Arrays;
import java.util.Random;

public class Countries {

    static Random random = new Random();
    static String[] europeCountries = {"albania","andora","anglia","austria","bialorus","belgia","bosnia i hercegowina",
            "bulgaria","chorwacja","cypr","czarnogora","czechy","dania","estonia","finlandia","francja","grecja",
            "hiszpania","holandia","irlandia","litwa","luksemburg","lotwa","macedonia","malta","moldawia","niemcy",
            "norwegia","polska","portugalia","rumunia","san marino","serbia","slowacja","slowenia","szwajcaria","szwecja",
            "turcja","ukraina","wegry","wlochy"};

    static String country = europeCountries[random.nextInt(europeCountries.length)].toUpperCase();

    public static void main(String[] args) {
        System.out.println(country);
    }
}
