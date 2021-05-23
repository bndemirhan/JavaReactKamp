package oop4CoffeeShop.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import oop4CoffeeShop.Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result = true;

        try {
             result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")),
                                                customer.getLastName().toUpperCase(new Locale("tr")),customer.getTimeOfBirth());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return result;
  
	}

}
