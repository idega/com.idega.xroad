package com.idega.xroad.webservices.client;

import org.apache.axis2.modules.Module;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.description.AxisDescription;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.AxisFault;
import org.apache.neethi.Assertion;
import org.apache.neethi.Policy;


public class SampleModule implements Module {
    public void init(ConfigurationContext configurationContext, AxisModule axisModule) throws AxisFault {
        System.out.println("Initializing the module");
    }

    public void engageNotify(AxisDescription axisDescription) throws AxisFault {
        if (axisDescription instanceof AxisService){
            AxisService axisService = (AxisService) axisDescription;
            System.out.println("Engaged to the service ==> " + axisService.getName());
        } else if (axisDescription instanceof AxisOperation){
            AxisOperation axisOperation = (AxisOperation) axisDescription;
            System.out.println("Engaged to the operation ==> " + axisOperation.getName().getLocalPart());
        }

    }

    public boolean canSupportAssertion(Assertion assertion) {
        return false;
    }

    public void applyPolicy(Policy policy, AxisDescription axisDescription) throws AxisFault {

    }

    public void shutdown(ConfigurationContext configurationContext) throws AxisFault {

    }
}
