/**
 * UserAllowedMethodsResponseResponsePersonOrgQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.xsd.xroad_xsd;

public class UserAllowedMethodsResponseResponsePersonOrgQuery  implements java.io.Serializable {
    private java.lang.String orgCode;

    private java.lang.String orgName;

    private net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery[] query;

    public UserAllowedMethodsResponseResponsePersonOrgQuery() {
    }

    public UserAllowedMethodsResponseResponsePersonOrgQuery(
           java.lang.String orgCode,
           java.lang.String orgName,
           net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery[] query) {
           this.orgCode = orgCode;
           this.orgName = orgName;
           this.query = query;
    }


    /**
     * Gets the orgCode value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @return orgCode
     */
    public java.lang.String getOrgCode() {
        return orgCode;
    }


    /**
     * Sets the orgCode value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @param orgCode
     */
    public void setOrgCode(java.lang.String orgCode) {
        this.orgCode = orgCode;
    }


    /**
     * Gets the orgName value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the query value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @return query
     */
    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this UserAllowedMethodsResponseResponsePersonOrgQuery.
     * 
     * @param query
     */
    public void setQuery(net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery[] query) {
        this.query = query;
    }

    public net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery getQuery(int i) {
        return this.query[i];
    }

    public void setQuery(int i, net.x_rd.xsd.xroad_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery _value) {
        this.query[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponseResponsePersonOrgQuery)) return false;
        UserAllowedMethodsResponseResponsePersonOrgQuery other = (UserAllowedMethodsResponseResponsePersonOrgQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgCode==null && other.getOrgCode()==null) || 
             (this.orgCode!=null &&
              this.orgCode.equals(other.getOrgCode()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              java.util.Arrays.equals(this.query, other.getQuery())));
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
        if (getOrgCode() != null) {
            _hashCode += getOrgCode().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuery(), i);
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
        new org.apache.axis.description.TypeDesc(UserAllowedMethodsResponseResponsePersonOrgQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>>>userAllowedMethodsResponse>response>person>orgQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-rd.net/xsd/xroad.xsd", ">>>>>userAllowedMethodsResponse>response>person>orgQuery>query"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
