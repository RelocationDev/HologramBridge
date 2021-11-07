/*
 * MIT License
 *
 * Copyright (c) 2021 Chubbyduck1
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package me.chubbyduck.holobridge.interfaces;

import me.chubbyduck.holobridge.lines.Line;
import me.chubbyduck.holobridge.objects.Hologram;
import me.chubbyduck.holobridge.objects.VisibilityManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Connector {

    /**
     * Create a {@link Hologram}
     *
     * @param location The starting {@link Location}
     * @return The created {@link Hologram}
     */
    Hologram createHologram(Location location);

    /**
     * Set a holograms line at an index
     *
     * @param hologram  The parent {@link Hologram}
     * @param lineIndex The {@link Line} index
     * @param line      The {@link Line}
     */
    void setLine(Hologram hologram, int lineIndex, Line line);

    /**
     * Update a {@link Hologram}s line
     *
     * @param hologram  The parent {@link Hologram}
     * @param lineIndex The {@link Line} index
     * @param line      The {@link Line}
     */
    void updateLine(Hologram hologram, int lineIndex, Line line);

    /**
     * Append a {@link Line} to a {@link Hologram}
     *
     * @param hologram The parent {@link Hologram}
     * @param line     The {@link Line}
     */
    void appendLine(Hologram hologram, Line line);

    /**
     * Teleport a hologram
     *
     * @param hologram The {@link Hologram} to teleport
     * @param location The {@link Location} to teleport it to
     */
    void teleport(Hologram hologram, Location location);

    /**
     * Delete a hologram
     */
    void delete(Hologram hologram);

    /**
     * Show a hologram to a player
     *
     * @param visibilityManager The {@link VisibilityManager} to use
     * @param player            The player
     */
    void showTo(VisibilityManager visibilityManager, Player player);

    /**
     * Hide a hologram from a player
     *
     * @param visibilityManager The {@link VisibilityManager} to use
     * @param player            The player
     */
    void hideTo(VisibilityManager visibilityManager, Player player);

}
