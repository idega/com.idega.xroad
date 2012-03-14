package net.x_rd.ee.municipality.producer;

public class MunicipalityporttypeProxy implements net.x_rd.ee.municipality.producer.Municipalityporttype {
  private String _endpoint = null;
  private net.x_rd.ee.municipality.producer.Municipalityporttype municipalityporttype = null;
  
  public MunicipalityporttypeProxy() {
    _initMunicipalityporttypeProxy();
  }
  
  public MunicipalityporttypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMunicipalityporttypeProxy();
  }
  
  private void _initMunicipalityporttypeProxy() {
    try {
      municipalityporttype = (new net.x_rd.ee.municipality.producer.MunicipalityserviceLocator()).getmunicipalityport();
      if (municipalityporttype != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)municipalityporttype)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)municipalityporttype)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (municipalityporttype != null)
      ((javax.xml.rpc.Stub)municipalityporttype)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.x_rd.ee.municipality.producer.Municipalityporttype getMunicipalityporttype() {
    if (municipalityporttype == null)
      _initMunicipalityporttypeProxy();
    return municipalityporttype;
  }
  
  public void caseList(java.lang.Object request, javax.xml.rpc.holders.ObjectHolder request2, net.x_rd.ee.municipality.producer.holders.CaseListResponseHolder response) throws java.rmi.RemoteException{
    if (municipalityporttype == null)
      _initMunicipalityporttypeProxy();
    municipalityporttype.caseList(request, request2, response);
  }
  
  
}