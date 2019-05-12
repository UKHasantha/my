package lk.arpico.proddb.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lk.arpico.proddb.entity.OccupationEntity;

public interface OccupationRepo extends CrudRepository<OccupationEntity, String> {

	/* @Query(value = "SELECT occupationId  FROM OccupationEntity c  WHERE c.code LIKE %:value%")
		String findIdOf(@org.springframework.data.repository.query.Param("value")String value);

	 @Query(value = "SELECT occupationId  FROM OccupationEntity c  WHERE c.name LIKE %:name%")
	 String findIdOfName(@org.springframework.data.repository.query.Param("name")String name);
	
	 @Query(value = "SELECT occupationId  FROM OccupationEntity c  WHERE c.sName LIKE %:SName%")
	 String findIdOfSName(@org.springframework.data.repository.query.Param("SName")String SName);*/
	
	List<OccupationEntity> findByCodeContaining(String code) throws Exception;
	
	List<OccupationEntity> findByNameContaining(String name) throws Exception;
	
	List<OccupationEntity> findBysNameContaining(String sName) throws Exception;
	 
//	 @Query(value = "SELECT COUNT(*) FROM OccupationEntity c  WHERE c.sName LIKE %:SName%")
//	 String findIdOfSName(@org.springframework.data.repository.query.Param("SName")String SName);

}
