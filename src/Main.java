public class Main {
    public static void main(String[] args) {
        int ticketCost = 12750;
        int mileBonus = 1;
        int totalMiles = (ticketCost / 20) * mileBonus;
        System.out.println("Итого Вам начислено " + totalMiles + " миль");
    }
}
