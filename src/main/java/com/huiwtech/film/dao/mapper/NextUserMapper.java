package com.huiwtech.film.dao.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huiwtech.film.dao.entity.NextUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiangzh
 * @since 2019-03-12
 */
public interface NextUserMapper extends BaseMapper<NextUser> {

    List<NextUser> getUsers(IPage<NextUser> iPage);

}
