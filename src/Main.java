public class Main {
    public static void main(String[] args) {
        int fallCost = 13;
        int winterCost = 17;
        int springCost = 12;
        int summerCost = 9;
        int totalCost;

        totalCost = fallCost + winterCost + springCost + summerCost;

        System.out.println("The total yearly maintenance costs based on the fall cost of $" + fallCost + ", the winter cost of $" +
                winterCost + ", the spring cost of $" + springCost + " and the summer cost of $" + summerCost + " is $" + totalCost);
    }
}