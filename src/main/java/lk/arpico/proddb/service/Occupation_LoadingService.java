package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.OccupationLoadingDto;
import lk.arpico.proddb.entity.RiderEntity;

public interface Occupation_LoadingService {

	void add(List<OccupationLoadingDto> loadingDto);

	List<OccupationLoadingDto> getAll();

//	void update(OccupationLoadingDto loadingDto);

	void delete(String id);

	OccupationLoadingDto searchById(String occupationLoadingId);
	
	OccupationLoadingDto searchOccupationAll(String value);

	List<OccupationLoadingDto> getSearchOccu(String id) throws Exception;

	void update(List<OccupationLoadingDto> loadingDto);

	

}
