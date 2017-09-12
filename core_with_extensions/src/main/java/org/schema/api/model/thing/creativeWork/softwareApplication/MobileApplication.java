package org.schema.api.model.thing.creativeWork.softwareApplication;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.dataset.dataFeed.DataFeed;

public class MobileApplication extends SoftwareApplication
{
	private String applicationCategory;//Notes - Allowed types- [Text, URL]
	private String applicationSubCategory;//Notes - Allowed types- [Text, URL]
	private String applicationSuite;
	private String availableOnDevice;
	private String countriesNotSupported;
	private String countriesSupported;
	private String downloadUrl;
	private String featureList;//Notes - Allowed types- [Text, URL]
	private String fileSize;
	private String installUrl;
	private String memoryRequirements;//Notes - Allowed types- [Text, URL]
	private String operatingSystem;
	private String permissions;
	private String processorRequirements;
	private String releaseNotes;//Notes - Allowed types- [Text, URL]
	private String screenshot;//Notes - Allowed types- [ImageObject, URL]
	private SoftwareApplication softwareAddOn;
	private CreativeWork softwareHelp;
	private String softwareRequirements;//Notes - Allowed types- [Text, URL]
	private String softwareVersion;
	private String storageRequirements;//Notes - Allowed types- [Text, URL]
	private DataFeed supportingData;

	public String getApplicationCategory()
	{
		return applicationCategory;
	}

	public void setApplicationCategory(String applicationCategory)
	{
		this.applicationCategory = applicationCategory;
	}

	public String getApplicationSubCategory()
	{
		return applicationSubCategory;
	}

	public void setApplicationSubCategory(String applicationSubCategory)
	{
		this.applicationSubCategory = applicationSubCategory;
	}

	public String getApplicationSuite()
	{
		return applicationSuite;
	}

	public void setApplicationSuite(String applicationSuite)
	{
		this.applicationSuite = applicationSuite;
	}

	public String getAvailableOnDevice()
	{
		return availableOnDevice;
	}

	public void setAvailableOnDevice(String availableOnDevice)
	{
		this.availableOnDevice = availableOnDevice;
	}

	public String getCountriesNotSupported()
	{
		return countriesNotSupported;
	}

	public void setCountriesNotSupported(String countriesNotSupported)
	{
		this.countriesNotSupported = countriesNotSupported;
	}

	public String getCountriesSupported()
	{
		return countriesSupported;
	}

	public void setCountriesSupported(String countriesSupported)
	{
		this.countriesSupported = countriesSupported;
	}

	public String getDownloadUrl()
	{
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl)
	{
		this.downloadUrl = downloadUrl;
	}

	public String getFeatureList()
	{
		return featureList;
	}

	public void setFeatureList(String featureList)
	{
		this.featureList = featureList;
	}

	public String getFileSize()
	{
		return fileSize;
	}

	public void setFileSize(String fileSize)
	{
		this.fileSize = fileSize;
	}

	public String getInstallUrl()
	{
		return installUrl;
	}

	public void setInstallUrl(String installUrl)
	{
		this.installUrl = installUrl;
	}

	public String getMemoryRequirements()
	{
		return memoryRequirements;
	}

	public void setMemoryRequirements(String memoryRequirements)
	{
		this.memoryRequirements = memoryRequirements;
	}

	public String getOperatingSystem()
	{
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}

	public String getPermissions()
	{
		return permissions;
	}

	public void setPermissions(String permissions)
	{
		this.permissions = permissions;
	}

	public String getProcessorRequirements()
	{
		return processorRequirements;
	}

	public void setProcessorRequirements(String processorRequirements)
	{
		this.processorRequirements = processorRequirements;
	}

	public String getReleaseNotes()
	{
		return releaseNotes;
	}

	public void setReleaseNotes(String releaseNotes)
	{
		this.releaseNotes = releaseNotes;
	}

	public String getScreenshot()
	{
		return screenshot;
	}

	public void setScreenshot(String screenshot)
	{
		this.screenshot = screenshot;
	}

	public SoftwareApplication getSoftwareAddOn()
	{
		return softwareAddOn;
	}

	public void setSoftwareAddOn(SoftwareApplication softwareAddOn)
	{
		this.softwareAddOn = softwareAddOn;
	}

	public CreativeWork getSoftwareHelp()
	{
		return softwareHelp;
	}

	public void setSoftwareHelp(CreativeWork softwareHelp)
	{
		this.softwareHelp = softwareHelp;
	}

	public String getSoftwareRequirements()
	{
		return softwareRequirements;
	}

	public void setSoftwareRequirements(String softwareRequirements)
	{
		this.softwareRequirements = softwareRequirements;
	}

	public String getSoftwareVersion()
	{
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion)
	{
		this.softwareVersion = softwareVersion;
	}

	public String getStorageRequirements()
	{
		return storageRequirements;
	}

	public void setStorageRequirements(String storageRequirements)
	{
		this.storageRequirements = storageRequirements;
	}

	public DataFeed getSupportingData()
	{
		return supportingData;
	}

	public void setSupportingData(DataFeed supportingData)
	{
		this.supportingData = supportingData;
	}
}