# ===== Etapa 1: Build con Maven =====
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiar pom.xml y código fuente
COPY pom.xml .
COPY src ./src

# Construir uber-jar de Quarkus
RUN mvn clean package -Dquarkus.package.type=uber-jar

# ===== Etapa 2: Imagen final ligera =====
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /work/

# Copiar el uber-jar generado en la etapa de build
COPY --from=build /app/target/*-runner.jar /work/app.jar

# Exponer el puerto que usa Quarkus
EXPOSE 8080

# Comando por defecto para ejecutar la app
CMD ["java", "-jar", "/work/app.jar"]