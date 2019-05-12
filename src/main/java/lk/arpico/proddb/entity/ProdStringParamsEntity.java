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
@Table(name = "prod_string_params")
public class ProdStringParamsEntity {

	@Id
	@Column(name = "product_String_Param_Id", length = 11, nullable = false)
	private String productStringParamId;
	
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
	@JoinColumn(name="stringparamsId", referencedColumnName ="string_params_Id", nullable= false)
	private StringParamsEntity stringParamsEntity;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="productId", referencedColumnName ="productId", nullable= false)
	private ProductEntity productEntity;
	
	public ProdStringParamsEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProdStringParamsEntity(String productStringParamId, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, StringParamsEntity stringParamsEntity, ProductEntity productEntity) {
		super();
		this.productStringParamId = productStringParamId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.stringParamsEntity = stringParamsEntity;
		this.productEntity = productEntity;
	}

	public String getProductStringParamId() {
		return productStringParamId;
	}

	public void setProductStringParamId(String productStringParamId) {
		this.productStringParamId = productStringParamId;
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

	public StringParamsEntity getStringParamsEntity() {
		return stringParamsEntity;
	}

	public void setStringParamsEntity(StringParamsEntity stringParamsEntity) {
		this.stringParamsEntity = stringParamsEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	@Override
	public String toString() {
		return "ProdStringParamsEntity [productStringParamId=" + productStringParamId + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate="
				+ modifyDate + ", stringParamsEntity=" + stringParamsEntity + ", productEntity=" + productEntity + "]";
	}

	
}
