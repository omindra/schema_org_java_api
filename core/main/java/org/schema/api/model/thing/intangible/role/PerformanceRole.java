package org.schema.api.model.thing.intangible.role;

import org.schema.api.model.thing.intangible.role.Role;

public class PerformanceRole extends Role
{
	private String characterName;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
}