using System.Runtime.Serialization;
using System;


// Describe the expected format of the object (ie JSON criteria)
namespace Partner.Data {

    // Mail service
    [DataContract(Namespace = "http://infedelity/mail", Name = "MailRequest")]
    public class MailRequest{
      [DataMember]
      public string Mail { get; set; }

      override public string ToString(){
        return "MailRequest[" + Mail + "]";
      }
    }

    // Cerberus service
    [DataContract(Namespace = "http://infedelity/cerberus", Name = "CerberusRequest")]
    public class CerberusRequest{
          [DataMember]
          public string Mail { get; set; }
          [DataMember]
          public string Mdp { get; set; }
          [DataMember]
          public int ID { get; set; }

          override public string ToString(){
            return "CerberusRequest[" + Mail +", " + Mdp + ", "+ ID + "]";
          }
    }

    [DataContract(Namespace = "http://infedelity/login", Name = "LoginRequest")]
    public class LoginRequest{
          [DataMember]
          public string name { get; set; }
          [DataMember]
          public string Mdp { get; set; }

          override public string ToString(){
            return "LoginRequest[" + name +", " + Mdp + "]";
          }
    }


}
