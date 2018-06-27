package fr.unice.polytech.isa.tcf.interceptors;

import fr.unice.polytech.isa.tcf.exceptions.UncheckedException;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ItemVerifier {

	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		if ((int) ctx.getParameters()[1] <= 0) {
			throw new UncheckedException("Inconsistent quantity!", null);
		}

		return ctx.proceed();
	}

}
