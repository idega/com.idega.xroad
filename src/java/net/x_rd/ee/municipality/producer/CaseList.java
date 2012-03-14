/**
 * CaseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.ee.municipality.producer;

public class CaseList  implements java.io.Serializable {
    private java.lang.Object request;

    private net.x_rd.ee.municipality.producer.CaseListResponseCaseListEntry[] response;

    public CaseList() {
    }

    public CaseList(
           java.lang.Object request,
           net.x_rd.ee.municipality.producer.CaseListResponseCaseListEntry[] response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this CaseList.
     * 
     * @return request
     */
    public java.lang.Object getRequest() {
        return request;
    }


    /**
     * Sets the request value for this CaseList.
     * 
     * @param request
     */
    public void setRequest(java.lang.Object request) {
        this.request = request;
    }


    /**
     * Gets the response value for this CaseList.
     * 
     * @return response
     */
    public net.x_rd.ee.municipality.producer.CaseListResponseCaseListEntry[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CaseList.
     * 
     * @param response
     */
    public void setResponse(net.x_rd.ee.municipality.producer.CaseListResponseCaseListEntry[] response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseList)) return false;
        CaseList other = (CaseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", ">caseList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", ">>>caseList>response>caseListEntry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caseListEntry"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
