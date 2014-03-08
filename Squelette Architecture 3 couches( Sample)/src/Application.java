import com.yespapi.service.CustomerService;
import com.yespapi.service.CustomerServiceImpl;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
