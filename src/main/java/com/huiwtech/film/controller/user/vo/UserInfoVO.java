package com.huiwtech.film.controller.user.vo;

import com.huiwtech.film.controller.common.BaseVO;
import com.huiwtech.film.controller.exception.ParamErrorException;
import lombok.Data;

@Data
public class UserInfoVO extends BaseVO {

    private Integer id;
    private Integer uuid;
    private String username;
    private String nickname;
    private String email;
    private String phone;
    private Integer sex;
    private String birthday;
    private String lifeState;
    private String biography;
    private String address;
    private String headAddress;
    private Long beginTime;
    private Long updateTime;

    public Integer getUuid(){
        return this.getId();
    }


    @Override
    public void checkParam() throws ParamErrorException {
        // 自己加入验证逻辑
    }
}
