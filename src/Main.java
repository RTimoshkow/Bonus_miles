public class Main {

    public static void main(String[] args) {

        int ticketPrice = 200;
        int quantityRublesForOneBonusMile = 20;
        int bonusMiles = ticketPrice / quantityRublesForOneBonusMile;
        System.out.println("Вам начисленно " + bonusMiles + " бонусных миль");
    }
}
