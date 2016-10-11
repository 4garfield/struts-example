package garfield.java.struts.hello.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		
		HelloForm helloForm = (HelloForm) form;
		helloForm.setMessage("Hello World!  --Struts");
		
		return mapping.findForward("success");
	}

}
