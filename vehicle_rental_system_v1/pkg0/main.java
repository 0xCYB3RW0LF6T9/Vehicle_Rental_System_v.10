package vehicle_rental_system_v1.pkg0;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        vehicle[] v = new vehicle[100];
        client[] c = new client[100];
        int maxClient = 0, maxVehicle = 0;

        while (true) {
            System.out.println("1. Add vehicle information ");
            System.out.println("2. Add Client information ");
            System.out.println("3. View all vehicle information ");
            System.out.println("4. View all client information ");
            //System.out.println("4. View all client information ");

            System.out.println("0. Exit");

            System.out.print("Enter choice = ");
            x = input.nextInt();
            input.nextLine();
            if (x == 0) {
                break;
            }

            if (x == 1) {
                String name, id;
                int limit, price;
                System.out.print("Enter total Vehicles = ");
                limit = input.nextInt();
                input.nextLine();
                maxVehicle = limit;

                for (int i = 0; i < limit; i++) {
                    System.out.print("Enter Vehicle name = ");
                    name = input.nextLine();
                    System.out.print("Enter Vehicle ID = ");
                    id = input.nextLine();
                    System.out.print("Enter Vehicle Price = ");
                    price = input.nextInt();
                    input.nextLine();

                    v[i] = new vehicle();
                    v[i].set_info_vehicle(name, id, price);

                }

            }
            if (x == 2) {
                int limit;
                System.out.println("Enter total client = ");
                limit = input.nextInt();
                input.nextLine();
                maxClient = limit;
                for (int i = 0; i < limit; i++) {
                    String name, id;
                    System.out.print("Enter Name = ");
                    name = input.nextLine();
                    System.out.print("Enter National ID = ");
                    id = input.nextLine();
                    String mob;
                    System.out.print("Enter Mobile no = ");
                    mob = input.nextLine();
                    String email;
                    System.out.print("Enter Email = ");
                    email = input.nextLine();

                    System.out.print("Enter vehicle id = ");
                    int v_id;
                    v_id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter time for the vehicle = ");
                    int t;
                    t = input.nextInt();
                    input.nextLine();

                    c[i] = new client();
                    c[i].set_info_client(name, id, mob,email);
                    c[i].rent(v, v_id, t);
                    c[i].clacPrice(v, v_id);
                }

            }
            if (x == 3) {
                for (int i = 0; i < maxVehicle; i++) {
                    v[i].show_info_vehicle();
                }

            }
            if (x == 4) {
                for (int i = 0; i < maxClient; i++) {
                    c[i].show_client();
                }

            }

        }

    }

}
