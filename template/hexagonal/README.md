# Arquetipo Definition
> Generacion nombre base.

## Funtionality
> Traicing with Xray
> Standarized logs
    > Logback Slf4j
    > 


##Standards programacion.
> JUnit.
> Repositorios Mockito.
> Mocks


# for generate archetipe.

mvn archetype:create-from-project

# Install Maven
cd target/generated-sources/archetype/
mvn clean install -DskipTests


¿How can generate template?

#Old archetype
mvn archetype:generate \
-Dfilter=com.bancocuscatlan:bancus-template \
-DarchetypeVersion=1.0.0 \
-DgroupId=com.bancus.restful \
-DartifactId=cool-jaxrs-sample \
-Dversion=1.0-SNAPSHOT

#New Archetype
mvn archetype:generate \
-Dfilter=com.bancocuscatlan.template:bancus-template-rest-archetype \
-DarchetypeGroupId=com.bancocuscatlan.template \
-DarchetypeArtifactId=bancus-template-rest-archetype \
-DarchetypeVersion=1.0.1 \
-DgroupId=com.bancus.restful.app \
-DartifactId=sample-service-app2 \
-Dversion=1.0.0-SNAPSHOT \
-Dinteractive=false \
-B

