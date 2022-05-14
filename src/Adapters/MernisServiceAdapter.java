package Adapters;


import Abstract.CustomerCheckService;
import Entities.Customer;
import mernisReferanceService.JLVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        JLVKPSPublicSoap client = new JLVKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getNationalId(),customer.getFirstName().toUpperCase(),customer.getLastName(),customer.getDateOfBirth());
    }
}
