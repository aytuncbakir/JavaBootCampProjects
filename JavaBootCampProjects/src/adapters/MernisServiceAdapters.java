package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		//MernisServiceReference.KPSPublicSoapClient client = new KPSPublicSoapClient();
		// return client.TCKimlikDogrula(.......)
		return true;
	}

}
