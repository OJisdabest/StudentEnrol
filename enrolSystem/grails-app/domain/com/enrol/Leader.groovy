package com.enrol

class Leader {

String fullName
String post
String email
String office

    static constraints = {
	fullName blank:false, nullable:false;
	post blank:false, nullable:false;
	email blank:false, nullable:false, email:true;
	office blank:false, nullable:false;

    }
}
