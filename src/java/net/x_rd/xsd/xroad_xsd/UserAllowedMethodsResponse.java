/**
 * UserAllowedMethodsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.xsd.xroad_xsd;

public class UserAllowedMethodsResponse  implements java.io.Serializable {
    private net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseRequest request;

    private net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponse response;

    public UserAllowedMethodsResponse() {
    }

    public UserAllowedMethodsResponse(
           net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseRequest request,
           net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponse response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this UserAllowedMethodsResponse.
     * 
     * @return request
     */
    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseRequest getRequest() {
        return request;
    }


    /**
     * Sets the request value for this UserAllowedMethodsResponse.
     * 
     * @param request
     */
    public void setRequest(net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseRequest request) {
        this.request = request;
    }


    /**
     * Gets the response value for this UserAllowedMethodsResponse.
     * 
     * @return response
     */
    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this UserAllowedMethodsResponse.
     * 
     * @param response
     */
    public void setResponse(net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponse response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponse)) return false;
        UserAllowedMethodsResponse other = (UserAllowedMethodsResponse) obj;
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
              this.response.equals(other.getResponse())));
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
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAllowedMethodsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">userAllowedMethodsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>userAllowedMethodsResponse>request"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>userAllowedMethodsResponse>response"));
        elemField.setNillable(false);
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
