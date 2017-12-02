package distributedSystems;

//This is the object that we will be passing around
//This object has 2 different field, request and reply
//They are acccessed through the methods, this is called encapsulation 
public class Values {
	private boolean request = false, reply = false;

	public void setReply(boolean reply) {
		this.reply = reply;
	}

	public boolean getReply() {
		return reply;
	}

	public void setRequest(boolean request) {
		this.request = request;
	}

	public boolean getRequest() {
		return request;
	}
}
