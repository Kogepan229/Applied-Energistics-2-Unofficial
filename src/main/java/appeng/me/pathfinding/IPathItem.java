/*
 * This file is part of Applied Energistics 2. Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved. Applied
 * Energistics 2 is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version. Applied Energistics 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details. You should have received a copy of the GNU Lesser General Public License along with
 * Applied Energistics 2. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.me.pathfinding;

import java.util.EnumSet;

import appeng.api.networking.GridFlags;
import appeng.api.util.IReadOnlyCollection;

public interface IPathItem {

    /* USED BY AD HOC PATHING */
    void setAdHocChannels(int channels);

    /* USED BY CONTROLLER PATHING */

    IPathItem getControllerRoute();

    /**
     * Sets route to controller.
     */
    void setControllerRoute(IPathItem fast, boolean zeroOut);

    /**
     * find possible choices for other pathing.
     */
    IReadOnlyCollection<IPathItem> getPossibleOptions();

    /**
     * get the grid flags for this IPathItem.
     *
     * @return the flag set.
     */
    EnumSet<GridFlags> getFlags();

    /**
     * channels are done, wrap it up.
     */
    void finalizeChannels();
}
