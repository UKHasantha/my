package lk.arpico.proddb.dto;

import java.util.Date;

public class StringParamsDto {

	private String stringParamsId;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private String name;
	private String sName;
	
	public StringParamsDto() {
		// TODO Auto-generated constructor stub
	}

	public StringParamsDto(String stringParamsId, String createBy, Date createDate, Integer isEnable, String modifyBy,
			Date modifyDate, String name, String sName) {
		super();
		this.stringParamsId = stringParamsId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.name = name;
		this.sName = sName;
	}

	public String getStringParamsId() {
		return stringParamsId;
	}

	public void setStringParamsId(String stringParamsId) {
		this.stringParamsId = stringParamsId;
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

	@Override
	public String toString() {
		return "StringParamsDto [stringParamsId=" + stringParamsId + ", createBy=" + createBy + ", createDate="
				+ createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", name=" + name + ", sName=" + sName + "]";
	}

}
