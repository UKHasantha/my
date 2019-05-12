package lk.arpico.proddb.dto;

import java.util.Date;

public class OccupationDto {

	private String occupationId;
	private String code;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private String Name;
	private String sName;
	
	
	
	public OccupationDto() {
		// TODO Auto-generated constructor stub
	}

	public OccupationDto(String occupationId, String code, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String name, String sName) {
		super();
		this.occupationId = occupationId;
		this.code = code;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		Name = name;
		this.sName = sName;
	}

	public String getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
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
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "OccupationDto [occupationId=" + occupationId + ", code=" + code + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate="
				+ modifyDate + ", Name=" + Name + ", sName=" + sName + "]";
	}

	
}
