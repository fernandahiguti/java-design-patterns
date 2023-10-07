package dio.gof.facade;

import subsystem1.crm.CRMService;
import subsystem2.cep.CEPApi;

public class Facade {
    public void migrateClient(String name, String zipCode){
        String city = CEPApi.getInstance().recoverCity(zipCode);
        String state = CEPApi.getInstance().recoverState(zipCode);
        CRMService.registerClient(name, zipCode, city, state);
    }
}
