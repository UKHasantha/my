  package lk.arpico.proddb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "Rider")
public class RiderEntity implements Serializable {

	@Id
	@Column(name = "riderId", length = 11, nullable = false)
	private String id;
	
	@Column(name = "code",length = 10, nullable = false)
	private String code;
	
	@Column(name = "combination", length = 10, nullable = false)
	private String combination;
	
	@Column(name = "createBy", length = 50, nullable = false)
	private String createBy;
	
	@Column(name = "createDate", nullable = false, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "isEnable", length = 11, nullable = false, columnDefinition = "SMALLINT(1)")
	private Integer isEnable;
	
	@Column(name = "modifyBy", length = 50, nullable = true)
	private String modifyBy;
	
	@Column(name = "modifyDate", nullable = true, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyDate;
	
	@Column(name = "name", length = 60, nullable = false)
	private String name;
	
	@Column(name = "shortName", length = 15, nullable = false)
	private String sName;
	
	@Column(name = "type", length = 10,nullable = false)
	private String type;
	
	@OneToMany(mappedBy = "riderEntity", targetEntity = RiderProductDetailEntity.class)
    private List<RiderProductDetailEntity> riderProductDetailEntities= new ArrayList<>();
	
	
	@OneToMany(mappedBy = "riderEntity", targetEntity = OccupationLoadingEntity.class)
	private List<OccupationLoadingEntity> occupationLoadingEntities= new ArrayList<>();
	
	public RiderEntity() {
		super();
	}

	public RiderEntity(String id, String code, String combination, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String name, String sName, String type,
			List<RiderProductDetailEntity> riderProductDetailEntities,
			List<OccupationLoadingEntity> occupationLoadingEntities) {
		super();
		this.id = id;
		this.code = code;
		this.combination = combination;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.name = name;
		this.sName = sName;
		this.type = type;
		this.riderProductDetailEntities = riderProductDetailEntities;
		this.occupationLoadingEntities = occupationLoadingEntities;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCombination() {
		return combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<RiderProductDetailEntity> getRiderProductDetailEntities() {
		return riderProductDetailEntities;
	}

	public void setRiderProductDetailEntities(List<RiderProductDetailEntity> riderProductDetailEntities) {
		this.riderProductDetailEntities = riderProductDetailEntities;
	}

	public List<OccupationLoadingEntity> getOccupationLoadingEntities() {
		return occupationLoadingEntities;
	}

	public void setOccupationLoadingEntities(List<OccupationLoadingEntity> occupationLoadingEntities) {
		this.occupationLoadingEntities = occupationLoadingEntities;
	}

	

	
}
