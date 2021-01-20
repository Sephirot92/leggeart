package com.leggeart.legge.dtos;

import com.leggeart.legge.enums.Level;

/**
 * Dto class to handle Court class.
 *
 * @author ACh
 * @version 0.0.1
 */
public class CourtDto {
    private long id;
    private String department;
    private String judge;
    private Level level;

    public CourtDto() {
    }

    public CourtDto(long id, String department, String judge, Level level) {
        this.id = id;
        this.department = department;
        this.judge = judge;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getJudge() {
        return judge;
    }

    public Level getLevel() {
        return level;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
