package org.schema.api.model.thing.creativeWork.digitalDocument;

import org.schema.api.model.thing.intangible.DigitalDocumentPermission;

public class SpreadsheetDigitalDocument extends DigitalDocument
{
	private DigitalDocumentPermission hasDigitalDocumentPermission;

	public DigitalDocumentPermission getHasDigitalDocumentPermission()
	{
		return hasDigitalDocumentPermission;
	}

	public void setHasDigitalDocumentPermission(DigitalDocumentPermission hasDigitalDocumentPermission)
	{
		this.hasDigitalDocumentPermission = hasDigitalDocumentPermission;
	}
}