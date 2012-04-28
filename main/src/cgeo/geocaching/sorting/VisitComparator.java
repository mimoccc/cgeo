package cgeo.geocaching.sorting;

import cgeo.geocaching.cgCache;

/**
 * sorts caches by last visited date
 *
 */
public class VisitComparator extends AbstractCacheComparator {

    @Override
    protected boolean canCompare(final cgCache cache1, final cgCache cache2) {
        return cache1.getVisitedDate() > 0 && cache2.getVisitedDate() > 0;
    }

    @Override
    protected int compareCaches(final cgCache cache1, final cgCache cache2) {
        return Long.valueOf(cache2.getVisitedDate()).compareTo(cache1.getVisitedDate());
    }
}
