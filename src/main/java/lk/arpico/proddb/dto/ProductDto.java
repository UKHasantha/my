package lk.arpico.proddb.dto;

import java.util.Date;

public class ProductDto {

	private String productId;
	private String calculation;
	private String code;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private Integer maxAge;
	private Integer minAge;
	private String modifyBy;
	private Date modifyDate;
	private String name;
	private String sName;
	private String validation;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String productId, String calculation, String code, String createBy, Date createDate,
			Integer isEnable, Integer maxAge, Integer minAge, String modifyBy, Date modifyDate, String name, String sName,
			String validation) {
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

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", calculation=" + calculation + ", code=" + code + ", createBy="
				+ createBy + ", createDate=" + createDate + ", isEnable=" + isEnable + ", maxAge=" + maxAge
				+ ", minAge=" + minAge + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + ", name=" + name
				+ ", sName=" + sName + ", validation=" + validation + "]";
	}
	
	
}
