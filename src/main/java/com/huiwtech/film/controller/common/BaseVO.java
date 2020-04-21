package com.huiwtech.film.controller.common;

import com.huiwtech.film.controller.exception.ParamErrorException;

public abstract class BaseVO {


    public abstract void checkParam() throws ParamErrorException;

}
