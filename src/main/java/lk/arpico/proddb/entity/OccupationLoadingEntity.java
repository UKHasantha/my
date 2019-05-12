package lk.arpico.proddb.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="occupation_loading")
public class OccupationLoadingEntity {

	@Id
	@Column(name = "occupation_Loading_Id", length = 255, nullable = false)
	private String occupationLoadingId;
	
	@Column(name = "createBy", length = 50, nullable = false)
	private String createBy;

	@Column(name = "createDate", nullable = false, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="em_Rate",nullable=false, columnDefinition="DECIMAL(10,0)")
	private Double emRate;
	
	@Column(name = "isEnable", length = 11, nullable = false, columnDefinition = "SMALLINT(1)")
	private Integer isEnable;
	
	@Column(name = "modifyBy", length = 50, nullable = true)
	private String modifyBy;
	
	@Column(name = "modifyDate", nullable = true, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyDate;
	
	@Column(name="rate_Mil",nullable=false, columnDefinition="DECIMAL(10,0)")
	private Double rateMil;
	
	@Column(name="sub_Rate",nullable=false, columnDefinition="DECIMAL(10,0)")
	private Double subRate;
	
	@Column(name="value",nullable=false, columnDefinition="DECIMAL(10,0)")
	private Double value;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="id", referencedColumnName ="riderId", nullable= false)
	private RiderEntity riderEntity;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="occupationId", referencedColumnName ="occupation_Id", nullable= false)
	private OccupationEntity occupationEntity;
	
	public OccupationLoadingEntity() {
		// TODO Auto-generated constructor stub
	}

	public OccupationLoadingEntity(String occupationLoadingId, String createBy, Date createDate, Double emRate,
			Integer isEnable, String modifyBy, Date modifyDate, Double rateMil, Double subRate, Double value,
			RiderEntity riderEntity, OccupationEntity occupationEntity) {
		super();
		this.occupationLoadingId = occupationLoadingId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.emRate = emRate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.rateMil = rateMil;
		this.subRate = subRate;
		this.value = value;
		this.riderEntity = riderEntity;
		this.occupationEntity = occupationEntity;
	}

	public String getOccupationLoadingId() {
		return occupationLoadingId;
	}

	public void setOccupationLoadingId(String occupationLoadingId) {
		this.occupationLoadingId = occupationLoadingId;
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

	public Double getEmRate() {
		return emRate;
	}

	public void setEmRate(Double emRate) {
		this.emRate = emRate;
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

	public Double getRateMil() {
		return rateMil;
	}

	public void setRateMil(Double rateMil) {
		this.rateMil = rateMil;
	}

	public Double getSubRate() {
		return subRate;
	}

	public void setSubRate(Double subRate) {
		this.subRate = subRate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public RiderEntity getRiderEntity() {
		return riderEntity;
	}

	public void setRiderEntity(RiderEntity riderEntity) {
		this.riderEntity = riderEntity;
	}

	public OccupationEntity getOccupationEntity() {
		return occupationEntity;
	}

	public void setOccupationEntity(OccupationEntity occupationEntity) {
		this.occupationEntity = occupationEntity;
	}

	

	
}
