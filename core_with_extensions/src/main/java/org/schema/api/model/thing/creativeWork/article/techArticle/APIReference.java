package org.schema.api.model.thing.creativeWork.article.techArticle;

public class APIReference extends TechArticle
{
	private String assemblyVersion;
	private String executableLibraryName;
	private String programmingModel;
	private String targetPlatform;

	public String getAssemblyVersion()
	{
		return assemblyVersion;
	}

	public void setAssemblyVersion(String assemblyVersion)
	{
		this.assemblyVersion = assemblyVersion;
	}

	public String getExecutableLibraryName()
	{
		return executableLibraryName;
	}

	public void setExecutableLibraryName(String executableLibraryName)
	{
		this.executableLibraryName = executableLibraryName;
	}

	public String getProgrammingModel()
	{
		return programmingModel;
	}

	public void setProgrammingModel(String programmingModel)
	{
		this.programmingModel = programmingModel;
	}

	public String getTargetPlatform()
	{
		return targetPlatform;
	}

	public void setTargetPlatform(String targetPlatform)
	{
		this.targetPlatform = targetPlatform;
	}
}