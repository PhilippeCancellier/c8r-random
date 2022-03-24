package org.fifcan.c8r.random;

import org.flywaydb.core.Flyway;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MigrationService {

    @Inject
    Logger logger;

    @Inject
    Flyway flyway;

    public void checkMigration() {
        logger.info("Flyway check migration " + flyway.info().current().getVersion());
    }
}