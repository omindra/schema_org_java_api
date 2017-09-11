package org.schema.api.model.thing.action.playAction;

import org.schema.api.model.thing.action.playAction.PlayAction;
import org.schema.api.model.thing.creativeWork.Diet;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.creativeWork.ExercisePlan;
import org.schema.api.model.thing.creativeWork.Diet;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.localBusiness.sportsActivityLocation.SportsActivityLocation;
import org.schema.api.model.thing.event.SportsEvent;
import org.schema.api.model.thing.organization.sportsOrganization.SportsTeam;
import org.schema.api.model.thing.place.Place;

public class ExerciseAction extends PlayAction
{
	private Diet diet;
	private Distance distance;
	private Place exerciseCourse;
	private ExercisePlan exercisePlan;
	private Diet exerciseRelatedDiet;
	private String exerciseType;
	private Place fromLocation;
	private Person opponent;
	private SportsActivityLocation sportsActivityLocation;
	private SportsEvent sportsEvent;
	private SportsTeam sportsTeam;
	private Place toLocation;

	public Diet getDiet()
	{
		return diet;
	}

	public void setDiet(Diet diet)
	{
		this.diet = diet;
	}

	public Distance getDistance()
	{
		return distance;
	}

	public void setDistance(Distance distance)
	{
		this.distance = distance;
	}

	public Place getExerciseCourse()
	{
		return exerciseCourse;
	}

	public void setExerciseCourse(Place exerciseCourse)
	{
		this.exerciseCourse = exerciseCourse;
	}

	public ExercisePlan getExercisePlan()
	{
		return exercisePlan;
	}

	public void setExercisePlan(ExercisePlan exercisePlan)
	{
		this.exercisePlan = exercisePlan;
	}

	public Diet getExerciseRelatedDiet()
	{
		return exerciseRelatedDiet;
	}

	public void setExerciseRelatedDiet(Diet exerciseRelatedDiet)
	{
		this.exerciseRelatedDiet = exerciseRelatedDiet;
	}

	public String getExerciseType()
	{
		return exerciseType;
	}

	public void setExerciseType(String exerciseType)
	{
		this.exerciseType = exerciseType;
	}

	public Place getFromLocation()
	{
		return fromLocation;
	}

	public void setFromLocation(Place fromLocation)
	{
		this.fromLocation = fromLocation;
	}

	public Person getOpponent()
	{
		return opponent;
	}

	public void setOpponent(Person opponent)
	{
		this.opponent = opponent;
	}

	public SportsActivityLocation getSportsActivityLocation()
	{
		return sportsActivityLocation;
	}

	public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation)
	{
		this.sportsActivityLocation = sportsActivityLocation;
	}

	public SportsEvent getSportsEvent()
	{
		return sportsEvent;
	}

	public void setSportsEvent(SportsEvent sportsEvent)
	{
		this.sportsEvent = sportsEvent;
	}

	public SportsTeam getSportsTeam()
	{
		return sportsTeam;
	}

	public void setSportsTeam(SportsTeam sportsTeam)
	{
		this.sportsTeam = sportsTeam;
	}

	public Place getToLocation()
	{
		return toLocation;
	}

	public void setToLocation(Place toLocation)
	{
		this.toLocation = toLocation;
	}
}