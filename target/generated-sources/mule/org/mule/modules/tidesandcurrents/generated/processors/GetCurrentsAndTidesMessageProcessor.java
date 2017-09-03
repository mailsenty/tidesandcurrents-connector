
package org.mule.modules.tidesandcurrents.generated.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.internal.metadata.fixes.STUDIO7157;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.tidesandcurrents.TidesandcurrentsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetCurrentsAndTidesMessageProcessor invokes the {@link org.mule.modules.tidesandcurrents.TidesandcurrentsConnector#getCurrentsAndTides(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TidesandcurrentsConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-02T11:51:37-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GetCurrentsAndTidesMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object begin_date;
    protected String _begin_dateType;
    protected Object end_date;
    protected String _end_dateType;
    protected Object station;
    protected String _stationType;
    protected Object product;
    protected String _productType;
    protected Object units;
    protected String _unitsType;
    protected Object time_zone;
    protected String _time_zoneType;
    protected Object application;
    protected String _applicationType;
    protected Object format;
    protected String _formatType;

    public GetCurrentsAndTidesMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets end_date
     * 
     * @param value Value to set
     */
    public void setEnd_date(Object value) {
        this.end_date = value;
    }

    /**
     * Sets product
     * 
     * @param value Value to set
     */
    public void setProduct(Object value) {
        this.product = value;
    }

    /**
     * Sets application
     * 
     * @param value Value to set
     */
    public void setApplication(Object value) {
        this.application = value;
    }

    /**
     * Sets begin_date
     * 
     * @param value Value to set
     */
    public void setBegin_date(Object value) {
        this.begin_date = value;
    }

    /**
     * Sets station
     * 
     * @param value Value to set
     */
    public void setStation(Object value) {
        this.station = value;
    }

    /**
     * Sets format
     * 
     * @param value Value to set
     */
    public void setFormat(Object value) {
        this.format = value;
    }

    /**
     * Sets units
     * 
     * @param value Value to set
     */
    public void setUnits(Object value) {
        this.units = value;
    }

    /**
     * Sets time_zone
     * 
     * @param value Value to set
     */
    public void setTime_zone(Object value) {
        this.time_zone = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedBegin_date = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_begin_dateType").getGenericType(), null, begin_date));
            final String _transformedEnd_date = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_end_dateType").getGenericType(), null, end_date));
            final String _transformedStation = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_stationType").getGenericType(), null, station));
            final String _transformedProduct = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_productType").getGenericType(), null, product));
            final String _transformedUnits = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_unitsType").getGenericType(), null, units));
            final String _transformedTime_zone = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_time_zoneType").getGenericType(), null, time_zone));
            final String _transformedApplication = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_applicationType").getGenericType(), null, application));
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, GetCurrentsAndTidesMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((TidesandcurrentsConnector) object).getCurrentsAndTides(_transformedBegin_date, _transformedEnd_date, _transformedStation, _transformedProduct, _transformedUnits, _transformedTime_zone, _transformedApplication, _transformedFormat);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(String.class);
        DefaultMetaDataKey keyForStudio = new DefaultMetaDataKey("OUTPUT_METADATA", null);
        metaDataPayload.addProperty(STUDIO7157 .getStructureIdentifierMetaDataModelProperty(keyForStudio, false, false));
        return new DefaultResult<MetaData>(new DefaultMetaData(metaDataPayload));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TidesandcurrentsConnector at getCurrentsAndTides retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
