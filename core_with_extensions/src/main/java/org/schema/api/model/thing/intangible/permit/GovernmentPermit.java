package org.schema.api.model.thing.intangible.permit;

import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.service.Service;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.administrativeArea.AdministrativeArea;

import java.util.Date;

public class GovernmentPermit extends Permit
{
	private Organization issuedBy;
	private Service issuedThrough;
	private Audience permitAudience;
	private Duration validFor;
	private Date validFrom;
	private AdministrativeArea validIn;
	private Date validUntil;

	public Organization getIssuedBy()
	{
		return issuedBy;
	}

	public void setIssuedBy(Organization issuedBy)
	{
		this.issuedBy = issuedBy;
	}

	public Service getIssuedThrough()
	{
		return issuedThrough;
	}

	public void setIssuedThrough(Service issuedThrough)
	{
		this.issuedThrough = issuedThrough;
	}

	public Audience getPermitAudience()
	{
		return permitAudience;
	}

	public void setPermitAudience(Audience permitAudience)
	{
		this.permitAudience = permitAudience;
	}

	public Duration getValidFor()
	{
		return validFor;
	}

	public void setValidFor(Duration validFor)
	{
		this.validFor = validFor;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public AdministrativeArea getValidIn()
	{
		return validIn;
	}

	public void setValidIn(AdministrativeArea validIn)
	{
		this.validIn = validIn;
	}

	public Date getValidUntil()
	{
		return validUntil;
	}

	public void setValidUntil(Date validUntil)
	{
		this.validUntil = validUntil;
	}
}