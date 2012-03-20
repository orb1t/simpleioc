package com.khubla.xmlautobeans;

import java.io.InputStream;

import com.khubla.xmlautobeans.exception.AutowireBeanRegistryException;

/**
 * 
 * @author tome
 * 
 */
public interface AutowireBeanRegistry {

	/**
	 * get a bean
	 */
	Object getBean(String name) throws AutowireBeanRegistryException;

	/**
	 * load
	 */
	void load(InputStream inputStream) throws AutowireBeanRegistryException;

	/**
	 * load from default class path resource "autobeans.xml"
	 */
	void load() throws AutowireBeanRegistryException;
}
