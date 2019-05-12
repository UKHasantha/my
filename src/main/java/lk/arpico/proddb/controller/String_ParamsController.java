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
import lk.arpico.proddb.dto.StringParamsDto;
import lk.arpico.proddb.entity.OccupationEntity;
import lk.arpico.proddb.entity.StringParamsEntity;
import lk.arpico.proddb.service.String_ParamsService;

@RestController
@RequestMapping("string_params")
@CrossOrigin("*")
public class String_ParamsController {

	@Autowired
	private String_ParamsService string_ParamsService;
	
	@PostMapping("/add")
	public void add(@RequestBody StringParamsDto params) {
		string_ParamsService.add(params);
	}
	
	@GetMapping("/all")
	public List<StringParamsDto> getAll(){
		return string_ParamsService.getAll(); 
	}
	
	@PutMapping("/update")
	public void update(@RequestBody StringParamsDto paramsDto) {
		string_ParamsService.update(paramsDto);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		string_ParamsService.delete(id);
	}
	
	@GetMapping("/findById/{id}")
    public StringParamsDto search(@PathVariable String id){

        return string_ParamsService.searchById(id);

    }
}
