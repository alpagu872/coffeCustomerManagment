package Abstract;


import Entities.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws Exception;
}
