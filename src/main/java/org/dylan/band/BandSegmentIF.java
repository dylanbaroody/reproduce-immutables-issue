package org.dylan.band;

import org.immutables.value.Value;

import java.util.List;

/**
 * Represents a segment in a band plot. Use segments to represent data islands, or highlight regions within a single
 * plot.
 */
@Value.Immutable
@Value.Style(
        get = {"is*", "get*"},
        init = "set*",
        typeAbstract = {"Abstract*", "*IF"},
        typeImmutable = "*",
        optionalAcceptNullable = true,
        forceJacksonPropertyNames = false,
        visibility = Value.Style.ImplementationVisibility.SAME,
        jdkOnly = true
)
public interface BandSegmentIF {
    List<BandDataPoint> getPoints();
}
