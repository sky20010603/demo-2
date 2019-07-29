package com.accp.xxmis.pojo;

public class t_record {

	private Integer id;
	private String name;
	private String stuCode;
	private String createDate;
	private String createBy;
	private String des;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public t_record(Integer id, String name, String stuCode, String createDate, String createBy, String des) {
		super();
		this.id = id;
		this.name = name;
		this.stuCode = stuCode;
		this.createDate = createDate;
		this.createBy = createBy;
		this.des = des;
	}
	
	public t_record() {
		
	}
	@Override
	public String toString() {
		return "t_record [id=" + id + ", name=" + name + ", stuCode=" + stuCode + ", createDate=" + createDate
				+ ", createBy=" + createBy + ", des=" + des + "]";
	}
	
}
