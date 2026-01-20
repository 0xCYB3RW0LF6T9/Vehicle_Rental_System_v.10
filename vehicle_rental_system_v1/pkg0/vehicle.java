package vehicle_rental_system_v1.pkg0;

public class vehicle {

    String name;
    String id;
    int price;
    int hour, result;

    void set_info_vehicle(String a, String b, int c) {
        name = a;
        id = b;
        price = c;

    }

    void show_info_vehicle() {
        System.out.println("Name (Vehicle) = " + name);
        System.out.println("ID (Vehicle) = " + id);
        System.out.println("Total cost (Per_Hour) = " + price);
        

    }
}
