package garfield.java.struts.hello.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import garfield.java.struts.hello.action.form.HelloForm;

/**
 * 
 * @author garfield
 *
 */
public class HelloAction extends Action {
	
	private static Log logger = LogFactory.getLog(HelloAction.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		
		logger.debug("start HelloAction execute method.");
		
		HelloForm helloForm = (HelloForm) form;
		helloForm.setMessage("Hello World!  --Struts");
		
		return mapping.findForward("success");
	}

}
