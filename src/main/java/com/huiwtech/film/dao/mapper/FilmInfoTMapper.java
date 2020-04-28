package com.huiwtech.film.dao.mapper;

import com.huiwtech.film.controller.film.vo.response.filmdetail.FilmDetailResultVO;
import com.huiwtech.film.dao.entity.FilmInfoT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 影片主表 Mapper 接口
 * </p>
 *
 * @author jiangzh
 * @since 2020-04-28
 */
public interface FilmInfoTMapper extends BaseMapper<FilmInfoT> {
    /*
        根据FilmId获取电影的详情
     */
    FilmDetailResultVO describeFilmDetailByFilmId(@Param("filmId") String filmId);

    /*
    根据电影名称获取电影的详情 - 模糊匹配
 */
    FilmDetailResultVO describeFilmDetailByFilmName(@Param("filmName") String filmName);

}
