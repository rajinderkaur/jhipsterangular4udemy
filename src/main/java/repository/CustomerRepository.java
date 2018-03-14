package repository;

import java.util.List;

import domain.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
}
