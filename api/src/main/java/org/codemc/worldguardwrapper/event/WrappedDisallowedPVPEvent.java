package org.codemc.worldguardwrapper.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WrappedDisallowedPVPEvent extends AbstractWrappedEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Player attacker;
    private final Player defender;
    private final Event cause;

    public WrappedDisallowedPVPEvent(Player attacker, Player defender, Event cause) {
        this.attacker = attacker;
        this.defender = defender;
        this.cause = cause;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getAttacker() {
        return attacker;
    }

    public Player getDefender() {
        return defender;
    }

    public Event getCause() {
        return cause;
    }
}
