
package com.professorangoti.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExemploService", targetNamespace = "http://professorangoti.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExemploService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcula", targetNamespace = "http://professorangoti.com/", className = "com.professorangoti.cliente.Calcula")
    @ResponseWrapper(localName = "calculaResponse", targetNamespace = "http://professorangoti.com/", className = "com.professorangoti.cliente.CalculaResponse")
    @Action(input = "http://professorangoti.com/ExemploService/calculaRequest", output = "http://professorangoti.com/ExemploService/calculaResponse")
    public int calcula(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
