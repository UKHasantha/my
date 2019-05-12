package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.entity.RiderEntity;



public interface RiderService {

	void addRider(RiderDto riderDto);

	List<RiderDto> getAllRiders();

	void updateRiders(RiderDto riderDto);

	void deleteRider(String id);

	RiderDto searchRiderByCode(String id);

	RiderDto searchRiderByName(String name);

	RiderDto searchRiderBysName(String id);

	

}
