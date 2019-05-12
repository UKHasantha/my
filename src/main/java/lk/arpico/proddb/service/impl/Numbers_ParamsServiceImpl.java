package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;
import lk.arpico.proddb.repo.Number_ParamsRepo;
import lk.arpico.proddb.service.Number_ParamsService;
import lk.arpico.proddb.service.RiderProductDetailsService;

@Service
public class Numbers_ParamsServiceImpl implements Number_ParamsService {

	@Autowired
	private Number_ParamsRepo number_ParamsRepo;

	@Override
	public NumberParamDto searchById(String id) {
		NumberParamsEntity c;
		Optional<NumberParamsEntity> cus = this.number_ParamsRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new NumberParamDto(c.getId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
        		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
        );
	}

	@Override
	public void delete(String id) {
		NumberParamsEntity paramsEntity = null;
		Optional<NumberParamsEntity> cus = this.number_ParamsRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			number_ParamsRepo.save(paramsEntity);
		}else {}
		
	}

	@Override
	public void update(NumberParamDto number_paramdto) {
		NumberParamsEntity paramsEntity=new NumberParamsEntity();
		
		paramsEntity.setId(number_paramdto.getNumberParamId());
		paramsEntity.setCreateBy(number_paramdto.getCreateBy());
		paramsEntity.setCreateDate(number_paramdto.getCreateDate());
		paramsEntity.setIsEnable(number_paramdto.getIsEnable());
		paramsEntity.setModifyBy(number_paramdto.getModifyBy());
		paramsEntity.setModifyDate(number_paramdto.getModifyDate());
		paramsEntity.setName(number_paramdto.getName());
		paramsEntity.setsName(number_paramdto.getsName());
		
		number_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public List<NumberParamDto> getAll() {
		List<NumberParamDto> list=new ArrayList<>();
        Iterable<NumberParamsEntity> allCus= number_ParamsRepo.findAll();
        for (NumberParamsEntity c : allCus){
            list.add(new NumberParamDto(c.getId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
            ));

        }
        return list;
	}

	@Override
	public void add(NumberParamDto number_paramdto) {
		NumberParamsEntity paramsEntity=new NumberParamsEntity();
		
		paramsEntity.setId(number_paramdto.getNumberParamId());
		paramsEntity.setCreateBy(number_paramdto.getCreateBy());
		paramsEntity.setCreateDate(number_paramdto.getCreateDate());
		paramsEntity.setIsEnable(number_paramdto.getIsEnable());
		paramsEntity.setModifyBy(number_paramdto.getModifyBy());
		paramsEntity.setModifyDate(number_paramdto.getModifyDate());
		paramsEntity.setName(number_paramdto.getName());
		paramsEntity.setsName(number_paramdto.getsName());
		
		number_ParamsRepo.save(paramsEntity);
		
	}

	
}
