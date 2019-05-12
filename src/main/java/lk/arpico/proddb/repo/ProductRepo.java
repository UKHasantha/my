package lk.arpico.proddb.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import lk.arpico.proddb.entity.ProductEntity;
import lk.arpico.proddb.entity.NumberParamsEntity;

public interface ProductRepo extends CrudRepository<ProductEntity, String>{

	Optional<ProductEntity> findByCode(String id);

	Optional<ProductEntity> findByName(String id);

	Optional<ProductEntity> findBysName(String id);

	

}
