package com.huiwtech.film.controller.auth.controller.vo;

import com.huiwtech.film.controller.common.BaseVO;
import com.huiwtech.film.controller.exception.ParamErrorException;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponseVO extends BaseVO {

    private String randomKey;
    private String token;

    @Override
    public void checkParam() throws ParamErrorException {

    }
}
