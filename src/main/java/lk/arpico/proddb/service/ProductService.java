package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.ProductDto;
import lk.arpico.proddb.entity.RiderEntity;

public interface ProductService {

	void addProduct(ProductDto productDto);

	List<ProductDto> getAllProducts();

	void updateProducts(ProductDto productDto);

	void deleteProduct(String id);

	ProductDto searchProductByCode(String id);

	ProductDto searchProductByName(String id);

	ProductDto searchProductBysName(String id);

}
