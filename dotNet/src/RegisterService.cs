using System;
using System.Net;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;
using System.Linq;
using Partner.Data;

namespace Partner.Service {

  // The service is stateful, as it is only a Proof of Concept.
  // Services should be stateless, this is for demonstration purpose only.
  [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single)]
  public class RegisterService : IRegisterService{

    // Mail service implementation
    public int ReceiveMailRequest(MailRequest request){
        Console.WriteLine("ReceiveMailRequest : Mail = " + request.Mail);
        return 1;
    }

    // Cerberus service implementation
    public int ReceiveCerberusRequest(CerberusRequest request){
        Console.WriteLine("ReceiveCerberusRequest : Mail = " + request.Mail + ", Mdp = " + request.Mdp + ", ID = " + request.ID);
        return 1;
    }

    public int ReceiveLoginRequest(LoginRequest request){
        Console.WriteLine("ReceiveLoginRequest : name = " + request.name);
        return 1;
    }

  }
}
