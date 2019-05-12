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

import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.dto.RiderProductDetailDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.service.RiderProductDetailsService;

@RestController
@RequestMapping("RiderProductDetails")
@CrossOrigin("*")
public class RiderProductDetailsController {

	@Autowired
	private RiderProductDetailsService productDetailsService;
	

	@PostMapping("/add")
	public void add(@RequestBody RiderProductDetailDto riderProductDetailDto) {
		productDetailsService.add(riderProductDetailDto);
	}
	
	@GetMapping("/all")
	public List<RiderProductDetailDto> getAll(){
		return productDetailsService.getAll(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody RiderProductDetailDto riderProductDetailDto) {
		productDetailsService.update(riderProductDetailDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		productDetailsService.delete(id);
	}
	
	@GetMapping("/findById/{id}")
    public RiderProductDetailDto searchRider(@PathVariable String id){

        return productDetailsService.searchproductDetailsById(id);

    }
}
