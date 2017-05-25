package com.softspec.finalproj.gameofearth.api.management;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.softspec.finalproj.gameofearth.model.game.GameLogic;

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 25/May/2017 - 4:46 PM
 */
public class ImageManagement {
	private Context context;
	private GameLogic logic;
	private CityLoader loader;
	
	public ImageManagement(Context context, GameLogic logic) {
		this.context = context;
		this.logic = logic;
		loader = new CityLoader(context, logic);
	}
	
	public Drawable getCity() {
		return CityLoader.toggleCity(loader, logic.getCityStrategy());
	}
}