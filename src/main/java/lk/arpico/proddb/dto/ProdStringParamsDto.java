package lk.arpico.proddb.dto;

import java.util.Date;

public class ProdStringParamsDto {

	private String productStringParamId;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private String stringParamsId;
	private String productId;
	
	public ProdStringParamsDto() {
		// TODO Auto-generated constructor stub
	}

	public ProdStringParamsDto(String productStringParamId, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String stringParamsId, String productId) {
		super();
		this.productStringParamId = productStringParamId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.stringParamsId = stringParamsId;
		this.productId = productId;
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

	public String getStringParamsId() {
		return stringParamsId;
	}

	public void setStringParamsId(String stringParamsId) {
		this.stringParamsId = stringParamsId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProdStringParamsDto [productStringParamId=" + productStringParamId + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate="
				+ modifyDate + ", stringParamsId=" + stringParamsId + ", productId=" + productId + "]";
	}

	
}
