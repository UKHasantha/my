package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.RiderProductDetailDto;
import lk.arpico.proddb.entity.RiderEntity;

public interface RiderProductDetailsService {

	void add(RiderProductDetailDto riderProductDetailDto);

	List<RiderProductDetailDto> getAll();

	void delete(String id);

	RiderProductDetailDto searchproductDetailsById(String id);

	void update(RiderProductDetailDto riderProductDetailDto);

	

}
