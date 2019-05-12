package lk.arpico.proddb.entity;

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
@Table(name = "number_params")
public class NumberParamsEntity {
	
	@Id
	@Column(name = "number_Param_Id", length = 11, nullable = false)
	private String id;
	
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
	
	@OneToMany(mappedBy = "numParamsEntities", targetEntity = ProductNumParamsEntity.class)
	private List<ProductNumParamsEntity> productNumParamsEntities= new ArrayList<>();
	
	public NumberParamsEntity() {
		// TODO Auto-generated constructor stub
	}

	public NumberParamsEntity(String id, String createBy, Date createDate, Integer isEnable, String modifyBy,
			Date modifyDate, String name, String sName, List<ProductNumParamsEntity> productNumParamsEntities) {
		super();
		this.id = id;
		this.createBy = createBy;
		this.createDate = createDate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.name = name;
		this.sName = sName;
		this.productNumParamsEntities = productNumParamsEntities;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<ProductNumParamsEntity> getProductNumParamsEntities() {
		return productNumParamsEntities;
	}

	public void setProductNumParamsEntities(List<ProductNumParamsEntity> productNumParamsEntities) {
		this.productNumParamsEntities = productNumParamsEntities;
	}

	@Override
	public String toString() {
		return "NumberParamsEntity [id=" + id + ", createBy=" + createBy + ", createDate=" + createDate + ", isEnable="
				+ isEnable + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + ", name=" + name + ", sName="
				+ sName + ", productNumParamsEntities=" + productNumParamsEntities + "]";
	}

	
}
