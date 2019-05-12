package lk.arpico.proddb.dto;

import java.util.Date;

public class ProductNumParamsDto {

	private String productNumParamId;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private String numberParamId;
	private String productId;
	
	public ProductNumParamsDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductNumParamsDto(String productNumParamId, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String numberParamId, String productId) {
		super();
		this.productNumParamId = productNumParamId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.numberParamId = numberParamId;
		this.productId = productId;
	}

	public String getProductNumParamId() {
		return productNumParamId;
	}

	public void setProductNumParamId(String productNumParamId) {
		this.productNumParamId = productNumParamId;
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

	public String getNumberParamId() {
		return numberParamId;
	}

	public void setNumberParamId(String numberParamId) {
		this.numberParamId = numberParamId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductNumParamsDto [productNumParamId=" + productNumParamId + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate="
				+ modifyDate + ", numberParamId=" + numberParamId + ", productId=" + productId + "]";
	}

	
}
