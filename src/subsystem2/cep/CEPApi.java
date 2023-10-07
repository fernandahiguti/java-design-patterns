package subsystem2.cep;

public class CEPApi {
    private static CEPApi instance = new CEPApi();

    private CEPApi(){
        super();
    }

    public static CEPApi getInstance() {
        return instance;
    }

    public String recoverCity(String zipCode){
        return "São Paulo";
    }

    public String recoverState(String zipCode){
        return "SP";
    }
}
