package com.accp.xxmis.pojo;

public class itemtypes {

	private Integer typeid;
	private String typename;
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public itemtypes(Integer typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}
	@Override
	public String toString() {
		return "itemtypes [typeid=" + typeid + ", typename=" + typename + "]";
	}
	
	public itemtypes() {
		
	}
}
