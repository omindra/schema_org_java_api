package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.creativeWork.softwareApplication.SoftwareApplication;

public class EntryPoint extends Intangible
{
	private SoftwareApplication actionApplication;
	private String actionPlatform;//Notes - Allowed types- [Text, URL]
	private String contentType;
	private String encodingType;
	private String httpMethod;
	private String urlTemplate;

	public SoftwareApplication getActionApplication()
	{
		return actionApplication;
	}

	public void setActionApplication(SoftwareApplication actionApplication)
	{
		this.actionApplication = actionApplication;
	}

	public String getActionPlatform()
	{
		return actionPlatform;
	}

	public void setActionPlatform(String actionPlatform)
	{
		this.actionPlatform = actionPlatform;
	}

	public String getContentType()
	{
		return contentType;
	}

	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}

	public String getEncodingType()
	{
		return encodingType;
	}

	public void setEncodingType(String encodingType)
	{
		this.encodingType = encodingType;
	}

	public String getHttpMethod()
	{
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod)
	{
		this.httpMethod = httpMethod;
	}

	public String getUrlTemplate()
	{
		return urlTemplate;
	}

	public void setUrlTemplate(String urlTemplate)
	{
		this.urlTemplate = urlTemplate;
	}
}