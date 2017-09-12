package org.schema.api.model.thing.creativeWork.game;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;
import org.schema.api.model.thing.intangible.GameServer;
import org.schema.api.model.thing.intangible.enumeration.GamePlayMode;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;

public class VideoGame extends Game
{
	private Person actor;
	private CreativeWork cheatCode;
	private Person director;
	private String gamePlatform;//Notes - Allowed types- [Text, Thing, URL, video games]
	private GameServer gameServer;//Notes - Allowed types- [GameServer, game]
	private CreativeWork gameTip;
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private GamePlayMode playMode;
	private VideoObject trailer;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public CreativeWork getCheatCode()
	{
		return cheatCode;
	}

	public void setCheatCode(CreativeWork cheatCode)
	{
		this.cheatCode = cheatCode;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public String getGamePlatform()
	{
		return gamePlatform;
	}

	public void setGamePlatform(String gamePlatform)
	{
		this.gamePlatform = gamePlatform;
	}

	public GameServer getGameServer()
	{
		return gameServer;
	}

	public void setGameServer(GameServer gameServer)
	{
		this.gameServer = gameServer;
	}

	public CreativeWork getGameTip()
	{
		return gameTip;
	}

	public void setGameTip(CreativeWork gameTip)
	{
		this.gameTip = gameTip;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public GamePlayMode getPlayMode()
	{
		return playMode;
	}

	public void setPlayMode(GamePlayMode playMode)
	{
		this.playMode = playMode;
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