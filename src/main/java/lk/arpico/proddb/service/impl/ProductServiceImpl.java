package lk.arpico.proddb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.arpico.proddb.dto.ProductDto;
import lk.arpico.proddb.dto.RiderDto;
import lk.arpico.proddb.entity.ProductEntity;
import lk.arpico.proddb.entity.RiderEntity;
import lk.arpico.proddb.repo.ProductRepo;
import lk.arpico.proddb.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void addProduct(ProductDto productDto) {
		ProductEntity product=new ProductEntity();
		product.setProductId(productDto.getProductId());
		product.setCalculation(productDto.getCalculation());
		product.setCode(productDto.getCode());
		product.setCreateBy(productDto.getCreateBy());
		product.setCreateDate(productDto.getCreateDate());
		product.setIsEnable(productDto.getIsEnable());
		product.setMaxAge(productDto.getMaxAge());
		product.setMinAge(productDto.getMinAge());
		product.setModifyBy(productDto.getModifyBy());
		product.setModifyDate(productDto.getModifyDate());
		product.setName(productDto.getName());
		product.setsName(productDto.getsName());
		product.setValidation(productDto.getValidation());
		productRepo.save(product);
		
	}

	@Override
	public List<ProductDto> getAllProducts() {
		List<ProductDto> list=new ArrayList<>();
        Iterable<ProductEntity> allCus= productRepo.findAll();
        for (ProductEntity c : allCus){
            list.add(new ProductDto(c.getProductId(),c.getCalculation(),c.getCode(),c.getCreateBy(),c.getCreateDate(),
            		c.getIsEnable(),c.getMaxAge(),
            		c.getMinAge(),c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName(),c.getValidation()
            ));

        }
        return list;
	}

	@Override
	public void updateProducts(ProductDto productDto) {
		ProductEntity product=new ProductEntity();
		product.setProductId(productDto.getProductId());
		product.setCalculation(productDto.getCalculation());
		product.setCode(productDto.getCode());
		product.setCreateBy(productDto.getCreateBy());
		product.setCreateDate(productDto.getCreateDate());
		product.setIsEnable(productDto.getIsEnable());
		product.setMaxAge(productDto.getMaxAge());
		product.setMinAge(productDto.getMinAge());
		product.setModifyBy(productDto.getModifyBy());
		product.setModifyDate(productDto.getModifyDate());
		product.setName(productDto.getName());
		product.setsName(productDto.getsName());
		product.setValidation(productDto.getValidation());
		productRepo.save(product);
		
	}

	@Override
	public void deleteProduct(String id) {
		ProductEntity productEntity = null;
		Optional<ProductEntity> cus = this.productRepo.findById(id);
        if (cus.isPresent()) {
             productEntity=cus.get();
        } else {
             
        }
        
		if(productEntity!=null) {
			productEntity.setIsEnable(0);
			productRepo.save(productEntity);
		}else {}
		
	}

	@Override
	public ProductDto searchProductByCode(String id) {
		ProductEntity c;
		Optional<ProductEntity> cus = this.productRepo.findByCode(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
        return new ProductDto(c.getProductId(),c.getCalculation(),c.getCode(),c.getCreateBy(),c.getCreateDate(),
        		c.getIsEnable(),c.getMaxAge(),
        		c.getMinAge(),c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName(),c.getValidation()
        );
	}

	@Override
	public ProductDto searchProductByName(String id) {
		ProductEntity c;
		Optional<ProductEntity> cus = this.productRepo.findByName(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
        return new ProductDto(c.getProductId(),c.getCalculation(),c.getCode(),c.getCreateBy(),c.getCreateDate(),
        		c.getIsEnable(),c.getMaxAge(),
        		c.getMinAge(),c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName(),c.getValidation()
        );
	}

	@Override
	public ProductDto searchProductBysName(String id) {
		ProductEntity c;
		Optional<ProductEntity> cus = this.productRepo.findBysName(id);
        if (cus.isPresent()) {
            c= cus.get();
        } else {
            return null;
        }
        return new ProductDto(c.getProductId(),c.getCalculation(),c.getCode(),c.getCreateBy(),c.getCreateDate(),
        		c.getIsEnable(),c.getMaxAge(),
        		c.getMinAge(),c.getModifyBy(),c.getModifyDate(),c.getName(),c.getsName(),c.getValidation()
        );
	}
	
}
