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

import lk.arpico.proddb.dto.ProductDto;
import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.service.ProductService;

@RestController
@RequestMapping("Product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public void addProduct(@RequestBody  ProductDto productDto) {
		productService.addProduct(productDto);
	}
	
	@GetMapping("/all")
	public List<ProductDto> getAll(){
		return productService.getAllProducts(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProductDto productDto) {
		productService.updateProducts(productDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		productService.deleteProduct(id);
	}
	
	@GetMapping("/findcode/{id}")
    public ProductDto searchProduct(@PathVariable String id){

        return productService.searchProductByCode(id);

    }
	
	@GetMapping("/findname/{id}")
    public ProductDto searchProductname(@PathVariable String id){

        return productService.searchProductByName(id);

    }
	
	@GetMapping("/findsname/{id}")
    public ProductDto searchProductSname(@PathVariable String id){

        return productService.searchProductBysName(id);

    }
	
}
