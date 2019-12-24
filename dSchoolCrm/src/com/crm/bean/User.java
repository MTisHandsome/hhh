package com.crm.bean;

import java.util.List;

public class User {
    private Integer userId;

    private String userName;

    private String userEmal;

    private String userPassword;

    private String userSex;

    private String userDate;

    private Integer userSchedule;

    private Integer teaUserid;

    private Integer carId;
    
    private Integer schoolId;
    
    private Tea tea;
    
    private Car car;
    
    private School school;
    
    public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	private List<Score> scores;

    public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmal=" + userEmal + ", userPassword="
				+ userPassword + ", userSex=" + userSex + ", userDate=" + userDate + ", userSchedule=" + userSchedule
				+ ", teaUserid=" + teaUserid + ", carId=" + carId + ", tea=" + tea + ", car=" + car + "]";
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Tea getTea() {
		return tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEmal() {
        return userEmal;
    }

    public void setUserEmal(String userEmal) {
        this.userEmal = userEmal == null ? null : userEmal.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate == null ? null : userDate.trim();
    }

    public Integer getUserSchedule() {
        return userSchedule;
    }

    public void setUserSchedule(Integer userSchedule) {
        this.userSchedule = userSchedule;
    }

    public Integer getTeaUserid() {
        return teaUserid;
    }

    public void setTeaUserid(Integer teaUserid) {
        this.teaUserid = teaUserid;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}