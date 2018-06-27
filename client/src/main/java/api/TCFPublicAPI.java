package api;

import stubs.adminCare.AdminCareService;
import stubs.adminCare.AdminCareServiceImplService;
import stubs.customerCare.CustomerCareServiceImplService;
import stubs.customerCare.CustomerCareService;
import stubs.traderCare.TraderCareService;
import stubs.traderCare.TraderCareServiceImplService;
import stubs.cart.CartWebService;
import stubs.cart.CartWebServiceImplService;
import stubs.catalogue.CatalogueService;
import stubs.catalogue.CatalogueServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class TCFPublicAPI {

	public CartWebService carts;
	public CustomerCareService ccs;
	public CatalogueService cata;
    public AdminCareService acs;
    public TraderCareService tcs;

	public TCFPublicAPI(String host, String port) {
		initCart(host, port);
		initCCS(host, port);
        initACS(host, port);
        initTCS(host, port);
		initCATA(host, port);
	}

	private void initCart(String host, String port) {
		URL wsdlLocation = TCFPublicAPI.class.getResource("/CartWS.wsdl");
		CartWebServiceImplService factory = new CartWebServiceImplService(wsdlLocation);
		this.carts = factory.getCartWebServiceImplPort();
		String address = "http://" + host + ":" + port + "/tcf-backend/webservices/CartWS";
		((BindingProvider) carts).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}

	private void initCCS(String host, String port) {
		URL wsdlLocation = TCFPublicAPI.class.getResource("/CustomerCareWS.wsdl");
		CustomerCareServiceImplService factory = new CustomerCareServiceImplService(wsdlLocation);
		this.ccs = factory.getCustomerCareServiceImplPort();
		String address = "http://" + host + ":" + port + "/tcf-backend/webservices/CustomerCareWS";
		((BindingProvider) ccs).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}
	private void initACS(String host, String port) {
		URL wsdlLocation = TCFPublicAPI.class.getResource("/AdminCareWS.wsdl");
		AdminCareServiceImplService factory = new AdminCareServiceImplService(wsdlLocation);
		this.acs = factory.getAdminCareServiceImplPort();
		String address = "http://" + host + ":" + port + "/tcf-backend/webservices/AdminCareWS";
		((BindingProvider) acs).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}
	private void initTCS(String host, String port) {
		URL wsdlLocation = TCFPublicAPI.class.getResource("/TraderCareWS.wsdl");
		TraderCareServiceImplService factory = new TraderCareServiceImplService(wsdlLocation);
		this.tcs = factory.getTraderCareServiceImplPort();
		String address = "http://" + host + ":" + port + "/tcf-backend/webservices/TraderCareWS";
		((BindingProvider) tcs).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}

	private void initCATA(String host, String port) {
		URL wsdlLocation = TCFPublicAPI.class.getResource("/CatalogueWS.wsdl");
		CatalogueServiceImplService factory = new CatalogueServiceImplService(wsdlLocation);
		this.cata = factory.getCatalogueServiceImplPort();
		String address = "http://" + host + ":" + port + "/tcf-backend/webservices/CatalogueWS";
		((BindingProvider) cata).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}

}
