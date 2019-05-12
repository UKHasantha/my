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

import lk.arpico.proddb.dto.RiderProductDetailDto;
import lk.arpico.proddb.dto.OccupationLoadingDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.service.Occupation_LoadingService;
import lk.arpico.proddb.service.RiderProductDetailsService;

@RestController
@RequestMapping("occupation_loading")
@CrossOrigin("*")
public class Occupation_LoadingController {

	@Autowired
	private Occupation_LoadingService loadingService;
	
	@PostMapping("/add")
	public void add(@RequestBody List<OccupationLoadingDto> loadingDto) {
		loadingService.add(loadingDto);
	}
	
	@GetMapping("/all")
	public List<OccupationLoadingDto> getAll(){
		return loadingService.getAll(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody List<OccupationLoadingDto> loadingDto) {
		loadingService.update(loadingDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		loadingService.delete(id);
	}
	
	@GetMapping("/findById/{id}")
    public OccupationLoadingDto search(@PathVariable String id){

        return loadingService.searchById(id);

    }
	@GetMapping("/getSearchedOccupation/{id}")
	public List<OccupationLoadingDto> getSearchedOccupation(@PathVariable String id) throws Exception{
		return loadingService.getSearchOccu(id);
	}
	
	
}
