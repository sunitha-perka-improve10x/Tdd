package com.improve10x.bowling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void nothing(){
    }

    @Test
    public void canRoll() {
        Game game = new Game();
        game.Roll(1);
    }
    @Test
    public void gutterGame(){
        Game game = new Game();
        for(int i = 0; i < 20; i++) {
            game.Roll(0);
        }

    }
}
