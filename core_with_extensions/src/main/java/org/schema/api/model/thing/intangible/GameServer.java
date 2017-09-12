package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.creativeWork.game.VideoGame;
import org.schema.api.model.thing.intangible.enumeration.GameServerStatus;

public class GameServer extends Intangible
{
	private VideoGame game;//Notes - Allowed types- [VideoGame, gameServer]
	private Integer playersOnline;
	private GameServerStatus serverStatus;

	public VideoGame getGame()
	{
		return game;
	}

	public void setGame(VideoGame game)
	{
		this.game = game;
	}

	public Integer getPlayersOnline()
	{
		return playersOnline;
	}

	public void setPlayersOnline(Integer playersOnline)
	{
		this.playersOnline = playersOnline;
	}

	public GameServerStatus getServerStatus()
	{
		return serverStatus;
	}

	public void setServerStatus(GameServerStatus serverStatus)
	{
		this.serverStatus = serverStatus;
	}
}