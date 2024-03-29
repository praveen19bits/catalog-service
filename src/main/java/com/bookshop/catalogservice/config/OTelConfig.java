package com.bookshop.catalogservice.config;



import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OTelConfig {
    @Bean
    OtlpHttpSpanExporter exporter(@Value("${tracing.url}") String url){
        return OtlpHttpSpanExporter.builder().setEndpoint(url).build();
    }
}

