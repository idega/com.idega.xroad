/**
 * MunicipalityserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.ee.municipality.producer;

public class MunicipalityserviceLocator extends org.apache.axis.client.Service implements net.x_rd.ee.municipality.producer.Municipalityservice {

    public MunicipalityserviceLocator() {
    }


    public MunicipalityserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MunicipalityserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for municipalityport
    private java.lang.String municipalityport_address = "http://secureproxy/cgi-bin/consumer_proxy";

    public java.lang.String getmunicipalityportAddress() {
        return municipalityport_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String municipalityportWSDDServiceName = "municipalityport";

    public java.lang.String getmunicipalityportWSDDServiceName() {
        return municipalityportWSDDServiceName;
    }

    public void setmunicipalityportWSDDServiceName(java.lang.String name) {
        municipalityportWSDDServiceName = name;
    }

    public net.x_rd.ee.municipality.producer.Municipalityporttype getmunicipalityport() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(municipalityport_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmunicipalityport(endpoint);
    }

    public net.x_rd.ee.municipality.producer.Municipalityporttype getmunicipalityport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.x_rd.ee.municipality.producer.MunicipalitybindingStub _stub = new net.x_rd.ee.municipality.producer.MunicipalitybindingStub(portAddress, this);
            _stub.setPortName(getmunicipalityportWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmunicipalityportEndpointAddress(java.lang.String address) {
        municipalityport_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.x_rd.ee.municipality.producer.Municipalityporttype.class.isAssignableFrom(serviceEndpointInterface)) {
                net.x_rd.ee.municipality.producer.MunicipalitybindingStub _stub = new net.x_rd.ee.municipality.producer.MunicipalitybindingStub(new java.net.URL(municipalityport_address), this);
                _stub.setPortName(getmunicipalityportWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("municipalityport".equals(inputPortName)) {
            return getmunicipalityport();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "municipalityservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "municipalityport"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("municipalityport".equals(portName)) {
            setmunicipalityportEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
