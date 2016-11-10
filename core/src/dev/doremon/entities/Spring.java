package dev.doremon.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import dev.doremon.main.Handler;
import dev.doremon.gfx.Assets;

public class Spring extends Entity {

    public static int DEFAULT_WIDTH = 80;
    public static int DEFAULT_HEIGHT = 60;

    private int state = 0;
    private boolean appear = false;

    public static Spring generate(Handler handler) {
        return new Spring(handler, 0, 0);
    }

    public Spring(Handler handler, float x, float y) {
        super(handler, x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(SpriteBatch batch) {
        if (appear) {
            batch.draw(getCurrentFrame(),
                    (int) this.x, (int) this.y,
                    this.width, this.height);
        }
    }

    public TextureRegion getCurrentFrame() {
        return Assets.spring[this.state];
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isAppear() {
        return appear;
    }

    public void setAppear(boolean appear) {
        this.appear = appear;
    }

    public void dispose() {

    }

}
