package com.stepper.opdracht1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	BitmapFont font;

	float x = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		font = new BitmapFont();
		Gdx.graphics.setVSync(false);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		update(Gdx.graphics.getDeltaTime());
		batch.begin();
		batch.draw(img, x, 0);
		batch.end();
	}

	private void update (float time) {

		x += 15000 * time;

		if(x > Gdx.graphics.getWidth())
			x = 0 - img.getWidth();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
