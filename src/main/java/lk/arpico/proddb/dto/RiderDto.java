package lk.arpico.proddb.dto;

import java.util.Date;

public class RiderDto {

	private String id;
	private String code;
	private String combination;
	private String createBy;
	private Date createDate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private String Name;
	private String sName;
	private String type;
	
	public RiderDto() {
		// TODO Auto-generated constructor stub
	}

	public RiderDto(String id, String code, String combination, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String name, String sName, String type) {
		super();
		this.id = id;
		this.code = code;
		this.combination = combination;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.Name = name;
		this.sName = sName;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCombination() {
		return combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RiderDto [id=" + id + ", code=" + code + ", combination=" + combination + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate="
				+ modifyDate + ", Name=" + Name + ", sName=" + sName + ", type=" + type + "]";
	}

	
	
	
}
