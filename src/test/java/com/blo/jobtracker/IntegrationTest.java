package com.blo.jobtracker;

import com.blo.jobtracker.config.AsyncSyncConfiguration;
import com.blo.jobtracker.config.EmbeddedElasticsearch;
import com.blo.jobtracker.config.EmbeddedKafka;
import com.blo.jobtracker.config.EmbeddedRedis;
import com.blo.jobtracker.config.EmbeddedSQL;
import com.blo.jobtracker.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JobTrackerApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
