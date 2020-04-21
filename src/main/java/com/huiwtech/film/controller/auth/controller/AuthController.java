package com.huiwtech.film.controller.auth.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.huiwtech.film.controller.auth.controller.vo.AuthRequestVO;
import com.huiwtech.film.controller.auth.controller.vo.AuthResponseVO;
import com.huiwtech.film.controller.auth.util.JwtTokenUtil;
import com.huiwtech.film.controller.common.BaseResponseVO;
import com.huiwtech.film.controller.exception.ParamErrorException;
import com.huiwtech.film.service.common.exception.CommonServiceExcetion;
import com.huiwtech.film.service.user.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserServiceAPI userServiceAPI;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(value = "auth", method = RequestMethod.POST)
    public BaseResponseVO auth(@RequestBody AuthRequestVO authRequestVO) throws ParamErrorException, CommonServiceExcetion {

        authRequestVO.checkParam();

        boolean isValid = userServiceAPI.userAuth(authRequestVO.getUsername()
                , authRequestVO.getPassword());

        if(isValid){
            String randomKey = jwtTokenUtil.getRandomKey();
            String token = jwtTokenUtil.generateToken(authRequestVO.getUsername(),randomKey);

            AuthResponseVO authResponseVO = AuthResponseVO.builder()
                    .randomKey(randomKey)
                    .token(token).build();

            return BaseResponseVO.success(authResponseVO);
        }else{
            return BaseResponseVO.serviceFailed(1,"用户名或密码不正确！！");
        }

    }

}
