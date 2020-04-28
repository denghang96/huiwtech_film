package com.huiwtech.film.dao.mapper;

import com.huiwtech.film.controller.cinema.vo.CinemaFilmInfoVO;
import com.huiwtech.film.controller.cinema.vo.CinemaFilmVo;
import com.huiwtech.film.controller.cinema.vo.FieldHallInfoVO;
import com.huiwtech.film.dao.entity.FilmFieldT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 放映场次表 Mapper 接口
 * </p>
 *
 * @author jiangzh
 * @since 2020-04-21
 */
public interface FilmFieldTMapper extends BaseMapper<FilmFieldT> {

    List<CinemaFilmVo> describeFieldList(@Param("cinemaId")String cinemaId);

    CinemaFilmInfoVO describeFilmInfoByFieldId(@Param("fieldId")String fieldId);

    FieldHallInfoVO describeHallInfo(@Param("fieldId")String fieldId);


}
