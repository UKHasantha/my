 package lk.arpico.proddb.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import lk.arpico.proddb.entity.RiderEntity;



public interface RiderServiceRepo extends CrudRepository<RiderEntity,String>{

	Optional<RiderEntity> findByName(String name);

	Optional<RiderEntity> findBysName(String id);

	Optional<RiderEntity> findByCode(String id);

}
