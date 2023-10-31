package in.saffu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saffu.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Serializable>{

}
