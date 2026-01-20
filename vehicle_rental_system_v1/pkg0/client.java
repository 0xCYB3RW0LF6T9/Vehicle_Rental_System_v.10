package vehicle_rental_system_v1.pkg0;

public class client extends vehicle {

    //name,id
    int hour;
    String Vehicle_name, mobile,email;

    void set_info_client(String a, String b, String m_num,String em) {

        name = a;
        id = b;
        mobile = m_num;
        email=em;
    }

    void rent(vehicle v[], int index, int time) {
        Vehicle_name = v[index].name;
        hour = time;

    }

    void show_client() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Mobile = " + mobile);
        System.out.println("Email = " + email);
        System.out.println("Rented Vehicle = " + Vehicle_name);
        System.out.println("Totoal costing = " + result);

    }

    void clacPrice(vehicle v[], int index) {
        result = hour * v[index].price;

    }

}
