package MyOwnProject.NotFinished.DirectionOfTheTripOnEurope;

import java.util.Random;

public class TripDirectionMain {


    public static void main(String[] args) {
        Random random = new Random();
        Countries countries = new Countries();
//        String country = countries.country;

//        String[] europeCountries = {"Albania", "Andora", "Anglia", "Austria", "Białoruś", "Belgia", "Bośnia i Hercegowina",
//                "Bułgaria", "Chorwacja", "Cypr", "Czarnogóra", "Czechy", "Dania", "Estonia", "Finlandia", "Francja",
//                "Grecja", "Hiszpania", "Holandia", "Irlandia", "Litwa", "Luksemburg", "Łotwa", "Macedonia", "Malta",
//                "Mołdawia", "Niemcy", "Norwegia", "Polska", "Portugalia", "Rumunia", "San Marino", "Serbia", "Słowacja",
//                "Słowenia", "Szwajcaria", "Szwecja", "Turcja", "Ukraina", "Węgry", "Włochy"};

//        String country = europeCountries[random.nextInt(europeCountries.length)];
//        System.out.println(country);


//        String[] albania =              {"Tirana","Durrës","Szkodra","Wlora","Elbasan"};
//        String[] andora =               {"Andora","Escaldes-Engordany","Sant Julià de Lòria","Encamp","La Massana"};
//        String[] anglia =               {"Londyn","Birmingham","Leeds","Glasgow","Sheffield"};
//        String[] austria =              {"Wiedeń", "Graz", "Linz", "Salzburg", "Innsbruck"};
//        String[] bialorus =             {"Mińsk", "Homel", "Witebsk", "Mohylew", "Grodno"};
//        String[] belgia =               {"Antwarpia", "Gandawa", "Charleroi", "Liège", "Bruksela"};
//        String[] bosniaIHercegowina =   {"Sarajewo", "Banja Luka", "Tuzla", "Zenica", "Mostar"};
//        String[] bulgaria =             {"Sofia", "Płowdiw", "Warna", "Burgas","Ruse"};
//        String[] chorwacja =            {"Zagrzeb", "Split", "Rijeka", "Osijek", "Zadar"};
//        String[] cypr =                 {"Nikozja", "Limassol", "Strowolos", "Larnaka", "Famagusta"};
//        String[] czarnogora =           {"Podgorica", "Nikšić", "Pljevlja", "Cetynia", "Bar"};
//        String[] czechy =               {"Praga", "Brno", "Ostrawa", "Pilzno", "Liberec"};
//        String[] dania =                {"Kopenhaga", "Aarhus", "Odense", "Aalborg", "Frederiksberg"};
//        String[] estonia =              {"Tallinn", "Tartu", "Narwa", "Kohtla-Järve", "Pärnu"};
//        String[] finlandia =            {};
//        String[] francja =              {};
//        String[] grecja =               {};
//        String[] hiszpania =            {};
//        String[] holandia =             {};
//        String[] irlandia =             {};
//        String[] litwa =                {};
//        String[] luksemburg =           {};
//        String[] lotwa =                {};
//        String[] macedonia =            {};
//        String[] malta =                {};
//        String[] moldawia =             {};
//        String[] niemcy =               {};
//        String[] norwegia =             {};
//        String[] polska =               {};
//        String[] portugalia =           {};
//        String[] rumunia =              {};
//        String[] sanMarino =            {};
//        String[] serbia =               {};
//        String[] slowacja =             {};
//        String[] slowenia =             {};
//        String[] szwajcaria =           {};
//        String[] szwecja =              {};
//        String[] turcja =               {};
//        String[] ukraina =              {};
//        String[] wegry =                {};
//        String[] wlochy =               {};
//
//        String albaniaCity      = albania[random.nextInt(albania.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String angliaCity       = anglia[random.nextInt(anglia.length)];
//        String austriaCity      = austria[random.nextInt(austria.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity       = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//        String andoraCity = andora[random.nextInt(andora.length)];
//
//        if (country.equals(country)) {
//            System.out.println("Kraj: "+country+"\n"+"Miasto: "+ albaniaCity);
//        } else if (country.equals("Andora")) {
//            System.out.println("Kraj: "+country+"\n"+"Miasto: "+ andoraCity);
//
//        }
//
//
//
    }
}
