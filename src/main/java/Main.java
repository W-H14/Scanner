import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("\nPlease enter the details of your items:");


            double totalCost = 0;

                System.out.print("Enter product name: ");
                String product = scanner.next();


                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                System.out.print("Enter price per item: ");
                double price = scanner.nextDouble();

                System.out.print("Enter distance (in miles): ");
                double distance = scanner.nextDouble();


                double itemTotal = quantity * price + getDistanceFee(distance);



                System.out.println(product + "     " + quantity + "   " + price + "   " + distance + "   " + itemTotal);



            System.out.println("Product\t\tQty\tPrice\tTotal");
            System.out.println("------\t\t---\t-----\t-----");

            System.out.println(product+"\t\t "+quantity+"\t "+price+"\t "+itemTotal);
            System.out.println(" ");
            System.out.println("\t\tThank you. Come Again!!!");
        }

        public static double getDistanceFee(double distance) {
            if (distance >= 0 && distance <= 5) {
                return 2.0;
            } else if (distance <= 15) {
                return 5.0;
            } else if (distance <= 25) {
                return 10.0;
            } else if (distance <= 50) {
                return 15.0;
            } else {
                return 20.0;
            }
        }
    }
