package org.dylan;

/**
 * Represents a graph organism in the design system. Each graph consists of the graphing plane, then one or more
 * plots (line plots, bar graphs, etc). Plots are rendered in the order they are provided by the front end.
 */
public interface GraphPlot {

    String getId();
}
