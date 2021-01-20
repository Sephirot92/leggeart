package com.leggeart.legge.entities;

import com.leggeart.legge.enums.Level;

import javax.persistence.*;

/**
 * Class responsible for handling Court object.
 *
 * @author ACh
 * @version 0.0.1
 */
@Entity(name = "COURT")
public class Court {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    @Column(name = "JUDGE", nullable = false)
    private String judge;

    @Enumerated(EnumType.STRING)
    private Level level;

    public Court() {
    }

    public Court(long id, String department, String judge, Level level) {
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
