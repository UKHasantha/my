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
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

@Entity
@Table(name = "Product")
public class ProductEntity implements Serializable {

	@Id
	@Column(name = "productId", length = 50, nullable = false)
	private String productId;
	
	@Column(name = "calculation", length = 255, nullable = false)
	private String calculation;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	
	@Column(name = "createBy", length = 50, nullable = false)
	private String createBy;
	
	@Column(name = "createDate", nullable = false, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "isEnable", length = 11, nullable = false, columnDefinition = "SMALLINT(1)")
	private Integer isEnable;
	
	@Column(name = "maxAge", length = 11, nullable = false)
	private Integer maxAge;
	
	@Column(name = "minAge", length = 11, nullable = false)
	private Integer minAge;
	
	@Column(name = "modifyBy", length = 50, nullable = true)
	private String modifyBy;
	
	@Column(name = "modifyDate", nullable = true, columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyDate;
	
	@Column(name = "name", length = 60, nullable = false)
	private String name;

	@Column(name = "shortName", length = 15, nullable = false)
	private String sName;

	@Column(name = "validation", length = 255,nullable = false)
	private String validation;

	@OneToMany(mappedBy = "productEntity", targetEntity = RiderProductDetailEntity.class)
	private List<RiderProductDetailEntity> ryderProductDetails= new ArrayList<>();

	@OneToMany(mappedBy = "productEntity", targetEntity = ProductNumParamsEntity.class)
	private List<ProductNumParamsEntity> productNumParamsEntities= new ArrayList<>();

	@OneToMany(mappedBy = "productEntity", targetEntity = ProdStringParamsEntity.class)
	private List<ProdStringParamsEntity> prodStringParamsEntities= new ArrayList<>();

	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(String productId, String calculation, String code, String createBy, Date createDate,
			Integer isEnable, Integer maxAge, Integer minAge, String modifyBy, Date modifyDate, String name,
			String sName, String validation, List<RiderProductDetailEntity> ryderProductDetails,
			List<ProductNumParamsEntity> productNumParamsEntities,
			List<ProdStringParamsEntity> prodStringParamsEntities) {
		super();
		this.productId = productId;
		this.calculation = calculation;
		this.code = code;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.maxAge = maxAge;
		this.minAge = minAge;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.name = name;
		this.sName = sName;
		this.validation = validation;
		this.ryderProductDetails = ryderProductDetails;
		this.productNumParamsEntities = productNumParamsEntities;
		this.prodStringParamsEntities = prodStringParamsEntities;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCalculation() {
		return calculation;
	}

	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public List<RiderProductDetailEntity> getRyderProductDetails() {
		return ryderProductDetails;
	}

	public void setRyderProductDetails(List<RiderProductDetailEntity> ryderProductDetails) {
		this.ryderProductDetails = ryderProductDetails;
	}

	public List<ProductNumParamsEntity> getProductNumParamsEntities() {
		return productNumParamsEntities;
	}

	public void setProductNumParamsEntities(List<ProductNumParamsEntity> productNumParamsEntities) {
		this.productNumParamsEntities = productNumParamsEntities;
	}

	public List<ProdStringParamsEntity> getProdStringParamsEntities() {
		return prodStringParamsEntities;
	}

	public void setProdStringParamsEntities(List<ProdStringParamsEntity> prodStringParamsEntities) {
		this.prodStringParamsEntities = prodStringParamsEntities;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", calculation=" + calculation + ", code=" + code
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", isEnable=" + isEnable + ", maxAge="
				+ maxAge + ", minAge=" + minAge + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + ", name="
				+ name + ", sName=" + sName + ", validation=" + validation + ", ryderProductDetails="
				+ ryderProductDetails + ", productNumParamsEntities=" + productNumParamsEntities
				+ ", prodStringParamsEntities=" + prodStringParamsEntities + "]";
	}


}
