package lk.arpico.proddb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "string_params")
public class StringParamsEntity implements Serializable{

	@Id
	@Column(name = "string_params_Id", length = 11, nullable = false)
	private String stringParamsId;
	
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
	
	@Column(name = "name", length = 60, nullable = false)
	private String name;
	
	@Column(name = "shortName", length = 15, nullable = false)
	private String sName;
	
	@OneToMany(mappedBy = "stringParamsEntity", targetEntity = ProdStringParamsEntity.class)
	private List<ProdStringParamsEntity> prodStringParamsEntities= new ArrayList<>();
	
	public StringParamsEntity() {
		// TODO Auto-generated constructor stub
	}

	public StringParamsEntity(String stringParamsId, String createBy, Date createDate, Integer isEnable,
			String modifyBy, Date modifyDate, String name, String sName,
			List<ProdStringParamsEntity> prodStringParamsEntities) {
		super();
		this.stringParamsId = stringParamsId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.name = name;
		this.sName = sName;
		this.prodStringParamsEntities = prodStringParamsEntities;
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

	public List<ProdStringParamsEntity> getProdStringParamsEntities() {
		return prodStringParamsEntities;
	}

	public void setProdStringParamsEntities(List<ProdStringParamsEntity> prodStringParamsEntities) {
		this.prodStringParamsEntities = prodStringParamsEntities;
	}

	@Override
	public String toString() {
		return "StringParamsEntity [stringParamsId=" + stringParamsId + ", createBy=" + createBy + ", createDate="
				+ createDate + ", isEnable=" + isEnable + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", name=" + name + ", sName=" + sName + ", prodStringParamsEntities=" + prodStringParamsEntities
				+ "]";
	}

	
}
