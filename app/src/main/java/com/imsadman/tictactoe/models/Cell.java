package com.imsadman.tictactoe.models;

import com.imsadman.tictactoe.utils.StringUtil;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtil.isNullOrEmpty(player.score);
    }
}
