package org.schema.api.model.thing.creativeWork.creativeWorkSeries;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.creativeWork.episode.Episode;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;
import org.schema.api.model.thing.intangible.enumeration.GamePlayMode;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;

public class VideoGameSeries extends CreativeWorkSeries
{
	private Person actor;
	private Thing characterAttribute;
	private CreativeWork cheatCode;
	private CreativeWorkSeason containsSeason;
	private Person director;
	private Episode episode;//Notes - Allowed types- [Episode, episodes]
	private Thing gameItem;
	private String gameLocation;//Notes - Allowed types- [Place, PostalAddress, URL]
	private String gamePlatform;//Notes - Allowed types- [Text, Thing, URL, video games]
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private Integer numberOfEpisodes;
	private QuantitativeValue numberOfPlayers;
	private Integer numberOfSeasons;
	private GamePlayMode playMode;
	private Organization productionCompany;
	private Thing quest;
	private VideoObject trailer;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public Thing getCharacterAttribute()
	{
		return characterAttribute;
	}

	public void setCharacterAttribute(Thing characterAttribute)
	{
		this.characterAttribute = characterAttribute;
	}

	public CreativeWork getCheatCode()
	{
		return cheatCode;
	}

	public void setCheatCode(CreativeWork cheatCode)
	{
		this.cheatCode = cheatCode;
	}

	public CreativeWorkSeason getContainsSeason()
	{
		return containsSeason;
	}

	public void setContainsSeason(CreativeWorkSeason containsSeason)
	{
		this.containsSeason = containsSeason;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public Episode getEpisode()
	{
		return episode;
	}

	public void setEpisode(Episode episode)
	{
		this.episode = episode;
	}

	public Thing getGameItem()
	{
		return gameItem;
	}

	public void setGameItem(Thing gameItem)
	{
		this.gameItem = gameItem;
	}

	public String getGameLocation()
	{
		return gameLocation;
	}

	public void setGameLocation(String gameLocation)
	{
		this.gameLocation = gameLocation;
	}

	public String getGamePlatform()
	{
		return gamePlatform;
	}

	public void setGamePlatform(String gamePlatform)
	{
		this.gamePlatform = gamePlatform;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public Integer getNumberOfEpisodes()
	{
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(Integer numberOfEpisodes)
	{
		this.numberOfEpisodes = numberOfEpisodes;
	}

	public QuantitativeValue getNumberOfPlayers()
	{
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(QuantitativeValue numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}

	public Integer getNumberOfSeasons()
	{
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(Integer numberOfSeasons)
	{
		this.numberOfSeasons = numberOfSeasons;
	}

	public GamePlayMode getPlayMode()
	{
		return playMode;
	}

	public void setPlayMode(GamePlayMode playMode)
	{
		this.playMode = playMode;
	}

	public Organization getProductionCompany()
	{
		return productionCompany;
	}

	public void setProductionCompany(Organization productionCompany)
	{
		this.productionCompany = productionCompany;
	}

	public Thing getQuest()
	{
		return quest;
	}

	public void setQuest(Thing quest)
	{
		this.quest = quest;
	}

	public VideoObject getTrailer()
	{
		return trailer;
	}

	public void setTrailer(VideoObject trailer)
	{
		this.trailer = trailer;
	}
}