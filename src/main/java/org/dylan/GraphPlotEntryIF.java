package org.dylan;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 * Encapsulates a graph plot, handling serialization mapping for each plot type.
 */
@Value.Immutable
@JsonSerialize
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
public interface GraphPlotEntryIF {
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", visible = true)
    @JsonSubTypes(
            value = {
                    @JsonSubTypes.Type(value = BandPlot.class, name = "BAND_PLOT"),
            }
    )
    GraphPlot getPlot();
}
