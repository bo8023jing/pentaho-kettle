package org.pentaho.di.engine.api.reporting;

import org.pentaho.di.engine.api.model.LogicalModelElement;

/**
 * Created by nbaker on 1/20/17.
 */
public class MetricsEvent<S extends LogicalModelElement> implements ReportingEvent<S, Metrics> {
  private final S source;
  private final Metrics metrics;

  public MetricsEvent( S source, Metrics metrics ) {
    this.source = source;
    this.metrics = metrics;
  }

  @Override public S getSource() {
    return source;
  }

  @Override public Metrics getData() {
    return metrics;
  }
}
