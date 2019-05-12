package lk.arpico.proddb.dto;

import java.util.Date;

public class OccupationLoadingDto {

	private String occupationLoadingId;
	private String createBy;
	private Date createDate;
	private Double emRate;
	private Integer isEnable;
	private String modifyBy;
	private Date modifyDate;
	private Double rateMil;
	private Double subRate;
	private Double value;
	private String ryderId;
	private String occupationId;
	
	public OccupationLoadingDto() {
		// TODO Auto-generated constructor stub
	}

	public OccupationLoadingDto(String occupationLoadingId, String createBy, Date createDate, Double emRate,
			Integer isEnable, String modifyBy, Date modifyDate, Double rateMil, Double subRate, Double value,
			String ryderId, String occupationId) {
		super();
		this.occupationLoadingId = occupationLoadingId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.emRate = emRate;
		this.isEnable = isEnable;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.rateMil = rateMil;
		this.subRate = subRate;
		this.value = value;
		this.ryderId = ryderId;
		this.occupationId = occupationId;
	}

	public String getOccupationLoadingId() {
		return occupationLoadingId;
	}

	public void setOccupationLoadingId(String occupationLoadingId) {
		this.occupationLoadingId = occupationLoadingId;
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

	public Double getEmRate() {
		return emRate;
	}

	public void setEmRate(Double emRate) {
		this.emRate = emRate;
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

	public Double getRateMil() {
		return rateMil;
	}

	public void setRateMil(Double rateMil) {
		this.rateMil = rateMil;
	}

	public Double getSubRate() {
		return subRate;
	}

	public void setSubRate(Double subRate) {
		this.subRate = subRate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getRyderId() {
		return ryderId;
	}

	public void setRyderId(String ryderId) {
		this.ryderId = ryderId;
	}

	public String getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
	}

	@Override
	public String toString() {
		return "OccupationLoadingDto [occupationLoadingId=" + occupationLoadingId + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", emRate=" + emRate + ", isEnable=" + isEnable + ", modifyBy="
				+ modifyBy + ", modifyDate=" + modifyDate + ", rateMil=" + rateMil + ", subRate=" + subRate + ", value="
				+ value + ", ryderId=" + ryderId + ", occupationId=" + occupationId + "]";
	}

	
}
