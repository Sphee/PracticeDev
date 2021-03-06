package com.pryon.practice;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Resources {

    TextureAtlas gameSprites;
    public TextureRegion ground;
    public TextureRegion wall;

    public TextureRegion player;
    public TextureRegion base;

    public static final int TILE_SIZE = 16;

    public Resources(){
        gameSprites = new TextureAtlas(Gdx.files.internal("packed/game.atlas"));
        ground = gameSprites.findRegion("ground");
        wall = gameSprites.findRegion("wall");

        player = gameSprites.findRegion("player");
        base = gameSprites.findRegion("base");
    }

    public void dispose(){
        gameSprites.dispose();
    }

}
