package com.tnsif.customerservice1;

	import org.springframework.data.jpa.repository.JpaRepository;

	public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	}

