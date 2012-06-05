package com.idega.xroad.bean;


public class Message extends Case{

	private static final long serialVersionUID = 2443260681172469343L;

	
	public Message() {
		super();
	}
	
	public Message(com.idega.block.process.message.data.Message message) {
		super(message);
	}
	
}
