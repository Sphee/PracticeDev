package com.pryon.practice.graph;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.pryon.practice.Resources;

/**
 * Created by arato on 3/21/2017.
 */

public class SizeEvaluator {
    private Stage measuredStage;
    private Resources resources;

    public static final int BASE_MARGIN = 2;

    // 4 by 4

    private final int maxTileBaseX;
    private final int maxTileBaseY;

    public SizeEvaluator(Stage _stage, Resources _res, int maxBaseX, int maxBaseY){
        measuredStage = _stage;
        resources = _res;
        maxTileBaseX = maxBaseX;
        maxTileBaseY = maxBaseY;
    }

    //4x4
    //x (0 -> 3), 0 at bottom, maxTileBaseX at the right
    // y (0 -> 3), 0 at bottom, maxTileBaseY at the top

    public float getBaseScreenX(int baseX){
        return measuredStage.getWidth() / 2
                - (resources.TILE_SIZE + BASE_MARGIN)
                * (maxTileBaseX + 1 - baseX);
        //Tile Size = 16 px;
        //BaseX = 0
    }

    public float getBaseScreenY(int baseY){
        return measuredStage.getHeight() / 2
                - ((resources.TILE_SIZE + BASE_MARGIN ) * 2 /3)
                * ((maxTileBaseY + 1) / 2 - baseY);
    }
}

