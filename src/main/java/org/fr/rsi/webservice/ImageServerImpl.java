
package org.fr.rsi;

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
@WebService(name = "ImageServerImpl", targetNamespace = "http://rsi.fr.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImageServerImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImage", targetNamespace = "http://rsi.fr.org/", className = "org.fr.rsi.DownloadImage")
    @ResponseWrapper(localName = "downloadImageResponse", targetNamespace = "http://rsi.fr.org/", className = "org.fr.rsi.DownloadImageResponse")
    @Action(input = "http://rsi.fr.org/ImageServerImpl/downloadImageRequest", output = "http://rsi.fr.org/ImageServerImpl/downloadImageResponse")
    public byte[] downloadImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://rsi.fr.org/", className = "org.fr.rsi.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://rsi.fr.org/", className = "org.fr.rsi.EchoResponse")
    @Action(input = "http://rsi.fr.org/ImageServerImpl/echoRequest", output = "http://rsi.fr.org/ImageServerImpl/echoResponse")
    public String echo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
