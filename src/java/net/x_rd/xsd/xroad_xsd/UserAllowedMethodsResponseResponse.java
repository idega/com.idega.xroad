/**
 * UserAllowedMethodsResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.xsd.xroad_xsd;

public class UserAllowedMethodsResponseResponse  implements java.io.Serializable {
    private net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson[] person;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public UserAllowedMethodsResponseResponse() {
    }

    public UserAllowedMethodsResponseResponse(
           net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson[] person,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.person = person;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the person value for this UserAllowedMethodsResponseResponse.
     * 
     * @return person
     */
    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson[] getPerson() {
        return person;
    }


    /**
     * Sets the person value for this UserAllowedMethodsResponseResponse.
     * 
     * @param person
     */
    public void setPerson(net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson[] person) {
        this.person = person;
    }

    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson getPerson(int i) {
        return this.person[i];
    }

    public void setPerson(int i, net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePerson _value) {
        this.person[i] = _value;
    }


    /**
     * Gets the faultCode value for this UserAllowedMethodsResponseResponse.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this UserAllowedMethodsResponseResponse.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this UserAllowedMethodsResponseResponse.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this UserAllowedMethodsResponseResponse.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponseResponse)) return false;
        UserAllowedMethodsResponseResponse other = (UserAllowedMethodsResponseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              java.util.Arrays.equals(this.person, other.getPerson()))) &&
            ((this.faultCode==null && other.getFaultCode()==null) || 
             (this.faultCode!=null &&
              this.faultCode.equals(other.getFaultCode()))) &&
            ((this.faultString==null && other.getFaultString()==null) || 
             (this.faultString!=null &&
              this.faultString.equals(other.getFaultString())));
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
        if (getPerson() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerson());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerson(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultCode() != null) {
            _hashCode += getFaultCode().hashCode();
        }
        if (getFaultString() != null) {
            _hashCode += getFaultString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAllowedMethodsResponseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>userAllowedMethodsResponse>response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>>userAllowedMethodsResponse>response>person"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
