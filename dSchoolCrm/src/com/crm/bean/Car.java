package com.crm.bean;

import java.util.List;

public class Car {
    private Integer carId;

    private String carCard;

    private String carShape;

    private Integer repairId;

    private Integer schoolId;
    
    private School school;
    
    private List<User> user;

    public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarCard() {
        return carCard;
    }

    public void setCarCard(String carCard) {
        this.carCard = carCard == null ? null : carCard.trim();
    }

    public String getCarShape() {
        return carShape;
    }

    public void setCarShape(String carShape) {
        this.carShape = carShape == null ? null : carShape.trim();
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
}