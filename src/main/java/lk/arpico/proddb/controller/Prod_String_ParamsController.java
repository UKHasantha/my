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
import lk.arpico.proddb.dto.ProdStringParamsDto;
import lk.arpico.proddb.entity.OccupationEntity;
import lk.arpico.proddb.entity.ProdStringParamsEntity;
import lk.arpico.proddb.service.Prod_String_ParamsService;

@RestController
@RequestMapping("prod_string_params")
@CrossOrigin("*")
public class Prod_String_ParamsController {

	@Autowired
	private Prod_String_ParamsService prod_String_ParamsService;

	@PostMapping("/add")
	public void add(@RequestBody ProdStringParamsDto params) {
		prod_String_ParamsService.add(params);
	}

	@GetMapping("/all")
	public List<ProdStringParamsDto> getAll() {
		return prod_String_ParamsService.getAll();
	}

	@PutMapping("/update")
	public void update(@RequestBody ProdStringParamsDto params) {
		prod_String_ParamsService.update(params);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		prod_String_ParamsService.delete(id);
	}

	@GetMapping("/findById/{id}")
	public ProdStringParamsDto search(@PathVariable String id) {

		return prod_String_ParamsService.searchById(id);

	}
}
