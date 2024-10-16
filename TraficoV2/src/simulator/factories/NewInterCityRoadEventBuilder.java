package simulator.factories;

import org.json.JSONObject;

import simulator.model.Event;
import simulator.model.NewInterCityRoadEvent;
import simulator.model.Weather;

public class NewInterCityRoadEventBuilder extends NewRoadEventBuilder {

	public NewInterCityRoadEventBuilder () {
		super( "new_inter_city_road");
	}

	@Override
	public Event createTheRoad(JSONObject data) {
		
		return new NewInterCityRoadEvent(data.getInt("time"),data.getString("id"),data.getString("src"),data.getString("dest"),data.getInt("length"),data.getInt("co2limit"),data.getInt("maxspeed"),Weather.valueOf(data.getString("weather")));
	}

}
