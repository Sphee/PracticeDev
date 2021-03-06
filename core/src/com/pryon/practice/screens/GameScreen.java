package com.pryon.practice.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.pryon.practice.Practice;
import com.pryon.practice.Resources;
import com.pryon.practice.graph.Background;
import com.pryon.practice.graph.SizeEvaluator;


public class GameScreen extends DefaultScreen {
    SpriteBatch batch;

    // 8 Height
    // 12 width
    public static final int SCREEN_W =  12 * Resources.TILE_SIZE; // 192
    public static final int SCREEN_H = 8 * Resources.TILE_SIZE; // 128

    public static final int MAX_BASE_X = 3;
    public static final int MAX_BASE_Y = 3;


    private SizeEvaluator sizeEvaluator;

    private Stage gameStage;

    private Background bg;

   public GameScreen(Practice _game) {
     super(_game);
     batch = new SpriteBatch();

     ExtendViewport viewport = new ExtendViewport(SCREEN_W, SCREEN_H);
     gameStage = new Stage(viewport, batch);
     bg = new Background();
     sizeEvaluator = new SizeEvaluator(gameStage, game.res, MAX_BASE_X, MAX_BASE_Y);

    }

    public void update(float delta){
        gameStage.act();
    }

    public void drawBases(){
        batch.begin();
        // draw 4x4 Bases
        for(int x = 0; x <= MAX_BASE_X;x++){
            for(int y = 0; y <= MAX_BASE_Y; y++){
                batch.draw(game.res.base,
                        sizeEvaluator.getBaseScreenX(x),
                        sizeEvaluator.getBaseScreenY(y));
            }
        }

        batch.draw(game.res.player,
                sizeEvaluator.getBaseScreenX(1),
                sizeEvaluator.getBaseScreenY(1) + sizeEvaluator.BASE_MARGIN);

        batch.end();
    }

    @Override
    public void render(float delta){

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        bg.draw(gameStage, game.res);
        drawBases();
        gameStage.draw();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }

    @Override
    public void resize(int width, int height){
        super.resize(width, height);
        gameStage.getViewport().update(width, height, true);
    }
}
