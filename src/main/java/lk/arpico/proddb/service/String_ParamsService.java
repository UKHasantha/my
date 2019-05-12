package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.StringParamsDto;
import lk.arpico.proddb.entity.StringParamsEntity;

public interface String_ParamsService {

	void add(StringParamsDto paramsDto);

	List<StringParamsDto> getAll();

	void update(StringParamsDto paramsDto);

	void delete(String id);

	StringParamsDto searchById(String id);

	

}
