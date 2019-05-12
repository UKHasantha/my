package lk.arpico.proddb.dto;

import java.util.Date;

public class RiderProductDetailDto {

	private String rpId ;
	private String calculation;
	private String createBy ;
	private Date createDate;
	private Integer isEnable;
	private Integer gridOrder;
	private Integer maxAge;
	private Integer minAge;
	private String modifyBy;
	private Date modifyDate;
	private Integer printOrder;
	private String validation;
	private String ryderId;
	private String productId;
	
	public RiderProductDetailDto() {
		// TODO Auto-generated constructor stub
	}

	public RiderProductDetailDto(String rpId, String calculation, String createBy, Date createDate, Integer isEnable,
			Integer gridOrder, Integer maxAge, Integer minAge, String modifyBy, Date modifyDate, Integer printOrder,
			String validation, String ryderId, String productId) {
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
		this.ryderId = ryderId;
		this.productId = productId;
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

	public String getRyderId() {
		return ryderId;
	}

	public void setRyderId(String ryderId) {
		this.ryderId = ryderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "RiderProductDetailDto [rpId=" + rpId + ", calculation=" + calculation + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", gridOrder=" + gridOrder + ", maxAge="
				+ maxAge + ", minAge=" + minAge + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", printOrder=" + printOrder + ", validation=" + validation + ", ryderId=" + ryderId + ", productId="
				+ productId + "]";
	}
	
	
	
}
