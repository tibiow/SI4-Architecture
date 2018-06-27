using System;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;

using Partner.Data;

namespace Partner.Service {

  // RegisterService will contain the mail service and the Cerberus service
  [ServiceContract]
  public interface IRegisterService{

    // Mail service + function called when a request is send to the right address
    [OperationContract]
    [WebInvoke( Method = "POST", UriTemplate = "mailbox",
                RequestFormat = WebMessageFormat.Json,
                ResponseFormat = WebMessageFormat.Json)]
    int ReceiveMailRequest(MailRequest request);

    // Cerberus service + function called when a request is send to the right address
    [OperationContract]
    [WebInvoke( Method = "POST", UriTemplate = "cerberus",
                RequestFormat = WebMessageFormat.Json,
                ResponseFormat = WebMessageFormat.Json)]
    int ReceiveCerberusRequest(CerberusRequest request);

    [OperationContract]
    [WebInvoke( Method = "POST", UriTemplate = "login",
                RequestFormat = WebMessageFormat.Json,
                ResponseFormat = WebMessageFormat.Json)]
    int ReceiveLoginRequest(LoginRequest request);

}

}
