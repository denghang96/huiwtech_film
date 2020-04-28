package com.huiwtech.film.controller.cinema.vo.cinemaenum;

public enum ConditionType {
    BRAND("brand"),AREA("area"),HALLTYPE("hallType");

    private final String conditionType;

    ConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public final String getConditionType() {
        return conditionType;
    }
}
