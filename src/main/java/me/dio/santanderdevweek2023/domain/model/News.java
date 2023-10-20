package me.dio.santanderdevweek2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_news")
public class News extends Baseltem {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
