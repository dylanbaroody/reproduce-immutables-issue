package org.dylan.band;

import org.dylan.GraphPlot;
import org.immutables.value.Value;

import java.util.List;

/**
 * Represents a band plot. This plot will render two lines, then fill in the space between them.
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
public interface BandPlotIF extends GraphPlot {
    List<BandSegment> getSegments();

    BandPlotStyle getStyle();
}
