# OpenTelemetry Card Service

A Spring Boot microservice demonstrating observability with OpenTelemetry, featuring distributed tracing, metrics, and logging.

## 🚀 Quick Start

```bash
# Build and start
./gradlew clean build jibDockerBuild
docker-compose up -d

# Test the service
curl http://localhost:8080/cards
```

## 📊 Services

| Service | Port | Description |
|---------|------|-------------|
| **Card Service** | 8080 | Main application |
| **Grafana** | 3000 | Unified dashboard (admin/admin) |
| **Jaeger** | 16686 | Distributed tracing |
| **Prometheus** | 9090 | Metrics storage |
| **PostgreSQL** | 5432 | Database |

## 🔍 Observability

- **Traces**: http://localhost:16686 (Jaeger)
- **Metrics**: http://localhost:9090 (Prometheus)  
- **Logs & Dashboards**: http://localhost:3000 (Grafana)

## 🛠️ Development

```bash
# Local development (PostgreSQL only)
docker-compose up postgres -d
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/opentelemetry \
java -javaagent:build/agent/opentelemetry-javaagent.jar \
     -jar build/libs/cardservice-0.0.2-SNAPSHOT.jar

# Run tests
./gradlew test
```

## 📈 Stack

- **App**: Spring Boot + JPA + PostgreSQL
- **Instrumentation**: OpenTelemetry Java Agent (zero-code)
- **Collection**: OpenTelemetry Collector
- **Storage**: Tempo (traces), Loki (logs), Prometheus (metrics)
- **UI**: Grafana, Jaeger, Zipkin

## 🎯 Features

- Automatic instrumentation (HTTP, DB, JVM)
- Distributed tracing across services
- Metrics collection and alerting
- Log aggregation and correlation
- Production-ready Docker setup
