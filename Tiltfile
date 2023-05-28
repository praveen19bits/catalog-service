# Build
#docker_build('catalog-service', '.')
custom_build(
    ref = 'catalog-service',
    command = 'gradlew bootBuildImage --imageName %EXPECTED_REF%',
    deps = ['build.gradle', 'src']
)


# Deploy
k8s_yaml(['k8s/deployment.yml'])


# Manage
k8s_resource('catalog-service', port_forwards=['9001'])