package com.pryon.practice;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pryon.practice.screens.GameScreen;

public class Practice extends Game {
	public Resources res;
	
	@Override
	public void create () {
		res = new Resources();
		setScreen(new GameScreen(this));
	}

	@Override
	public void dispose () {
		res.dispose();;
	}
}
