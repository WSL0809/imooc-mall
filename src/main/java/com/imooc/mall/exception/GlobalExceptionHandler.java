package com.imooc.mall.exception;

import com.imooc.mall.common.ApiRestResponse;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {
//    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private final org.slf4j.Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e) {
        log.error("Default Exception:",e);
        return ApiRestResponse.error(ImoocMallExceptionEnum.STSTEM_ERROR);
    }

    @ExceptionHandler(ImoocMallException.class)
    @ResponseBody
    public Object handleImoocMallException(ImoocMallException e) {
        log.error("ImoocMall Exception:",e);
        return ApiRestResponse.error(ImoocMallExceptionEnum.STSTEM_ERROR);
//        return ApiRestResponse.error(e.getCode(), e.getMessage());
    }
}
