package com.accp.xxmis.pojo;

public class t_student {

	private Integer id;
	private String code;
	private String name;
	private Integer major;
	private String grade;
	private Integer sex;
	private String birthday;
	private Integer tel;
	private Integer job;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMajor() {
		return major;
	}
	public void setMajor(Integer major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public Integer getJob() {
		return job;
	}
	public void setJob(Integer job) {
		this.job = job;
	}
	public t_student(Integer id, String code, String name, Integer major, String grade, Integer sex, String birthday,
			Integer tel, Integer job) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.sex = sex;
		this.birthday = birthday;
		this.tel = tel;
		this.job = job;
	}
	
	public t_student() {
		
	}
	@Override
	public String toString() {
		return "t_student [id=" + id + ", code=" + code + ", name=" + name + ", major=" + major + ", grade=" + grade
				+ ", sex=" + sex + ", birthday=" + birthday + ", tel=" + tel + ", job=" + job + "]";
	}
	public t_student(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
}
