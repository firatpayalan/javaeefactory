package com.firat.client;


import com.firat.processor.ProcessorFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

/**
 * Created by yfpayalan on 26.01.2018.javaeefactory
 */
@Stateless
public class Client implements IClient
{
    @Inject
    ProcessorFactory processorFactory;
    public Response sayHello()
    {
        String cardNo = "5157557012344321";
        String result = processorFactory.setCardNo(cardNo).getProcessor().getCardInfo();
        return Response.ok().entity(result).build();
    }
}
