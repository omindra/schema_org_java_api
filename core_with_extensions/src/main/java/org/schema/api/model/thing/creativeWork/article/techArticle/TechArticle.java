package org.schema.api.model.thing.creativeWork.article.techArticle;

import org.schema.api.model.thing.creativeWork.article.Article;

public class TechArticle extends Article
{
	private String dependencies;
	private String proficiencyLevel;

	public String getDependencies()
	{
		return dependencies;
	}

	public void setDependencies(String dependencies)
	{
		this.dependencies = dependencies;
	}

	public String getProficiencyLevel()
	{
		return proficiencyLevel;
	}

	public void setProficiencyLevel(String proficiencyLevel)
	{
		this.proficiencyLevel = proficiencyLevel;
	}
}