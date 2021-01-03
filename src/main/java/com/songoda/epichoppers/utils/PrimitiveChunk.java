package com.songoda.epichoppers.utils;

import org.bukkit.Location;

import java.util.Objects;

public class PrimitiveChunk {

    private final String world;
    private final int x;
    private final int y;

    public PrimitiveChunk(String world, int x, int y) {
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public static PrimitiveChunk of(Location location) {
        return new PrimitiveChunk(location.getWorld().getName(), location.getBlockX() / 16, location.getBlockZ() / 16);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getWorld() {
        return world;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveChunk that = (PrimitiveChunk) o;
        boolean checkingEquality = x == that.x &&
                y == that.y &&
                Objects.equals(world, that.world);
        System.out.println(checkingEquality);
        return checkingEquality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(world, x, y);
    }
}
