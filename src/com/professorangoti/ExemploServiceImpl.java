package com.professorangoti;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.professorangoti.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }
}