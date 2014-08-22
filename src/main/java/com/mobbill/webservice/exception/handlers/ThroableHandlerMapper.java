package com.mobbill.webservice.exception.handlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by dieppa on 06/08/14.
 */
@Provider
public class ThroableHandlerMapper implements ExceptionMapper<Throwable> {

//    private static final Log LOG = Log.forClass(ThroableHandlerMapper.class);

    @Override
    public Response toResponse(Throwable exception) {

        exception.printStackTrace();
        return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("Internal server error")
                .build();

    }


}