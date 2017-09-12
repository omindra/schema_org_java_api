package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;

import java.util.Date;

public class JobPosting extends Intangible
{
	private Number baseSalary;//Notes - Allowed types- [MonetaryAmount, Number, PriceSpecification]
	private Date datePosted;
	private String educationRequirements;
	private String employmentType;
	private Number estimatedSalary;//Notes - Allowed types- [MonetaryAmount, Number, PriceSpecification]
	private String experienceRequirements;
	private Organization hiringOrganization;
	private String incentiveCompensation;
	private String industry;
	private String jobBenefits;
	private Place jobLocation;
	private String occupationalCategory;
	private String qualifications;
	private String responsibilities;
	private String salaryCurrency;//Notes - Allowed types- [Text, ISO 4217]
	private String skills;
	private String specialCommitments;
	private String title;
	private Date validThrough;
	private String workHours;

	public Number getBaseSalary()
	{
		return baseSalary;
	}

	public void setBaseSalary(Number baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public Date getDatePosted()
	{
		return datePosted;
	}

	public void setDatePosted(Date datePosted)
	{
		this.datePosted = datePosted;
	}

	public String getEducationRequirements()
	{
		return educationRequirements;
	}

	public void setEducationRequirements(String educationRequirements)
	{
		this.educationRequirements = educationRequirements;
	}

	public String getEmploymentType()
	{
		return employmentType;
	}

	public void setEmploymentType(String employmentType)
	{
		this.employmentType = employmentType;
	}

	public Number getEstimatedSalary()
	{
		return estimatedSalary;
	}

	public void setEstimatedSalary(Number estimatedSalary)
	{
		this.estimatedSalary = estimatedSalary;
	}

	public String getExperienceRequirements()
	{
		return experienceRequirements;
	}

	public void setExperienceRequirements(String experienceRequirements)
	{
		this.experienceRequirements = experienceRequirements;
	}

	public Organization getHiringOrganization()
	{
		return hiringOrganization;
	}

	public void setHiringOrganization(Organization hiringOrganization)
	{
		this.hiringOrganization = hiringOrganization;
	}

	public String getIncentiveCompensation()
	{
		return incentiveCompensation;
	}

	public void setIncentiveCompensation(String incentiveCompensation)
	{
		this.incentiveCompensation = incentiveCompensation;
	}

	public String getIndustry()
	{
		return industry;
	}

	public void setIndustry(String industry)
	{
		this.industry = industry;
	}

	public String getJobBenefits()
	{
		return jobBenefits;
	}

	public void setJobBenefits(String jobBenefits)
	{
		this.jobBenefits = jobBenefits;
	}

	public Place getJobLocation()
	{
		return jobLocation;
	}

	public void setJobLocation(Place jobLocation)
	{
		this.jobLocation = jobLocation;
	}

	public String getOccupationalCategory()
	{
		return occupationalCategory;
	}

	public void setOccupationalCategory(String occupationalCategory)
	{
		this.occupationalCategory = occupationalCategory;
	}

	public String getQualifications()
	{
		return qualifications;
	}

	public void setQualifications(String qualifications)
	{
		this.qualifications = qualifications;
	}

	public String getResponsibilities()
	{
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities)
	{
		this.responsibilities = responsibilities;
	}

	public String getSalaryCurrency()
	{
		return salaryCurrency;
	}

	public void setSalaryCurrency(String salaryCurrency)
	{
		this.salaryCurrency = salaryCurrency;
	}

	public String getSkills()
	{
		return skills;
	}

	public void setSkills(String skills)
	{
		this.skills = skills;
	}

	public String getSpecialCommitments()
	{
		return specialCommitments;
	}

	public void setSpecialCommitments(String specialCommitments)
	{
		this.specialCommitments = specialCommitments;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Date getValidThrough()
	{
		return validThrough;
	}

	public void setValidThrough(Date validThrough)
	{
		this.validThrough = validThrough;
	}

	public String getWorkHours()
	{
		return workHours;
	}

	public void setWorkHours(String workHours)
	{
		this.workHours = workHours;
	}
}