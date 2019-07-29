package com.accp.xxmis.pojo;

public class peitems {

	private Integer itemid;
	private String itemname;
	private Integer typeid;
	private Integer necessary;
	private String ref;
	private Integer price;
	private String info;
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public Integer getNecessary() {
		return necessary;
	}
	public void setNecessary(Integer necessary) {
		this.necessary = necessary;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public peitems(Integer itemid, String itemname, Integer typeid, Integer necessary, String ref, Integer price,
			String info) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.typeid = typeid;
		this.necessary = necessary;
		this.ref = ref;
		this.price = price;
		this.info = info;
	}
	
	public peitems() {
		
	}
	@Override
	public String toString() {
		return "peitems [itemid=" + itemid + ", itemname=" + itemname + ", typeid=" + typeid + ", necessary="
				+ necessary + ", ref=" + ref + ", price=" + price + ", info=" + info + "]";
	}
	public peitems(String itemname, Integer typeid, Integer necessary, String ref, Integer price, String info) {
		super();
		this.itemname = itemname;
		this.typeid = typeid;
		this.necessary = necessary;
		this.ref = ref;
		this.price = price;
		this.info = info;
	}
	
	
}
