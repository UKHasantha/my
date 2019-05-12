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

import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.service.Number_ParamsService;

@RestController
@RequestMapping("numbers_params")
@CrossOrigin("*")
public class Numbers_ParamsController {

	@Autowired
	private Number_ParamsService number_paramsService;
	
	@PostMapping("/add")
	public void add(@RequestBody NumberParamDto number_paramdto) {
		number_paramsService.add(number_paramdto);
	}
	
	@GetMapping("/all")
	public List<NumberParamDto> getAll(){
		return number_paramsService.getAll(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody NumberParamDto number_paramdto) {
		number_paramsService.update(number_paramdto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		number_paramsService.delete(id);
	}
	
	@GetMapping("/findById/{id}")
    public NumberParamDto search(@PathVariable String id){

        return number_paramsService.searchById(id);

    }
}
