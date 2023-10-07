package subsystem1.crm;

public class CRMService {

    private CRMService(){
        super();
    }
    public static void registerClient (String name, String zipCode, String city, String state) {
        System.out.println("Client registered successfully on CRM!");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(city);
        System.out.println(state);
    }
}
