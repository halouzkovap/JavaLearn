package com.example.StudentDL.Repository;

import com.example.StudentDL.Entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustormerRepository extends CrudRepository<Customer,Long> {
}
