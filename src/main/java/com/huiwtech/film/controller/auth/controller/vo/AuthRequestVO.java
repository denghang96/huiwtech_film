package com.huiwtech.film.controller.auth.controller.vo;

import com.huiwtech.film.controller.common.BaseVO;
import com.huiwtech.film.controller.exception.ParamErrorException;
import lombok.Data;

@Data
public class AuthRequestVO extends BaseVO {

    private String username;
    private String password;

    @Override
    public void checkParam() throws ParamErrorException {
        // TODO 验证过程补充
    }
}
