
package org.mule.modules.tidesandcurrents.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.tidesandcurrents.TidesandcurrentsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TidesandcurrentsConnectorProcessAdapter</code> is a wrapper around {@link TidesandcurrentsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-02T11:51:37-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TidesandcurrentsConnectorProcessAdapter
    extends TidesandcurrentsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TidesandcurrentsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TidesandcurrentsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TidesandcurrentsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TidesandcurrentsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TidesandcurrentsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TidesandcurrentsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
