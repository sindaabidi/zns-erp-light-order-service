package com.zns.erplight.openfeign.config;
import com.zns.erplight.openfeign.config.errors.BadRequestException;
import com.zns.erplight.openfeign.config.errors.NotFoundException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new BadRequestException();
            case 404:
                return new NotFoundException();
            default:
                return new Exception("Big Problem error, it's general.");
        }
    }
}