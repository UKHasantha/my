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
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.service.RiderService;

@RestController
@RequestMapping("Rider")
@CrossOrigin("*")
public class RiderController {

	@Autowired
	private RiderService riderService;
	
	@PostMapping("/add")
	public void addRider(@RequestBody lk.arpico.proddb.dto.RiderDto riderDto) {
		riderService.addRider(riderDto);
	}
	
	@GetMapping("/all")
	public List<RiderDto> getAll(){
		return riderService.getAllRiders(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody RiderDto riderDto) {
		riderService.updateRiders(riderDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		riderService.deleteRider(id);
	}
	
	@GetMapping("/findcode/{id}")
    public RiderDto searchRider(@PathVariable String id){

        return riderService.searchRiderByCode(id);

    }
	
	@GetMapping("/findname/{id}")
    public RiderDto searchRidername(@PathVariable String id){

        return riderService.searchRiderByName(id);

    }
	
	@GetMapping("/findsname/{id}")
    public RiderDto searchRiderSname(@PathVariable String id){

        return riderService.searchRiderBysName(id);

    }
}
