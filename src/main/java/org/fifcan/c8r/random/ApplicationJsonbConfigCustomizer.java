package org.fifcan.c8r.random;

import io.quarkus.jsonb.JsonbConfigCustomizer;
import javax.inject.Singleton;
import javax.json.bind.JsonbConfig;

@Singleton
public class ApplicationJsonbConfigCustomizer implements JsonbConfigCustomizer {

    public void customize(JsonbConfig config) {
        config.withNullValues(Boolean.TRUE);
    }
}