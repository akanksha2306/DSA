//package lowLevelDesign;
//
//import java.sql.Time;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//public class BookMyShowService {
//
//    List<CinemaHalls> cinema;
//
//    public List<Movies>getMovies(Date date, String city, String name);
//    public List<CinemaHalls> CinemaHalls(String City);
//    List<Movies> moviesList;
//    List<Cities> citiesList;
//    List<Customers> customersList;
//
//    public static class CinemaHalls{
//
//        int cinemalHallID;
//        String name;
//        LibraryManagement.Address address;
//        List <Audis> audisList;
//
//        public Map<Date, Movies> getMovies(){};
//        public Map<Date, Shows> getShows(){};
//
//
//        private class Audis {
//            int audiId;
//            String name;
//            int totalNumberOfAudies;
//            int totalNumberOfSeats;
//            List<Shows> showsList;
//        }
//    }
//    public class Shows{
//        Date startTime;
//        Date endTime;
//        List<Seats> seats;
//
//        int showId;
//        Movies movie;
//
//
//
//
//    }
//    public static class seats{
//
//    }
//
//    private class Movies {
//        String name;
//        String language;
//        String type;
//        shows;
//
//    }
//
//    private class Cities {
//    }
//
//    public enum type{
//
//        ROMANTIC,SCI_FIC,THriller,Documentary
//
//    }
//
//    private class Customers {
//    }
//}

package lowLevelDesign;

import java.util.List;

public class BookMyShow {

    List<CinemaHalls> cinemaHallsList;
    List<Movies> moviesList;
    List<Cities> citiesList;
    List<Customers> customersList;

    public static class CinemaHalls{



    }
    public class shows{
        S
    }
    public static class seats{

    }

    private class Movies {
        String name;
        String language;
        String type;
        shows;

    }

    private class Cities {
    }

    public enum type{

        ROMANTIC,SCI_FIC,THriller,Documentary

    }

    private class Customers {
    }
}
