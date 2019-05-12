package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;

public interface Number_ParamsService {

	NumberParamDto searchById(String id);

	void delete(String id);

	void update(NumberParamDto number_paramdto);

	List<NumberParamDto> getAll();

	void add(NumberParamDto number_paramdto);

}
