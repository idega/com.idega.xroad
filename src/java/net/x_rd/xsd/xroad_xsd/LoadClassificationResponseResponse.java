/**
 * LoadClassificationResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.xsd.xroad_xsd;

public class LoadClassificationResponseResponse  implements java.io.Serializable {
    private java.lang.String[] classificationNames;

    private net.x_rd.xsd.xroad_xsd.LoadClassificationResponseResponseClassifications classifications;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public LoadClassificationResponseResponse() {
    }

    public LoadClassificationResponseResponse(
           java.lang.String[] classificationNames,
           net.x_rd.xsd.xroad_xsd.LoadClassificationResponseResponseClassifications classifications,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.classificationNames = classificationNames;
           this.classifications = classifications;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the classificationNames value for this LoadClassificationResponseResponse.
     * 
     * @return classificationNames
     */
    public java.lang.String[] getClassificationNames() {
        return classificationNames;
    }


    /**
     * Sets the classificationNames value for this LoadClassificationResponseResponse.
     * 
     * @param classificationNames
     */
    public void setClassificationNames(java.lang.String[] classificationNames) {
        this.classificationNames = classificationNames;
    }


    /**
     * Gets the classifications value for this LoadClassificationResponseResponse.
     * 
     * @return classifications
     */
    public net.x_rd.xsd.xroad_xsd.LoadClassificationResponseResponseClassifications getClassifications() {
        return classifications;
    }


    /**
     * Sets the classifications value for this LoadClassificationResponseResponse.
     * 
     * @param classifications
     */
    public void setClassifications(net.x_rd.xsd.xroad_xsd.LoadClassificationResponseResponseClassifications classifications) {
        this.classifications = classifications;
    }


    /**
     * Gets the faultCode value for this LoadClassificationResponseResponse.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this LoadClassificationResponseResponse.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this LoadClassificationResponseResponse.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this LoadClassificationResponseResponse.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificationResponseResponse)) return false;
        LoadClassificationResponseResponse other = (LoadClassificationResponseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classificationNames==null && other.getClassificationNames()==null) || 
             (this.classificationNames!=null &&
              java.util.Arrays.equals(this.classificationNames, other.getClassificationNames()))) &&
            ((this.classifications==null && other.getClassifications()==null) || 
             (this.classifications!=null &&
              this.classifications.equals(other.getClassifications()))) &&
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
        if (getClassificationNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassificationNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassificationNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassifications() != null) {
            _hashCode += getClassifications().hashCode();
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
        new org.apache.axis.description.TypeDesc(LoadClassificationResponseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>loadClassificationResponse>response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifications");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>>loadClassificationResponse>response>classifications"));
        elemField.setNillable(true);
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
