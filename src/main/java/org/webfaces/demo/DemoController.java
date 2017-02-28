package org.webfaces.demo;


import javax.faces.bean.ManagedBean;

/**
 * Created: 23 Feb 2017
 *
 * @author Kito D. Mann
 */
@ManagedBean
public class DemoController {

    private String message = "This is a message";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
