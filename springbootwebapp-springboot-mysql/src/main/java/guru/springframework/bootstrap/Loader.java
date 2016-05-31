package guru.springframework.bootstrap;

import guru.springframework.domain.Customer;
import guru.springframework.repositories.CustomerRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Loader implements ApplicationListener<ContextRefreshedEvent> {

    private CustomerRepository customerRepository;

    private Logger log = Logger.getLogger(Loader.class);

    @Autowired
    public void setCustomerDocumentsRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Customer cust1 = new Customer();
        cust1.setName("Alex Hales");
        cust1.setId(new Integer(001));
        cust1.setEmail("hales@lntinfotech.com");
        cust1.setType("AFF");
        customerRepository.save(cust1);
        
        Customer cust2 = new Customer();
        cust2.setName("Jason Roey");
        cust2.setId(new Integer(002));
        cust2.setEmail("roy@lntinfotech.com");
        cust2.setType("HNI");
        customerRepository.save(cust2);

    }
}
