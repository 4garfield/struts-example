package garfield.java.struts.hello.action.form;

import org.apache.struts.action.ActionForm;

/**
 * 
 * @author garfield
 *
 */
public class HelloForm extends ActionForm {

	private static final long serialVersionUID = -6230086934107495570L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
