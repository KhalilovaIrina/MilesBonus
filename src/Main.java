public class Main {
    public static void main(String[] args) {

        int ticketPrice = 10300;
        int milePrice = 20;

        int bonusMiles = ticketPrice / milePrice;

        System.out.println("Вам начислено " + bonusMiles + " бонусных миль.");

    }
}