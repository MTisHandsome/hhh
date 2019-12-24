package com.crm.bean;

public class Score {
    private Integer scoreId;

    private Integer scoreSchedule;

    private String scoreText;

    private Integer userId;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Integer getScoreSchedule() {
        return scoreSchedule;
    }

    public void setScoreSchedule(Integer scoreSchedule) {
        this.scoreSchedule = scoreSchedule;
    }

    public String getScoreText() {
        return scoreText;
    }

    public void setScoreText(String scoreText) {
        this.scoreText = scoreText == null ? null : scoreText.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}