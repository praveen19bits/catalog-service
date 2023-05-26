# Build
docker_build('catalog-service', '.')
#custom_build(
    # Name of the container image
    #ref = 'catalog-service',
    # Command to build the container image
    #command = 'gradlew bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    #deps = ['build.gradle', 'src'],
    #skips_local_docker=True
#)



# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/postgresql.yml'])


# Manage
k8s_resource('catalog-service', port_forwards=['9001'])