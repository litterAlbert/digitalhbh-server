package com.zjgsu.digitalhbh.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Work {
    private Integer id;
    private String workname;
    private String author;
    private String era;
    private String work;
    private Integer classify;
    // @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer year;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Work)) {
            return false;
        }

        Work work1 = (Work) o;

        if (getId() != null ? !getId().equals(work1.getId()) : work1.getId() != null) {
            return false;
        }
        if (getWorkname() != null ? !getWorkname().equals(work1.getWorkname()) : work1.getWorkname() != null) {
            return false;
        }
        if (getAuthor() != null ? !getAuthor().equals(work1.getAuthor()) : work1.getAuthor() != null) {
            return false;
        }
        if (getEra() != null ? !getEra().equals(work1.getEra()) : work1.getEra() != null) {
            return false;
        }
        if (getWork() != null ? !getWork().equals(work1.getWork()) : work1.getWork() != null) {
            return false;
        }
        if (getClassify() != null ? !getClassify().equals(work1.getClassify()) : work1.getClassify() != null) {
            return false;
        }
        if (getYear() != null ? !getYear().equals(work1.getYear()) : work1.getYear() != null) {
            return false;
        }
        return getTime() != null ? getTime().equals(work1.getTime()) : work1.getTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getWorkname() != null ? getWorkname().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getEra() != null ? getEra().hashCode() : 0);
        result = 31 * result + (getWork() != null ? getWork().hashCode() : 0);
        result = 31 * result + (getClassify() != null ? getClassify().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        result = 31 * result + (getTime() != null ? getTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", workname='" + workname + '\'' +
                ", author='" + author + '\'' +
                ", era='" + era + '\'' +
                ", work='" + work + '\'' +
                ", classify=" + classify +
                ", year=" + year +
                ", time='" + time + '\'' +
                '}';
    }
}
