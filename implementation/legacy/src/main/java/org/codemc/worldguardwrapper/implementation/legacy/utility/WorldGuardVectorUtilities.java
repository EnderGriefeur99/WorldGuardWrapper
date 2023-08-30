package org.codemc.worldguardwrapper.implementation.legacy.utility;

import com.sk89q.worldedit.BlockVector;
import com.sk89q.worldedit.BlockVector2D;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.List;
import java.util.stream.Collectors;

public class WorldGuardVectorUtilities {

    public static BlockVector toBlockVector(Location location) {
        return new BlockVector(location.getX(), location.getY(), location.getZ());
    }

    public static Location fromBlockVector(World world, BlockVector vector) {
        return new Location(world, vector.getX(), vector.getY(), vector.getZ());
    }

    public static List<BlockVector2D> toBlockVector2DList(List<Location> locations) {
        return locations.stream()
                .map(location -> new BlockVector2D(location.getX(), location.getZ()))
                .collect(Collectors.toList());
    }

}
