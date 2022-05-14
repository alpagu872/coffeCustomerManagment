
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer hasan = new Customer(1,"Abdüssamed","Etli",2000,2345);

        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());


        customerManager.save(hasan);
    }
}
