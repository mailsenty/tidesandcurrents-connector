
package org.mule.modules.tidesandcurrents.generated.processors;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.debug.DebugInfoProvider;
import org.mule.api.debug.FieldDebugInfo;
import org.mule.api.debug.FieldDebugInfoFactory;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.util.ClassUtils;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-02T11:51:37-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GetCurrentsAndTidesMessageProcessorDebuggable
    extends GetCurrentsAndTidesMessageProcessor
    implements DebugInfoProvider
{


    public GetCurrentsAndTidesMessageProcessorDebuggable(String operationName) {
        super(operationName);
    }

    private boolean isConsumable(Object evaluate) {
        return (ClassUtils.isConsumable(evaluate.getClass())||Iterator.class.isAssignableFrom(evaluate.getClass()));
    }

    private Object getEvaluatedValue(MuleContext muleContext, MuleEvent muleEvent, String fieldName, Object field)
        throws NoSuchFieldException, TransformerException, TransformerMessagingException
    {
        Object evaluate = null;
        if (!(field == null)) {
            evaluate = this.evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), field);
            Type genericType = this.getClass().getSuperclass().getDeclaredField(fieldName).getGenericType();
            if (!isConsumable(evaluate)) {
                evaluate = this.evaluateAndTransform(muleContext, muleEvent, genericType, null, field);
            }
        }
        return evaluate;
    }

    private FieldDebugInfo createDevKitFieldDebugInfo(String name, String friendlyName, Class type, Object value, MuleEvent muleEvent) {
        try {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, getEvaluatedValue(muleContext, muleEvent, ("_"+name+"Type"), value));
        } catch (NoSuchFieldException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        } catch (TransformerMessagingException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        } catch (TransformerException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        }
    }

    @Override
    public List<FieldDebugInfo<?>> getDebugInfo(MuleEvent muleEvent) {
        List<FieldDebugInfo<?>> fieldDebugInfoList = new ArrayList<FieldDebugInfo<?>>();
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("end_date", "End_date", (java.lang.String.class), end_date, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("product", "Product", (java.lang.String.class), product, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("application", "Application", (java.lang.String.class), application, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("begin_date", "Begin_date", (java.lang.String.class), begin_date, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("station", "Station", (java.lang.String.class), station, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("format", "Format", (java.lang.String.class), format, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("units", "Units", (java.lang.String.class), units, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("time_zone", "Time_zone", (java.lang.String.class), time_zone, muleEvent));
        return fieldDebugInfoList;
    }

}
