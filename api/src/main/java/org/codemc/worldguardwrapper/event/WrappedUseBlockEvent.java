package org.codemc.worldguardwrapper.event;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class WrappedUseBlockEvent extends AbstractWrappedEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Event originalEvent;
    private final Player player;
    private final World world;
    private final List<Block> blocks;
    private final Material effectiveMaterial;

    public WrappedUseBlockEvent(Event originalEvent, Player player, World world, List<Block> blocks, Material effectiveMaterial) {
        this.originalEvent = originalEvent;
        this.player = player;
        this.world = world;
        this.blocks = blocks;
        this.effectiveMaterial = effectiveMaterial;
    }

    public Event getOriginalEvent() {
        return originalEvent;
    }

    public Player getPlayer() {
        return player;
    }

    public World getWorld() {
        return world;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public Material getEffectiveMaterial() {
        return effectiveMaterial;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
