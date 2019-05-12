package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.dto.OccupationLoadingDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;
import lk.arpico.proddb.entity.OccupationEntity;
import lk.arpico.proddb.entity.OccupationLoadingEntity;
import lk.arpico.proddb.repo.OccupationRepo;
import lk.arpico.proddb.repo.Occupation_LoadingRepo;
import lk.arpico.proddb.repo.RiderServiceRepo;
import lk.arpico.proddb.service.Occupation_LoadingService;

@Service
public class Occupation_LoadingServiceImpl implements Occupation_LoadingService{

	@Autowired
	private Occupation_LoadingRepo occupationloadingRepo;
	
	@Autowired
	private OccupationRepo occupationRepo;
	
	@Autowired
	private RiderServiceRepo riderServiceRepo;

	@Override
	public void add(List<OccupationLoadingDto> loadingDto) {
		System.out.println(loadingDto);
		
		for (OccupationLoadingDto occupationLoadingDto : loadingDto) {
			System.out.println(occupationLoadingDto);
			OccupationEntity c = new OccupationEntity();
			Optional<OccupationEntity> cus = this.occupationRepo.findById(occupationLoadingDto.getOccupationId());
	        if (cus.isPresent()) {
	            c= cus.get();
	        } else {
	            
	        }
	        
	        RiderEntity r = new RiderEntity();
	        System.out.println(occupationLoadingDto.getRyderId());
			Optional<RiderEntity> cus1 = this.riderServiceRepo.findById("r001");
	        if (cus1.isPresent()) {
	            r= cus1.get();
	            System.out.println(r);
	        } else {
	            
	        }
	        
		OccupationLoadingEntity loadingEntity= new OccupationLoadingEntity();
		System.out.println(occupationLoadingDto.getOccupationLoadingId());
		loadingEntity.setOccupationLoadingId(occupationLoadingDto.getOccupationLoadingId());
		loadingEntity.setCreateBy(occupationLoadingDto.getCreateBy());
		loadingEntity.setCreateDate(occupationLoadingDto.getCreateDate());
		loadingEntity.setEmRate(occupationLoadingDto.getEmRate());
		loadingEntity.setIsEnable(occupationLoadingDto.getIsEnable());
		loadingEntity.setModifyBy(occupationLoadingDto.getModifyBy());
		loadingEntity.setModifyDate(occupationLoadingDto.getModifyDate());
		loadingEntity.setRateMil(occupationLoadingDto.getRateMil());
		loadingEntity.setSubRate(occupationLoadingDto.getSubRate());
		loadingEntity.setValue(occupationLoadingDto.getValue());
		loadingEntity.setOccupationEntity(c);
		loadingEntity.setRiderEntity(r);
		occupationloadingRepo.save(loadingEntity);
		}
		
	}

	@Override
	public List<OccupationLoadingDto> getAll() {
		List<OccupationLoadingDto> list=new ArrayList<>();
        Iterable<OccupationLoadingEntity> allCus= occupationloadingRepo.findAll();
        for (OccupationLoadingEntity c : allCus){
            list.add(new OccupationLoadingDto(c.getOccupationLoadingId(),c.getCreateBy(),c.getCreateDate(),c.getEmRate(),
            		c.getIsEnable(),c.getModifyBy(),c.getModifyDate(),c.getRateMil(),c.getSubRate(),
            		c.getValue(),c.getRiderEntity().getId(),c.getOccupationEntity().getOccupationId()
            ));

        }
        return list;
	}

	@Override
	public void update(List<OccupationLoadingDto> loadingDto) {

		for (OccupationLoadingDto occupationLoadingDto : loadingDto) {
			System.out.println(occupationLoadingDto);
			OccupationEntity c = new OccupationEntity();
			Optional<OccupationEntity> cus = this.occupationRepo.findById(occupationLoadingDto.getOccupationId());
	        if (cus.isPresent()) {
	            c= cus.get();
	        } else {
	            
	        }
	        
	        RiderEntity r = new RiderEntity();
	        System.out.println(occupationLoadingDto.getRyderId());
			Optional<RiderEntity> cus1 = this.riderServiceRepo.findById(occupationLoadingDto.getRyderId());
	        if (cus1.isPresent()) {
	            r= cus1.get();
	            System.out.println(r);
	        } else {
	            
	        }
	        
		OccupationLoadingEntity loadingEntity= new OccupationLoadingEntity();
		System.out.println(occupationLoadingDto.getOccupationLoadingId());
		loadingEntity.setOccupationLoadingId(occupationLoadingDto.getOccupationLoadingId());
		loadingEntity.setCreateBy(occupationLoadingDto.getCreateBy());
		loadingEntity.setCreateDate(occupationLoadingDto.getCreateDate());
		loadingEntity.setEmRate(occupationLoadingDto.getEmRate());
		loadingEntity.setIsEnable(occupationLoadingDto.getIsEnable());
		loadingEntity.setModifyBy(occupationLoadingDto.getModifyBy());
		loadingEntity.setModifyDate(occupationLoadingDto.getModifyDate());
		loadingEntity.setRateMil(occupationLoadingDto.getRateMil());
		loadingEntity.setSubRate(occupationLoadingDto.getSubRate());
		loadingEntity.setValue(occupationLoadingDto.getValue());
		loadingEntity.setOccupationEntity(c);
		loadingEntity.setRiderEntity(r);
		occupationloadingRepo.save(loadingEntity);
		}
	}

	@Override
	public void delete(String id) {
		OccupationLoadingEntity loadingEntity = null;
		Optional<OccupationLoadingEntity> cus = this.occupationloadingRepo.findById(id);
        if (cus.isPresent()) {
             loadingEntity=cus.get();
        } else {
             
        }
        
		if(loadingEntity!=null) {
			loadingEntity.setIsEnable(0);
			occupationloadingRepo.save(loadingEntity);
		}else {}
	}

	@Override
	public OccupationLoadingDto searchById(String id) {
		OccupationLoadingEntity c;
		Optional<OccupationLoadingEntity> cus = this.occupationloadingRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new OccupationLoadingDto(c.getOccupationLoadingId(),c.getCreateBy(),c.getCreateDate(),c.getEmRate(),
       		c.getIsEnable(),c.getModifyBy(),c.getModifyDate(),c.getRateMil(),c.getSubRate(),
       		c.getValue(),c.getRiderEntity().getId(),c.getOccupationEntity().getOccupationId()
       );
	}
	@Override
	public OccupationLoadingDto searchOccupationAll(String value) {
		
		OccupationLoadingEntity c;
		Optional<OccupationLoadingEntity> cus = this.occupationloadingRepo.findById(value);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new OccupationLoadingDto(c.getOccupationLoadingId(),c.getCreateBy(),c.getCreateDate(),c.getEmRate(),
       		c.getIsEnable(),c.getModifyBy(),c.getModifyDate(),c.getRateMil(),c.getSubRate(),
       		c.getValue(),c.getRiderEntity().getId(),c.getOccupationEntity().getOccupationId()
       );
	}

	@Override
	public List<OccupationLoadingDto> getSearchOccu(String occupationLoadingId) throws Exception {
		List<OccupationLoadingDto> list=new ArrayList<>();
		List<OccupationLoadingEntity> allCus = occupationloadingRepo.findByOccupationLoadingId(occupationLoadingId);
		for(OccupationLoadingEntity c : allCus) {
			list.add(new OccupationLoadingDto(c.getOccupationLoadingId(),c.getCreateBy(),c.getCreateDate(),c.getEmRate(),
	        		c.getIsEnable(),c.getModifyBy(),c.getModifyDate(),c.getRateMil(),c.getSubRate(),
	        		c.getValue(),c.getRiderEntity().getId(),c.getOccupationEntity().getOccupationId()
	        ));
		}
       
		return list;
	}
	

	
}
