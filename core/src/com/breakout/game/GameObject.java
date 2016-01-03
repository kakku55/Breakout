package com.breakout.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameObject {
    protected EntityWorld _entityWorld;
    protected Vector2 _position;
    protected Vector2 _size;
    protected Texture _texture;

    public GameObject(Vector2 position, Vector2 size, Texture texture, EntityWorld entityWorld) {
        _position = position;
        _size = size;
        _texture = texture;
        _entityWorld = entityWorld;
    }

    abstract void update();

    abstract void draw(SpriteBatch batch);

    public Rectangle getRectangle() {
        return new Rectangle(_position.x, _position.y, _size.x, _size.y);
    }

}