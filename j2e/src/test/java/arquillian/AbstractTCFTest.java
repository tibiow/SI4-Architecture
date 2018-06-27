package arquillian;

import fr.unice.polytech.isa.tcf.CartModifier;
import fr.unice.polytech.isa.tcf.asynchronous.KitchenPrinter;
import fr.unice.polytech.isa.tcf.entities.Admin;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Trader;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingAdminException;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingTraderException;
import fr.unice.polytech.isa.tcf.interceptors.LogParameters;
import fr.unice.polytech.isa.tcf.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;

import org.jboss.shrinkwrap.api.spec.WebArchive;

import javax.ejb.EJB;

public abstract class AbstractTCFTest {


	@EJB
	protected Database memory;

	@Deployment
	public static WebArchive createDeployment() {
		// Building a Web ARchive (WAR) containing the following elements:
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				// Message-Driven beans
				.addPackage(KitchenPrinter.class.getPackage())
				// Utils
				.addPackage(Database.class.getPackage())
				// Entities
				.addPackage(Customer.class.getPackage())
				.addPackage(Trader.class.getPackage())
				.addPackage(Admin.class.getPackage())
				// Components Interfaces
				.addPackage(CartModifier.class.getPackage())
				// Interceptors
				.addPackage(LogParameters.class.getPackage())
				// Exceptions
				.addPackage(AlreadyExistingCustomerException.class.getPackage())
				.addPackage(AlreadyExistingTraderException.class.getPackage())
				.addPackage(AlreadyExistingAdminException.class.getPackage())
				// Persistence file
				.addAsManifestResource(new ClassLoaderAsset("META-INF/persistence.xml"), "persistence.xml");
	}

}
