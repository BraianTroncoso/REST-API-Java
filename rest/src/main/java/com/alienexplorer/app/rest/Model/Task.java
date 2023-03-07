package com.alienexplorer.app.rest.Model;

import javax.persistence.*;

@Entity
@Table(schema = "TasksCrud")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String tittle;

    @Column
    private String subtittle;

    @Column
    private String description;


    public String getSubtittle() {
        return subtittle;
    }

    public void setSubtittle(String subtittle) {
        this.subtittle = subtittle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
