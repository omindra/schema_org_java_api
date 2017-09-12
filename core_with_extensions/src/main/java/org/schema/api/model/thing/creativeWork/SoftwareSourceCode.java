package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.softwareApplication.SoftwareApplication;

public class SoftwareSourceCode extends CreativeWork
{
	private String codeRepository;
	private String codeSampleType;
	private String programmingLanguage;//Notes - Allowed types- [ComputerLanguage, Text]
	private String runtimePlatform;
	private SoftwareApplication targetProduct;

	public String getCodeRepository()
	{
		return codeRepository;
	}

	public void setCodeRepository(String codeRepository)
	{
		this.codeRepository = codeRepository;
	}

	public String getCodeSampleType()
	{
		return codeSampleType;
	}

	public void setCodeSampleType(String codeSampleType)
	{
		this.codeSampleType = codeSampleType;
	}

	public String getProgrammingLanguage()
	{
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage)
	{
		this.programmingLanguage = programmingLanguage;
	}

	public String getRuntimePlatform()
	{
		return runtimePlatform;
	}

	public void setRuntimePlatform(String runtimePlatform)
	{
		this.runtimePlatform = runtimePlatform;
	}

	public SoftwareApplication getTargetProduct()
	{
		return targetProduct;
	}

	public void setTargetProduct(SoftwareApplication targetProduct)
	{
		this.targetProduct = targetProduct;
	}
}