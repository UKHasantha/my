package lk.arpico.proddb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.arpico.proddb.dto.ProdStringParamsDto;
import lk.arpico.proddb.dto.ProductNumParamsDto;
import lk.arpico.proddb.entity.ProdStringParamsEntity;
import lk.arpico.proddb.entity.ProductNumParamsEntity;
import lk.arpico.proddb.service.Product_Num_ParamsService;

@RestController
@RequestMapping("product_num_params")
@CrossOrigin("*")
public class Product_Num_ParamsController {

	@Autowired
	private Product_Num_ParamsService product_Num_ParamsService;
	
	@PostMapping("/add")
	public void add(@RequestBody ProductNumParamsDto paramsdto) {
		product_Num_ParamsService.add(paramsdto);
	}
	
	@GetMapping("/all")
	public List<ProductNumParamsDto> getAll(){
		return product_Num_ParamsService.getAll(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProductNumParamsDto paramsdto) {
		product_Num_ParamsService.update(paramsdto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		product_Num_ParamsService.delete(id);
	}
	
	@GetMapping("/findById/{id}")
    public ProductNumParamsDto search(@PathVariable String id){

        return product_Num_ParamsService.searchById(id);

    }
}
