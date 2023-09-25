package com.gene.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gene.demo.interfaceService.IEmpleadoService;
import com.gene.demo.modelo.Empleado;
import com.gene.interfaces.interfazEmpleado;
@Service

public class empleadoSerive implements IEmpleadoService{

	@Autowired
	private interfazEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		
		return (List<Empleado>) data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Empleado e) {
		int resp=0;
		Empleado empleado=data.save(e);
		if(!empleado.equals(null)) {
			resp=1;
		}
		return resp;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
