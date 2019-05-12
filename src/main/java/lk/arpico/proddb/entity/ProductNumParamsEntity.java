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
@Table(name = "product_num_params")
public class ProductNumParamsEntity {
	
	@Id
	@Column(name = "product_Num_Param_Id", length = 11, nullable = false)
	private String id;
	
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
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="id", referencedColumnName ="number_Param_Id", nullable= false)
	private NumberParamsEntity numParamsEntities;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="productId", referencedColumnName ="productId", nullable= false)
	private ProductEntity productEntity;
	
	public ProductNumParamsEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductNumParamsEntity(String id, String createBy, Date createDate, Integer isEnable, String modifyBy,
			Date modifyDate, NumberParamsEntity numParamsEntities, ProductEntity productEntity) {
		super();
		this.id = id;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.numParamsEntities = numParamsEntities;
		this.productEntity = productEntity;
	}

	public ProductNumParamsEntity(String id, String createBy, Date createDate, Integer isEnable, String modifyBy,
			Date modifyDate) {
		super();
		this.id = id;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public NumberParamsEntity getNumParamsEntities() {
		return numParamsEntities;
	}

	public void setNumParamsEntities(NumberParamsEntity numParamsEntities) {
		this.numParamsEntities = numParamsEntities;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	@Override
	public String toString() {
		return "ProductNumParamsEntity [id=" + id + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", numParamsEntities=" + numParamsEntities + ", productEntity=" + productEntity + "]";
	}

	
}
