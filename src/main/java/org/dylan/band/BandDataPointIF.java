package org.dylan.band;

import org.immutables.value.Value;

import java.util.Optional;

/**
 * Represents a point in a band plot.
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
public interface BandDataPointIF {
    @Value.Default
    default Boolean getVisible() {
        return false;
    }

    @Value.Default
    default Double getPositionX() {
        return 0.0;
    }

    @Value.Default
    default Double getPositionBottomY() {
        return 0.0;
    }

    @Value.Default
    default Double getPositionTopY() {
        return 0.0;
    }

    @Value.Default
    default BandPointStyle getStyle() {
        return BandPointStyle.NONE;
    }

    Optional<String> getAccessibilityLabel();

    Optional<String> getGraphLabel();
}
