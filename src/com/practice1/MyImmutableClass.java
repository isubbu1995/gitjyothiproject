package com.practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class MyImmutableClass {

	// class and instance variables has to final
	// intialize the values thorog construters in deep copy mannaer
	// while getting via getter aslo deep copy
	// don;t provide setters**

	private final String myName;
	private final Map<String, String> address;

	public MyImmutableClass(String myName, Map<String, String> addr) {
		super();
		this.myName = myName;
		Map<String, String> temp = new HashMap<String, String>();

		for (Entry<String, String> ad : addr.entrySet()) {
			temp.put(ad.getKey(), ad.getValue());
		}

		this.address = temp;

	}

	public String getMyName() {
		return myName;
	}

	public Map<String, String> getAdd() {
		Map<String, String> temp = new HashMap<String, String>();

		for (Entry<String, String> ad : address.entrySet()) {
			temp.put(ad.getKey(), ad.getValue());
		}

		return temp;
	}

}
