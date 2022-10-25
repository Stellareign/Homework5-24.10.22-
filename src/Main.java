public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, задание 3:");
        int ticketsPurchasedSeats = 60;
        int ticketsPurchasedStanding = 42;
        int numbеrOfSeats = 60;
        int numberOfStandingPlcs = 42;
        int allNumberOfPassengers = 102;
        int numberFreeSeats = numbеrOfSeats - ticketsPurchasedSeats;
        int numberFreeStanding = numberOfStandingPlcs - ticketsPurchasedStanding;
        int totalNumberOfFreePlcs = numberFreeSeats + numberFreeStanding;
        if (totalNumberOfFreePlcs > 0 && totalNumberOfFreePlcs <= allNumberOfPassengers) {
            System.out.println("В вагоне есть свободные места места. Количество свободных мест " + totalNumberOfFreePlcs);
        }
        if (numberFreeSeats > 0 && numberFreeSeats <= 60) {
            System.out.println("В вагоне есть сидячие места. Количесвто сидячих мест " + numberFreeSeats);
        }
        if (numberFreeStanding > 0 && numberFreeStanding <= 42) {
            System.out.println("В вагоне есть стоячие места. Кличество стоячих мест " + numberFreeStanding);
        }
        if (numberFreeStanding == 0) {
            System.out.println("В вагоне нет свободных мест.");
        }
    }
}