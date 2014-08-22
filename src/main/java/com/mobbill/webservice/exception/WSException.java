package com.mobbill.webservice.exception;

import javax.ws.rs.core.Response;

/**
 * Created by dieppa on 06/08/14.
 */
public class WSException extends Exception {

    private Response.Status httpStatus;
    private Object content;

    public WSException(){
        this.httpStatus = Response.Status.INTERNAL_SERVER_ERROR;
        this.content    = "{\"code\":\"00001\" , \"message\": \"Internal server error\"}";
    }

    public WSException(Response.Status status){
        this.httpStatus = status;
    }

    public WSException(Response.Status status, Object response){
        this.httpStatus = status;
        this.content    = response;
    }

    public Response.Status getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Response.Status httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
