package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.NumberParamDto;
import lk.arpico.proddb.dto.ProductNumParamsDto;
import lk.arpico.proddb.entity.ProductEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;
import lk.arpico.proddb.entity.ProductNumParamsEntity;
import lk.arpico.proddb.repo.Number_ParamsRepo;
import lk.arpico.proddb.repo.ProductRepo;
import lk.arpico.proddb.repo.Product_Num_ParamsRepo;
import lk.arpico.proddb.service.Product_Num_ParamsService;

@Service
public class Product_Num_ParamsServiceImpl implements Product_Num_ParamsService {

	@Autowired
	private Product_Num_ParamsRepo product_Num_ParamsRepo;

	@Autowired
	private Number_ParamsRepo numrepo;
	
	@Autowired
	private ProductRepo prorepo;
	
	@Override
	public void add(ProductNumParamsDto paramsdto) {
		NumberParamsEntity c = null;
		Optional<NumberParamsEntity> cus = this.numrepo.findById(paramsdto.getNumberParamId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(paramsdto.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
		ProductNumParamsEntity paramsEntity=new ProductNumParamsEntity();
		
		paramsEntity.setId(paramsdto.getProductNumParamId());
		paramsEntity.setCreateBy(paramsdto.getCreateBy());
		paramsEntity.setCreateDate(paramsdto.getCreateDate());
		paramsEntity.setIsEnable(paramsdto.getIsEnable());
		paramsEntity.setModifyBy(paramsdto.getModifyBy());
		paramsEntity.setModifyDate(paramsdto.getModifyDate());
		paramsEntity.setNumParamsEntities(c);
		paramsEntity.setProductEntity(r);
		
		product_Num_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public List<ProductNumParamsDto> getAll() {
		List<ProductNumParamsDto> list=new ArrayList<>();
        Iterable<ProductNumParamsEntity> allCus= product_Num_ParamsRepo.findAll();
        for (ProductNumParamsEntity c : allCus){
            list.add(new ProductNumParamsDto(c.getId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getModifyBy(),c.getModifyDate(),c.getNumParamsEntities().getId(),c.getProductEntity().getProductId()
            ));

        }
        return list;
	}

	@Override
	public void update(ProductNumParamsDto paramsdto) {
		NumberParamsEntity c = null;
		Optional<NumberParamsEntity> cus = this.numrepo.findById(paramsdto.getNumberParamId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(paramsdto.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
		ProductNumParamsEntity paramsEntity=new ProductNumParamsEntity();
		
		paramsEntity.setId(paramsdto.getProductNumParamId());
		paramsEntity.setCreateBy(paramsdto.getCreateBy());
		paramsEntity.setCreateDate(paramsdto.getCreateDate());
		paramsEntity.setIsEnable(paramsdto.getIsEnable());
		paramsEntity.setModifyBy(paramsdto.getModifyBy());
		paramsEntity.setModifyDate(paramsdto.getModifyDate());
		paramsEntity.setNumParamsEntities(c);
		paramsEntity.setProductEntity(r);
		
		product_Num_ParamsRepo.save(paramsEntity);
		
	}

	@Override
	public void delete(String id) {
		ProductNumParamsEntity paramsEntity = null;
		Optional<ProductNumParamsEntity> cus = this.product_Num_ParamsRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			product_Num_ParamsRepo.save(paramsEntity);
		}else {}
	}

	@Override
	public ProductNumParamsDto searchById(String id) {
		ProductNumParamsEntity c;
		Optional<ProductNumParamsEntity> cus = this.product_Num_ParamsRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new ProductNumParamsDto(c.getId(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
        		c.getModifyBy(),c.getModifyDate(),c.getNumParamsEntities().getId(),c.getProductEntity().getProductId()
        );
	}

	
}
