package com.mobbill.webservice.exception.handlers;


import com.mobbill.webservice.exception.WSException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by dieppa on 06/08/14.
 */
@Provider
public class WSExceptionHandlerMapper implements ExceptionMapper<WSException> {

//    private static final Log LOG = Log.forClass(WSExceptionHandlerMapper.class);

    @Override
    public Response toResponse(WSException wse) {

        wse.printStackTrace();
        return Response
                .status(wse.getHttpStatus().getStatusCode())
                .entity(wse.getContent())
                .build();

    }


}