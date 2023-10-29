package cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Controller.articulo;

import cibertec.edu.pe.DAWI_CL2_PenaAlarconGibethAndrea.Service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/articulo/producto")
public class ProductoController {
    private ProductoService estadoProducto;

    @GetMapping("/frmproducto")
    public String index(Model model){
        model.addAttribute("listadoproducto", estadoProducto.listarProductos());
        return "articulo/producto";
    }
}
