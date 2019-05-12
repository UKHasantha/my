package lk.arpico.proddb.service;

import java.util.List;

import lk.arpico.proddb.dto.ProductNumParamsDto;
import lk.arpico.proddb.entity.ProductNumParamsEntity;

public interface Product_Num_ParamsService {

	void add(ProductNumParamsDto paramsdto);

	List<ProductNumParamsDto> getAll();

	void update(ProductNumParamsDto paramsdto);

	void delete(String id);

	ProductNumParamsDto searchById(String id);

}
