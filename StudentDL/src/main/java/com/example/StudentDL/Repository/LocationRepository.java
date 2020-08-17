package com.example.StudentDL.Repository;

import com.example.StudentDL.Entities.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,Long> {
}
