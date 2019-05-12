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

import lk.arpico.proddb.dto.OccupationDto;
import lk.arpico.proddb.entity.OccupationEntity;
import lk.arpico.proddb.service.OccupationService;

@RestController
@RequestMapping("occupation")
@CrossOrigin("*")
public class OccupationController {

	@Autowired
	private OccupationService occupationService;

	@PostMapping("/add")
	public void add(@RequestBody OccupationDto occupation) {
		occupationService.add(occupation);
	}

	@GetMapping("/all")
	public List<OccupationDto> getAll() {
		return occupationService.getAll();
	}

	@PutMapping("/update")
	public void update(@RequestBody OccupationDto occupation) {
		occupationService.update(occupation);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		occupationService.delete(id);
	}

	@GetMapping("/findById/{id}")
	public OccupationDto search(@PathVariable String id) throws Exception {
		return occupationService.searchById(id);

	}

	@GetMapping("/searchIdByCode/{value}")
	public List<OccupationEntity> searchByCode(@PathVariable String value) throws Exception {
		System.out.println("controller_Value :"+value);
		return occupationService.searchOccupation(value);
	}

	@GetMapping("/searchIdByName/{name}")
	public List<OccupationEntity> searchByName(@PathVariable String name) throws Exception {
		return occupationService.searchIdByName(name);

	}

	@GetMapping("/searchIdBySName/{sName}")
	public List<OccupationEntity> searchBySName(@PathVariable String sName) throws Exception {
		System.out.println("controller_Value :"+sName);
		return occupationService.searchIdBysName(sName);
	}

}
