package com.mobbill.webservice;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

@Path("/notification")
@Produces(MediaType.APPLICATION_JSON)
public class ClientRest {

    @GET
    public Object getRestaurantById(@Context HttpServletRequest req){
        out.println("\n\n*****************************************************");
        out.println(req.getRequestURL()+"?"+req.getQueryString());
        Map<String, String[]> parameters = req.getParameterMap();
        Map<String, Object> result = new HashMap<>();
        int count = 0;
        for(String key:parameters.keySet()){
            out.println("\n"+(++count)+") "+key);
            String[] values = parameters.get(key);
            result.put(key, values);
            if(values!=null){
                for(String value : values){
                    out.println("\t- "+value);
                }
            }else{
                out.println("\t NO VALUES!!!");
            }


        }
        out.println("*****************************************************\n\n");
        result.put("HTTP Call: ",req.getRequestURL()+"?"+req.getQueryString());
        return result;
    }



}