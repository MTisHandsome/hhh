package com.crm.bean;

import java.util.List;

public class Tea {
    private Integer teaId;

    private String teaName;

    private String teaSex;

    private String teaPhone;

    private Integer teaClass;

    private Integer teaYear;
    
    private Integer schoolId;
    
    private School school;
    
    private List<User> users;
    
    public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	

    public List<User> getUsers() {
		return users;
	}

	@Override
	public String toString() {
		return "Tea [teaId=" + teaId + ", teaName=" + teaName + ", teaSex=" + teaSex + ", teaPhone=" + teaPhone
				+ ", teaClass=" + teaClass + ", teaYear=" + teaYear + ", users=" + users + "]";
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone == null ? null : teaPhone.trim();
    }

    public Integer getTeaClass() {
        return teaClass;
    }

    public void setTeaClass(Integer teaClass) {
        this.teaClass = teaClass;
    }

    public Integer getTeaYear() {
        return teaYear;
    }

    public void setTeaYear(Integer teaYear) {
        this.teaYear = teaYear;
    }
}