package com.gene.demo.interfaceService;
import java.util.List;
import java.util.Optional;
import com.gene.demo.modelo.Empleado;

public interface IEmpleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int id);
	public int save(Empleado e);
    public void delete(int id);
}
