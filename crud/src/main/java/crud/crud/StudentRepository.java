 package crud.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;




//@Transactional

public interface StudentRepository extends CrudRepository<Student,Long>{

	
}

