package com.pryon.practice;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


/**
 * Created by arato on 3/20/2017.
 */

public class Resources {

    TextureAtlas gameSprites;
    public TextureRegion ground;
    public TextureRegion wall;

    public static final int TILE_SIZE = 16;

    public Resources(){
        gameSprites = new TextureAtlas(Gdx.files.internal("packed/game.atlas"));
        ground = gameSprites.findRegion("ground");
        wall = gameSprites.findRegion("wall");
    }

    public void dispose(){
        gameSprites.dispose();
    }

}
