package com.firat.processor;

/**
 * enum class, returns
 * Created by yfpayalan on 25.01.2018.oncrea
 */
public enum ProcessorName
{
    MPTS(MptsProcessor.class),
    XPAY(XPayProcessor.class);

    private Class<? extends IProcessor> processorType;

    public Class<? extends IProcessor> getProcessorType()
    {
        return processorType;
    }

    private ProcessorName(Class<? extends IProcessor> processorType)
    {
        this.processorType = processorType;
    }

}
