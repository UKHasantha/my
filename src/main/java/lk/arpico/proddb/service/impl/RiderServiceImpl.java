package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.repo.RiderServiceRepo;
import lk.arpico.proddb.service.RiderService;



@Service
public class RiderServiceImpl implements RiderService {
	
	@Autowired
	private RiderServiceRepo riderServiceRepo; 

	@Override
	public void addRider(RiderDto riderDto) {
		RiderEntity rider=new RiderEntity();
		rider.setId(riderDto.getId());
		rider.setCode(riderDto.getCode());
		rider.setCombination(riderDto.getCombination());
		rider.setCreateBy(riderDto.getCreateBy());
		rider.setCreateDate(riderDto.getCreateDate());
		rider.setIsEnable(riderDto.getIsEnable());
		rider.setModifyBy(riderDto.getModifyBy());
		rider.setModifyDate(riderDto.getModifyDate());
		rider.setName(riderDto.getsName());
		rider.setsName(riderDto.getsName());
		rider.setType(riderDto.getType());
		
		riderServiceRepo.save(rider);
		
	}

	@Override
	public List<RiderDto> getAllRiders() {
		
		List<RiderDto> list=new ArrayList<>();
        Iterable<RiderEntity> allCus= riderServiceRepo.findAll();
        for (RiderEntity c : allCus){
            list.add(new RiderDto(c.getId(),c.getCode(),c.getCombination(),c.getCreateBy(),c.getCreateDate(),
            		c.getIsEnable(),c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName(),c.getType()
            ));

        }
        return list;
	}

	@Override
	public void updateRiders(RiderDto riderDto) {
		RiderEntity rider=new RiderEntity();
		rider.setId(riderDto.getId());
		rider.setCode(riderDto.getCode());
		rider.setCombination(riderDto.getCombination());
		rider.setCreateBy(riderDto.getCreateBy());
		rider.setCreateDate(riderDto.getCreateDate());
		rider.setIsEnable(riderDto.getIsEnable());
		rider.setModifyBy(riderDto.getModifyBy());
		rider.setModifyDate(riderDto.getModifyDate());
		rider.setName(riderDto.getsName());
		rider.setsName(riderDto.getsName());
		rider.setType(riderDto.getType());
		
		riderServiceRepo.save(rider);
//		 if(rider.getId()!= null){
//			 riderServiceRepo.save(rider);
//
//	        }
		
	}

	@Override
	public void deleteRider(String id) {
		RiderEntity ryderEntity = null;
		Optional<RiderEntity> cus = this.riderServiceRepo.findById(id);
        if (cus.isPresent()) {
             ryderEntity=cus.get();
        } else {
             
        }
        
		if(ryderEntity!=null) {
			ryderEntity.setIsEnable(0);
			riderServiceRepo.save(ryderEntity);
		}else {}
	}

	@Override
	public RiderDto searchRiderByCode(String id) {
		RiderEntity r;
		Optional<RiderEntity> cus = this.riderServiceRepo.findByCode(id);
        if (cus.isPresent()) {
            r= cus.get();
        } else {
            return null;
        }
        return new RiderDto(r.getId(),r.getCode(),r.getCombination(),r.getCreateBy(),r.getCreateDate(),
        		r.getIsEnable(),r.getModifyBy(),r.getModifyDate(),r.getName(),r.getsName(),r.getType());
	}

	@Override
	public RiderDto searchRiderByName(String name) {
		RiderEntity r;
		Optional<RiderEntity> cus = this.riderServiceRepo.findByName(name);
        if (cus.isPresent()) {
            r=cus.get();
        } else {
            return null;
        }
        return new RiderDto(r.getId(),r.getCode(),r.getCombination(),r.getCreateBy(),r.getCreateDate(),
        		r.getIsEnable(),r.getModifyBy(),r.getModifyDate(),r.getName(),r.getsName(),r.getType());
	}

	@Override
	public RiderDto searchRiderBysName(String id) {
		RiderEntity r;
		Optional<RiderEntity> cus = this.riderServiceRepo.findBysName(id);
        if (cus.isPresent()) {
            r= cus.get();
        } else {
            return null;
        }
        return new RiderDto(r.getId(),r.getCode(),r.getCombination(),r.getCreateBy(),r.getCreateDate(),
        		r.getIsEnable(),r.getModifyBy(),r.getModifyDate(),r.getName(),r.getsName(),r.getType());
	}

	

}
