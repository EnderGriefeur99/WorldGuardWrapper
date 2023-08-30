package org.codemc.worldguardwrapper.event;


import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WrappedDamageEntityEvent extends AbstractWrappedEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Event originalEvent;
    private final Player player;
    private final Location target;
    private final Entity entity;

    public WrappedDamageEntityEvent(Event originalEvent, Player player, Location target, Entity entity) {
        this.originalEvent = originalEvent;
        this.player = player;
        this.target = target;
        this.entity = entity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Event getOriginalEvent() {
        return originalEvent;
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
}
