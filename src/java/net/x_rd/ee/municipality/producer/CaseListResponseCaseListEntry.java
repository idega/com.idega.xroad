/**
 * CaseListResponseCaseListEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.x_rd.ee.municipality.producer;

public class CaseListResponseCaseListEntry  implements java.io.Serializable {
    private java.lang.String caseId;

    private java.lang.String caseName;

    private java.lang.String caseStatus;

    private java.lang.String statusChangeTime;

    private java.lang.String statusChangeMessage;

    private java.lang.String activeOfficialName;

    public CaseListResponseCaseListEntry() {
    }

    public CaseListResponseCaseListEntry(
           java.lang.String caseId,
           java.lang.String caseName,
           java.lang.String caseStatus,
           java.lang.String statusChangeTime,
           java.lang.String statusChangeMessage,
           java.lang.String activeOfficialName) {
           this.caseId = caseId;
           this.caseName = caseName;
           this.caseStatus = caseStatus;
           this.statusChangeTime = statusChangeTime;
           this.statusChangeMessage = statusChangeMessage;
           this.activeOfficialName = activeOfficialName;
    }


    /**
     * Gets the caseId value for this CaseListResponseCaseListEntry.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this CaseListResponseCaseListEntry.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the caseName value for this CaseListResponseCaseListEntry.
     * 
     * @return caseName
     */
    public java.lang.String getCaseName() {
        return caseName;
    }


    /**
     * Sets the caseName value for this CaseListResponseCaseListEntry.
     * 
     * @param caseName
     */
    public void setCaseName(java.lang.String caseName) {
        this.caseName = caseName;
    }


    /**
     * Gets the caseStatus value for this CaseListResponseCaseListEntry.
     * 
     * @return caseStatus
     */
    public java.lang.String getCaseStatus() {
        return caseStatus;
    }


    /**
     * Sets the caseStatus value for this CaseListResponseCaseListEntry.
     * 
     * @param caseStatus
     */
    public void setCaseStatus(java.lang.String caseStatus) {
        this.caseStatus = caseStatus;
    }


    /**
     * Gets the statusChangeTime value for this CaseListResponseCaseListEntry.
     * 
     * @return statusChangeTime
     */
    public java.lang.String getStatusChangeTime() {
        return statusChangeTime;
    }


    /**
     * Sets the statusChangeTime value for this CaseListResponseCaseListEntry.
     * 
     * @param statusChangeTime
     */
    public void setStatusChangeTime(java.lang.String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }


    /**
     * Gets the statusChangeMessage value for this CaseListResponseCaseListEntry.
     * 
     * @return statusChangeMessage
     */
    public java.lang.String getStatusChangeMessage() {
        return statusChangeMessage;
    }


    /**
     * Sets the statusChangeMessage value for this CaseListResponseCaseListEntry.
     * 
     * @param statusChangeMessage
     */
    public void setStatusChangeMessage(java.lang.String statusChangeMessage) {
        this.statusChangeMessage = statusChangeMessage;
    }


    /**
     * Gets the activeOfficialName value for this CaseListResponseCaseListEntry.
     * 
     * @return activeOfficialName
     */
    public java.lang.String getActiveOfficialName() {
        return activeOfficialName;
    }


    /**
     * Sets the activeOfficialName value for this CaseListResponseCaseListEntry.
     * 
     * @param activeOfficialName
     */
    public void setActiveOfficialName(java.lang.String activeOfficialName) {
        this.activeOfficialName = activeOfficialName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseListResponseCaseListEntry)) return false;
        CaseListResponseCaseListEntry other = (CaseListResponseCaseListEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.caseName==null && other.getCaseName()==null) || 
             (this.caseName!=null &&
              this.caseName.equals(other.getCaseName()))) &&
            ((this.caseStatus==null && other.getCaseStatus()==null) || 
             (this.caseStatus!=null &&
              this.caseStatus.equals(other.getCaseStatus()))) &&
            ((this.statusChangeTime==null && other.getStatusChangeTime()==null) || 
             (this.statusChangeTime!=null &&
              this.statusChangeTime.equals(other.getStatusChangeTime()))) &&
            ((this.statusChangeMessage==null && other.getStatusChangeMessage()==null) || 
             (this.statusChangeMessage!=null &&
              this.statusChangeMessage.equals(other.getStatusChangeMessage()))) &&
            ((this.activeOfficialName==null && other.getActiveOfficialName()==null) || 
             (this.activeOfficialName!=null &&
              this.activeOfficialName.equals(other.getActiveOfficialName())));
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
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getCaseName() != null) {
            _hashCode += getCaseName().hashCode();
        }
        if (getCaseStatus() != null) {
            _hashCode += getCaseStatus().hashCode();
        }
        if (getStatusChangeTime() != null) {
            _hashCode += getStatusChangeTime().hashCode();
        }
        if (getStatusChangeMessage() != null) {
            _hashCode += getStatusChangeMessage().hashCode();
        }
        if (getActiveOfficialName() != null) {
            _hashCode += getActiveOfficialName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseListResponseCaseListEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", ">>>caseList>response>caseListEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusChangeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeOfficialName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeOfficialName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
