package com.firat.processor;

import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * contains mpts services.
 * Created by yfpayalan on 25.01.2018
 */
@Stateless
@ProcessorType(ProcessorName.MPTS)
public class MptsProcessor implements IProcessor
{
    @Inject
    Logger logger;

    public String getCardInfo()
    {
        logger.info("Mpts is executed !!!");
        return null;
    }
}
