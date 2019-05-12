package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.RiderProductDetailDto;
import lk.arpico.proddb.dto.ProdStringParamsDto;
import lk.arpico.proddb.entity.ProductEntity;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.entity.RiderProductDetailEntity;
import lk.arpico.proddb.entity.ProdStringParamsEntity;
import lk.arpico.proddb.entity.StringParamsEntity;
import lk.arpico.proddb.repo.ProductRepo;
import lk.arpico.proddb.repo.RiderProductDetailsRepo;
import lk.arpico.proddb.repo.RiderServiceRepo;
import lk.arpico.proddb.repo.String_ParamsRepo;
import lk.arpico.proddb.service.RiderProductDetailsService;

@Service
public class RiderProductDetailsServiceImpl implements RiderProductDetailsService {

	@Autowired
	private RiderProductDetailsRepo riderProductDetailsRepo;
	
	@Autowired
	private RiderServiceRepo numrepo;
	
	@Autowired
	private ProductRepo prorepo;


	@Override
	public void add(RiderProductDetailDto riderProductDetailDto) {
		RiderEntity c = null;
		Optional<RiderEntity> cus = this.numrepo.findById(riderProductDetailDto.getRyderId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(riderProductDetailDto.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
        RiderProductDetailEntity paramsEntity=new RiderProductDetailEntity();
		
		paramsEntity.setRpId(riderProductDetailDto.getRpId());
		paramsEntity.setCalculation(riderProductDetailDto.getCalculation());
		paramsEntity.setCreateBy(riderProductDetailDto.getCreateBy());
		paramsEntity.setCreateDate(riderProductDetailDto.getCreateDate());
		paramsEntity.setIsEnable(riderProductDetailDto.getIsEnable());
		paramsEntity.setGridOrder(riderProductDetailDto.getGridOrder());
		paramsEntity.setMaxAge(riderProductDetailDto.getMaxAge());
		paramsEntity.setMinAge(riderProductDetailDto.getMinAge());
		paramsEntity.setModifyBy(riderProductDetailDto.getModifyBy());
		paramsEntity.setModifyDate(riderProductDetailDto.getModifyDate());
		paramsEntity.setPrintOrder(riderProductDetailDto.getPrintOrder());
		paramsEntity.setValidation(riderProductDetailDto.getValidation());
		paramsEntity.setRiderEntity(c);;
		paramsEntity.setProductEntity(r);
		
		riderProductDetailsRepo.save(paramsEntity);
	}

	@Override
	public void delete(String id) {
		RiderProductDetailEntity paramsEntity = null;
		Optional<RiderProductDetailEntity> cus = this.riderProductDetailsRepo.findById(id);
        if (cus.isPresent()) {
             paramsEntity=cus.get();
        } else {
             
        }
        
		if(paramsEntity!=null) {
			paramsEntity.setIsEnable(0);
			riderProductDetailsRepo.save(paramsEntity);
		}else {}
	}

	@Override
	public RiderProductDetailDto searchproductDetailsById(String id) {
		RiderProductDetailEntity c;
		Optional<RiderProductDetailEntity> cus = this.riderProductDetailsRepo.findById(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
       return new RiderProductDetailDto(c.getRpId(),c.getCalculation(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
       		c.getGridOrder(),c.getMaxAge(),c.getMinAge(),
       		c.getModifyBy(),c.getModifyDate(),c.getPrintOrder(),c.getValidation(),c.getRiderEntity().getId()
       		,c.getProductEntity().getProductId()
       );
	}

	@Override
	public void update(RiderProductDetailDto riderProductDetailDto) {
		RiderEntity c = null;
		Optional<RiderEntity> cus = this.numrepo.findById(riderProductDetailDto.getRyderId());
        if (cus.isPresent()) {
            c= cus.get();
        } else {
           
        }
        ProductEntity r = null;
		Optional<ProductEntity> cus1 = this.prorepo.findById(riderProductDetailDto.getProductId());
        if (cus.isPresent()) {
            r= cus1.get();
        } else {
           
        }
        RiderProductDetailEntity paramsEntity=new RiderProductDetailEntity();
		
        paramsEntity.setRpId(riderProductDetailDto.getRpId());
		paramsEntity.setCalculation(riderProductDetailDto.getCalculation());
		paramsEntity.setCreateBy(riderProductDetailDto.getCreateBy());
		paramsEntity.setCreateDate(riderProductDetailDto.getCreateDate());
		paramsEntity.setIsEnable(riderProductDetailDto.getIsEnable());
		paramsEntity.setGridOrder(riderProductDetailDto.getGridOrder());
		paramsEntity.setMaxAge(riderProductDetailDto.getMaxAge());
		paramsEntity.setMinAge(riderProductDetailDto.getMinAge());
		paramsEntity.setModifyBy(riderProductDetailDto.getModifyBy());
		paramsEntity.setModifyDate(riderProductDetailDto.getModifyDate());
		paramsEntity.setPrintOrder(riderProductDetailDto.getPrintOrder());
		paramsEntity.setValidation(riderProductDetailDto.getValidation());
		paramsEntity.setRiderEntity(c);;
		paramsEntity.setProductEntity(r);
		
		riderProductDetailsRepo.save(paramsEntity);
	}

	@Override
	public List<RiderProductDetailDto> getAll() {
		List<RiderProductDetailDto> list=new ArrayList<>();
        Iterable<RiderProductDetailEntity> allCus= riderProductDetailsRepo.findAll();
        for (RiderProductDetailEntity c : allCus){
            list.add(new RiderProductDetailDto(c.getRpId(),c.getCalculation(),c.getCreateBy(),c.getCreateDate(),c.getIsEnable(),
            		c.getGridOrder(),c.getMaxAge(),c.getMinAge(),
            		c.getModifyBy(),c.getModifyDate(),c.getPrintOrder(),c.getValidation(),c.getRiderEntity().getId()
            		,c.getProductEntity().getProductId()
            ));

        }
        return list;
	}
}
