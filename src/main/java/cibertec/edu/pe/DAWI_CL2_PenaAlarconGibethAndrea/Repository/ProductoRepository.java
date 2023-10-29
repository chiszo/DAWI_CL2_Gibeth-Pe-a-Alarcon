package cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Repository;
import cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
