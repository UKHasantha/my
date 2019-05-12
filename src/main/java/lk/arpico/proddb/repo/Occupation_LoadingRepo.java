package lk.arpico.proddb.repo;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lk.arpico.proddb.entity.OccupationLoadingEntity;

public interface Occupation_LoadingRepo extends CrudRepository<OccupationLoadingEntity, String>{

//	@Query(value = "SELECT occupationLoadingId  FROM OccupationLoadingEntity c  WHERE c.occupationEntity LIKE %:id%")
//	String findOid(@org.springframework.data.repository.query.Param("id")String id);

	
//	@Query(value = "SELECT v  FROM OccupationLoadingEntity v WHERE LOWER(v.occupationEntity) = LOWER(:id) ")
//	List<OccupationLoadingEntity> fi(@org.springframework.data.repository.query.Param("id")String id);
	
	List<OccupationLoadingEntity> findByOccupationLoadingId(String occupationLoadingId)throws Exception;
	
//	 @Query(value = "SELECT v FROM Vehicle v WHERE LOWER(v.automission) = LOWER(:automission) and LOWER(v.fuelType)=lower(:fuelType) " +
//	            "and LOWER(v.vehicletype)=lower(:vehicletype) ")
//
//	    public List<Vehicle> getNeedVehicle(@Param("automission") String automission, @Param("fuelType") String fuelType,
//	                                        @Param("vehicletype") String vehicletype);
//	
	
}
