package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.ProdStringParamsDto;
import lk.arpico.proddb.entity.ProdStringParamsEntity;

public interface Prod_String_ParamsService {

	void add(ProdStringParamsDto params);

	List<ProdStringParamsDto> getAll();

	void update(ProdStringParamsDto params);

	void delete(String id);

	ProdStringParamsDto searchById(String id);

}
