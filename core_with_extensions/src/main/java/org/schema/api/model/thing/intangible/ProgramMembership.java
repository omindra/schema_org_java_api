package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.organization.Organization;

public class ProgramMembership extends Intangible
{
	private Organization hostingOrganization;
	private Organization member;//Notes - Allowed types- [Organization, Person, members, musicGroupMember]
	private String membershipNumber;
	private String programName;

	public Organization getHostingOrganization()
	{
		return hostingOrganization;
	}

	public void setHostingOrganization(Organization hostingOrganization)
	{
		this.hostingOrganization = hostingOrganization;
	}

	public Organization getMember()
	{
		return member;
	}

	public void setMember(Organization member)
	{
		this.member = member;
	}

	public String getMembershipNumber()
	{
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber)
	{
		this.membershipNumber = membershipNumber;
	}

	public String getProgramName()
	{
		return programName;
	}

	public void setProgramName(String programName)
	{
		this.programName = programName;
	}
}