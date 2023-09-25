package com.gene.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gene.demo.modelo.Empleado;
@Repository
public interface interfazEmpleado extends CrudRepository<Empleado, Integer>  {
	

}
