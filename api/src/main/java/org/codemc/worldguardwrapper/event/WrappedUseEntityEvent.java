package org.codemc.worldguardwrapper.event;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WrappedUseEntityEvent extends AbstractWrappedEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Event originalEvent;
    private final Player player;
    private final Location target;
    private final Entity entity;

    public WrappedUseEntityEvent(Event originalEvent, Player player, Location target, Entity entity) {
        this.originalEvent = originalEvent;
        this.player = player;
        this.target = target;
        this.entity = entity;
    }

    public Player getPlayer() {
        return player;
    }

    public Location getTarget() {
        return target;
    }

    public Entity getEntity() {
        return entity;
    }

    public Event getOriginalEvent() {
        return originalEvent;
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
