package com.pryon.practice.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pryon.practice.Practice;

/**
 * Created by arato on 3/21/2017.
 */

public class GameScreen extends DefaultScreen {
    SpriteBatch batch;

   public GameScreen(Practice _game) {
        super(_game);
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(game.res.ground, 0, 0);
        batch.draw(game.res.wall, 0, 16);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
