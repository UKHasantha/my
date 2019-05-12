package lk.arpico.proddb.entity;

import java.io.Serializable;
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
@Table(name = "RyderPRoductDetails")
public class RiderProductDetailEntity implements Serializable{
	@Id
	@Column(name = "rpId", length = 50, nullable = false)
	private String rpId;
	
	@Column(name = "calculation", length = 255, nullable = false)
	private String calculation;
	
	@Column(name = "createBy", length = 50, nullable = false)
	private String createBy;
	
	@Column(name = "createDate", nullable = false, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "isEnable", length = 11, nullable = false, columnDefinition = "SMALLINT(1)")
	private Integer isEnable;
	
	@Column(name = "gridOrder", length = 11, nullable = false)
	private Integer gridOrder;
	
	@Column(name = "maxAge", length = 11, nullable = false)
	private Integer maxAge;
	
	@Column(name = "minAge", length = 11, nullable = false)
	private Integer minAge;
	
	@Column(name = "modifyBy", length = 50, nullable = true)
	private String modifyBy;
	
	@Column(name = "modifyDate", nullable = true, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyDate;
	
	@Column(name = "printorder", length = 11, nullable=false)
	private Integer printOrder;
	
	@Column(name = "validation", length = 255,nullable = false)
	private String validation;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="id", referencedColumnName ="riderId", nullable= false)
	private RiderEntity riderEntity;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="productId", referencedColumnName ="productId", nullable= false)
	private ProductEntity productEntity;

	public RiderProductDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RiderProductDetailEntity(String rpId, String calculation, String createBy, Date createDate, Integer isEnable,
			Integer gridOrder, Integer maxAge, Integer minAge, String modifyBy, Date modifyDate, Integer printOrder,
			String validation, RiderEntity riderEntity, ProductEntity productEntity) {
		super();
		this.rpId = rpId;
		this.calculation = calculation;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.gridOrder = gridOrder;
		this.maxAge = maxAge;
		this.minAge = minAge;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.printOrder = printOrder;
		this.validation = validation;
		this.riderEntity = riderEntity;
		this.productEntity = productEntity;
	}

	public String getRpId() {
		return rpId;
	}

	public void setRpId(String rpId) {
		this.rpId = rpId;
	}

	public String getCalculation() {
		return calculation;
	}

	public void setCalculation(String calculation) {
		this.calculation = calculation;
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

	public Integer getGridOrder() {
		return gridOrder;
	}

	public void setGridOrder(Integer gridOrder) {
		this.gridOrder = gridOrder;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
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

	public Integer getPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(Integer printOrder) {
		this.printOrder = printOrder;
	}

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public RiderEntity getRiderEntity() {
		return riderEntity;
	}

	public void setRiderEntity(RiderEntity riderEntity) {
		this.riderEntity = riderEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	@Override
	public String toString() {
		return "RiderProductDetailEntity [rpId=" + rpId + ", calculation=" + calculation + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", gridOrder=" + gridOrder + ", maxAge="
				+ maxAge + ", minAge=" + minAge + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", printOrder=" + printOrder + ", validation=" + validation + ", riderEntity=" + riderEntity
				+ ", productEntity=" + productEntity + "]";
	}
	
	
}
