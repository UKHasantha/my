package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.OccupationDto;
import lk.arpico.proddb.entity.OccupationEntity;

public interface OccupationService {

	void add(OccupationDto occupation);

	List<OccupationDto> getAll();

	void update(OccupationDto occupation);

	void delete(String id);

	OccupationDto searchById(String id) throws Exception ;

	List<OccupationEntity> searchOccupation(String value) throws Exception ;

	List<OccupationEntity> searchIdByName(String name) throws Exception ;

	List<OccupationEntity> searchIdBysName(String sName) throws Exception ;

	
}
