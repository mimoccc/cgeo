package cgeo.geocaching.maps.mapsforge.v024;

import cgeo.geocaching.IWaypoint;
import cgeo.geocaching.maps.interfaces.CachesOverlayItemImpl;

import org.mapsforge.android.mapsold.GeoPoint;
import org.mapsforge.android.mapsold.OverlayItem;

import android.graphics.drawable.Drawable;

public class MapsforgeCacheOverlayItem extends OverlayItem implements CachesOverlayItemImpl {
    final private IWaypoint coord;
    final private boolean applyDistanceRule;

    public MapsforgeCacheOverlayItem(IWaypoint coordinate, boolean applyDistanceRule) {
        super(new GeoPoint(coordinate.getCoords().getLatitudeE6(), coordinate.getCoords().getLongitudeE6()), coordinate.getName(), "");

        this.coord = coordinate;
        this.applyDistanceRule = applyDistanceRule;
    }

    @Override
    public IWaypoint getCoord() {
        return coord;
    }

    @Override
    public Drawable getMarker(int index) {
        return getMarker();
    }

    @Override
    public boolean applyDistanceRule() {
        return applyDistanceRule;
    }

}
