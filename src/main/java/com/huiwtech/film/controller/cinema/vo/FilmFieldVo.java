package com.huiwtech.film.controller.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmFieldVo implements Serializable {
    private String fieldId;
    private String beginTime;
    private String language;
    private String hallName;
    private String price;
}
