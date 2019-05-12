package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.ProdStringParamsDto;
import lk.arpico.proddb.dto.ProductNumParamsDto;
import lk.arpico.proddb.entity.ProductEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;
import lk.arpico.proddb.entity.ProdStringParamsEntity;
import lk.arpico.proddb.entity.ProductNumParamsEntity;
import lk.arpico.proddb.entity.StringParamsEntity;
import lk.arpico.proddb.repo.Number_ParamsRepo;
import lk.arpico.proddb.repo.Prod_String_ParamsRepo;
import lk.arpico.proddb.repo.ProductRepo;
import lk.arpico.proddb.repo.String_ParamsRepo;
import lk.arpico.proddb.service.Prod_String_ParamsService;

@Service
public class Prod_String_ParamsServiceImpl implements Prod_String_ParamsService{

	@Autowired
	private Prod_String_ParamsRepo prod_String_ParamsRepo;
	
	@Autowired
	private String_ParamsRepo numrepo;
	
	@Autowired
	private ProductRepo prorepo;

	@Override
	public void add(ProdStringParamsDto params) {
		StringParamsEntity c = null;
		Optional<StringParamsEntity> cus = this.numrepo.findById(params.getStringParamsId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(params.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
        ProdStringParamsEntity paramsEntity=new ProdStringParamsEntity();
		
		paramsEntity.setProductStringParamId(params.getProductStringParamId());
		paramsEntity.setCreateBy(params.getCreateBy());
		paramsEntity.setCreateDate(params.getCreateDate());
		paramsEntity.setIsEnable(params.getIsEnable());
		paramsEntity.setModifyBy(params.getModifyBy());
		paramsEntity.setModifyDate(params.getModifyDate());
		paramsEntity.setStringParamsEntity(c);;
		paramsEntity.setProductEntity(r);
		
		prod_String_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public List<ProdStringParamsDto> getAll() {
		List<ProdStringParamsDto> list=new ArrayList<>();
        Iterable<ProdStringParamsEntity> allCus= prod_String_ParamsRepo.findAll();
        for (ProdStringParamsEntity c : allCus){
            list.add(new ProdStringParamsDto(c.getProductStringParamId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getModifyBy(),c.getModifyDate(),c.getStringParamsEntity().getStringParamsId(),c.getProductEntity().getProductId()
            ));

        }
        return list;
	}

	@Override
	public void update(ProdStringParamsDto params) {
		StringParamsEntity c = null;
		Optional<StringParamsEntity> cus = this.numrepo.findById(params.getStringParamsId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(params.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
        ProdStringParamsEntity paramsEntity=new ProdStringParamsEntity();
		
		paramsEntity.setProductStringParamId(params.getProductStringParamId());
		paramsEntity.setCreateBy(params.getCreateBy());
		paramsEntity.setCreateDate(params.getCreateDate());
		paramsEntity.setIsEnable(params.getIsEnable());
		paramsEntity.setModifyBy(params.getModifyBy());
		paramsEntity.setModifyDate(params.getModifyDate());
		paramsEntity.setStringParamsEntity(c);
		paramsEntity.setProductEntity(r);
		
		prod_String_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public void delete(String id) {
		ProdStringParamsEntity paramsEntity = null;
		Optional<ProdStringParamsEntity> cus = this.prod_String_ParamsRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			prod_String_ParamsRepo.save(paramsEntity);
		}else {}
	}

	@Override
	public ProdStringParamsDto searchById(String id) {
		ProdStringParamsEntity c;
		Optional<ProdStringParamsEntity> cus = this.prod_String_ParamsRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new ProdStringParamsDto(c.getProductStringParamId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
        		c.getModifyBy(),c.getModifyDate(),c.getStringParamsEntity().getStringParamsId(),c.getProductEntity().getProductId()
        );
	}

	
}
