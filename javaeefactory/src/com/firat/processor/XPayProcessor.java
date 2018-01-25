package com.firat.processor;


import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * supplies xpay services.
 * Created by yfpayalan on 25.01.2018
 */
@Stateless
@ProcessorType(ProcessorName.XPAY)
public class XPayProcessor implements IProcessor
{
    @Inject
    Logger logger;

    public String getCardInfo()
    {
        logger.info("XPay is executed !!!");
        return null;
    }
}
