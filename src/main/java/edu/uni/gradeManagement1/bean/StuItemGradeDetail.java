package edu.uni.gradeManagement1.bean;

import java.util.Date;

public class StuItemGradeDetail {
    private Long id;

    private Long universityId;

    private Long stuItemGradeId;

    private Long courseItemDetailId;

    @Override
    public String toString() {
        return "StuItemGradeDetail{" +
                "id=" + id +
                ", universityId=" + universityId +
                ", stuItemGradeId=" + stuItemGradeId +
                ", courseItemDetailId=" + courseItemDetailId +
                ", attachment='" + attachment + '\'' +
                ", score=" + score +
                ", note='" + note + '\'' +
                ", datetime=" + datetime +
                ", byWho=" + byWho +
                ", delete=" + delete +
                '}';
    }

    private String attachment;

    private Double score;

    private String note;

    private Date datetime;

    private Long byWho;

    private Byte delete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public Long getStuItemGradeId() {
        return stuItemGradeId;
    }

    public void setStuItemGradeId(Long stuItemGradeId) {
        this.stuItemGradeId = stuItemGradeId;
    }

    public Long getCourseItemDetailId() {
        return courseItemDetailId;
    }

    public void setCourseItemDetailId(Long courseItemDetailId) {
        this.courseItemDetailId = courseItemDetailId;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Long getByWho() {
        return byWho;
    }

    public void setByWho(Long byWho) {
        this.byWho = byWho;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}