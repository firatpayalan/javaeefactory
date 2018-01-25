package com.firat.processor;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by yfpayalan on 25.01.2018
 */
@Singleton
@Lock(LockType.READ)
public class ProcessorFactory
{
    private String cardNo;

    @Inject
    @ProcessorType(ProcessorName.MPTS)
    private Instance<IProcessor> mptsProcessor;

    @Inject
    @ProcessorType(ProcessorName.XPAY)
    private Instance<IProcessor> xpayProcessor;


    public com.firat.processor.ProcessorFactory setCardNo(String cardNo)
    {
        this.cardNo=cardNo;
        return this;
    }

    public IProcessor getProcessor()
    {
        String bin = this.cardNo.substring(0, 6);
        if("515755".equalsIgnoreCase(bin))
        {
            return mptsProcessor.select().get();
        }
        else if("979266".equalsIgnoreCase(bin))
        {
            return xpayProcessor.select().get();
        }
        return null;
    }

    protected String getCardNo()
    {
        return cardNo;
    }
}
