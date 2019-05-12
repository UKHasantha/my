package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.StringParamsDto;
import lk.arpico.proddb.entity.StringParamsEntity;
import lk.arpico.proddb.repo.String_ParamsRepo;
import lk.arpico.proddb.service.String_ParamsService;

@Service
public class String_ParamsSerivceImpl implements String_ParamsService{

	@Autowired
	private String_ParamsRepo string_ParamsRepo;

	@Override
	public void add(StringParamsDto paramsDto) {
		StringParamsEntity  paramsEntity=new StringParamsEntity();
		
		paramsEntity.setStringParamsId(paramsDto.getStringParamsId());
		paramsEntity.setCreateBy(paramsDto.getCreateBy());
		paramsEntity.setCreateDate(paramsDto.getCreateDate());
		paramsEntity.setIsEnable(paramsDto.getIsEnable());
		paramsEntity.setModifyBy(paramsDto.getModifyBy());
		paramsEntity.setModifyDate(paramsDto.getModifyDate());
		paramsEntity.setName(paramsDto.getName());
		paramsEntity.setsName(paramsDto.getsName());
		
		string_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public List<StringParamsDto> getAll() {
		List<StringParamsDto> list=new ArrayList<>();
        Iterable<StringParamsEntity> allCus= string_ParamsRepo.findAll();
        for (StringParamsEntity c : allCus){
            list.add(new StringParamsDto(c.getStringParamsId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
            ));

        }
        return list;
	}

	@Override
	public void update(StringParamsDto paramsDto) {
		StringParamsEntity  paramsEntity=new StringParamsEntity();
		
		paramsEntity.setStringParamsId(paramsDto.getStringParamsId());
		paramsEntity.setCreateBy(paramsDto.getCreateBy());
		paramsEntity.setCreateDate(paramsDto.getCreateDate());
		paramsEntity.setIsEnable(paramsDto.getIsEnable());
		paramsEntity.setModifyBy(paramsDto.getModifyBy());
		paramsEntity.setModifyDate(paramsDto.getModifyDate());
		paramsEntity.setName(paramsDto.getName());
		paramsEntity.setsName(paramsDto.getsName());
		
		string_ParamsRepo.save(paramsEntity);
	}

	@Override
	public void delete(String id) {
		StringParamsEntity paramsEntity = null;
		Optional<StringParamsEntity> cus = this.string_ParamsRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			string_ParamsRepo.save(paramsEntity);
		}else {}
	}

	@Override
	public StringParamsDto searchById(String id) {
		StringParamsEntity c;
		Optional<StringParamsEntity> cus = this.string_ParamsRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new StringParamsDto(c.getStringParamsId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
        		c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName()
        );
	}

	
}
