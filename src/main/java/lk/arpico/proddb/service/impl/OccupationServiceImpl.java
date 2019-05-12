package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.dto.OccupationDto;
import lk.arpico.proddb.entity.NumberParamsEntity;
import lk.arpico.proddb.entity.OccupationEntity;
import lk.arpico.proddb.repo.OccupationRepo;
import lk.arpico.proddb.service.OccupationService;

@Service
public class OccupationServiceImpl implements OccupationService{

	@Autowired
	private OccupationRepo occupationRepo;

	@Override
	public void add(OccupationDto occupation) {
		OccupationEntity paramsEntity=new OccupationEntity();
		Date date=new Date();
		paramsEntity.setOccupationId(occupation.getOccupationId());
		paramsEntity.setCode(occupation.getCode());
		paramsEntity.setCreateBy(occupation.getCreateBy());
		paramsEntity.setCreateDate(date);
		paramsEntity.setIsEnable(occupation.getIsEnable());
		paramsEntity.setModifyBy(occupation.getModifyBy());
		paramsEntity.setModifyDate(occupation.getModifyDate());
		paramsEntity.setName(occupation.getName());
		paramsEntity.setsName(occupation.getsName());
		
		occupationRepo.save(paramsEntity);
		System.out.println(occupation);
		
	}

	@Override
	public List<OccupationDto> getAll() {
		List<OccupationDto> list=new ArrayList<>();
        Iterable<OccupationEntity> allCus= occupationRepo.findAll();
        for (OccupationEntity c : allCus){
        	if(c.getIsEnable()==1) {
            list.add(new OccupationDto(c.getOccupationId(),c.getCode(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
            ));
        	}else {}
        }
        return list;
	}

	@Override
	public void update(OccupationDto occupation) {
		OccupationEntity paramsEntity=new OccupationEntity();
		Date date=new Date();
		System.out.println("ID Comes   " + occupation.getOccupationId());
		paramsEntity.setOccupationId(occupation.getOccupationId());
		paramsEntity.setCode(occupation.getCode());
		paramsEntity.setCreateBy(occupation.getCreateBy());
		paramsEntity.setCreateDate(date);
		System.out.println("date Comes   " +occupation.getCreateDate());
		paramsEntity.setIsEnable(occupation.getIsEnable());
		paramsEntity.setModifyBy(occupation.getModifyBy());
		paramsEntity.setModifyDate(occupation.getModifyDate());
		paramsEntity.setName(occupation.getName());
		paramsEntity.setsName(occupation.getsName());
		
		occupationRepo.save(paramsEntity);
	}

	@Override
	public void delete(String id) {
		OccupationEntity paramsEntity = null;
		Optional<OccupationEntity> cus = this.occupationRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			occupationRepo.save(paramsEntity);
		}else {}
	}

	@Override
	public OccupationDto searchById(String id) {
		OccupationEntity c;
		Optional<OccupationEntity> cus = this.occupationRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new OccupationDto(c.getOccupationId(),c.getCode(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
        		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
        );
	}

	@Override
	public List<OccupationEntity> searchOccupation(String value) throws Exception {
		System.out.println("impl_values :"+value);
		List<OccupationEntity> oc=this.occupationRepo.findByCodeContaining(value);
		System.out.println("ans :"+oc);
		return oc;
	}

	@Override
	public List<OccupationEntity> searchIdByName(String name) {
		System.out.println("nameoF :"+name);
		List<OccupationEntity> oc = null;
		try {
			oc = this.occupationRepo.findByNameContaining(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return oc;
	}

	@Override
	public List<OccupationEntity> searchIdBysName(String sName) {
		System.out.println("S Name :"+sName);
		List<OccupationEntity> oc = null;
		try {
			oc = this.occupationRepo.findBysNameContaining(sName);
		} catch (Exception e) {
			System.out.println("Catch Me.."+e);
		}
		return oc;
	}
	
//	@Override
//	public String searchOccupation(String value) {
//		
//		String idd=this.occupationRepo.findIdOf(value);
//		return idd;
//	}
//
//	@Override
//	public String searchIdByName(String name) {
//
//		String idd=this.occupationRepo.findIdOfName(name);
//		return idd;
//	}
//
//	@Override
//	public String searchIdBysName(String sName) {
//		
//		String idd=this.occupationRepo.findIdOfSName(sName);
//		return idd;
//	}
//
//	

	
}
