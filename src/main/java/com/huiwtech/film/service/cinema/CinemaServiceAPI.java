package com.huiwtech.film.service.cinema;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huiwtech.film.controller.cinema.vo.*;
import com.huiwtech.film.controller.cinema.vo.cinemaenum.ConditionType;
import com.huiwtech.film.controller.cinema.vo.condition.AreaResVO;
import com.huiwtech.film.controller.cinema.vo.condition.BrandResVO;
import com.huiwtech.film.controller.cinema.vo.condition.HallTypeResVO;
import com.huiwtech.film.controller.cinema.vo.request.DescribeCinemaRequestVO;

import java.util.List;

public interface CinemaServiceAPI {

    /*
        根据条件查询影院列表
     */
    Page<CinemaVO> describeCinemaInfo(DescribeCinemaRequestVO describeCinemaRequestVO);


    /*
        获取查询条件
     */
    boolean checkCondition(int conditionId, ConditionType conditionType);
    List<BrandResVO> describeBrandConditions(int brandId);
    List<AreaResVO> describeAreaConditions(int areaId);
    List<HallTypeResVO> describeHallTypeConditions(int hallTypeId);

    /*
        根据影院编号获取影院信息
     */
    CinemaDetailVO describeCinemaDetails(String cinemaId);

    /*
        根据影院编号，获取场次信息
     */
    List<CinemaFilmVo> describeFieldsAndFilmInfo(String cinemaId);

    /*
        根据场次编号，获取电影信息
     */
    CinemaFilmVo describeFilmInfoByFieldId(String fieldId);

    /*
        根据场次编号，获取放映厅信息
     */
    FieldHallInfoVO describeHallInfoByFieldId(String fieldId);

}
