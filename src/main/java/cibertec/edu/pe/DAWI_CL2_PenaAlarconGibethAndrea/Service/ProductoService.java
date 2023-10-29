package cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Service;

import cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Model.Producto;
import cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoService {

    private ProductoRepository productoRepository;
    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }
}
