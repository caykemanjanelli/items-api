#!/bin/bash

oc project "$KUBE_NAMESPACE"

echo ">> Change project variables..."
ls openshift/[0-9]*.yaml | xargs sed -i "s/KUBE_NAMESPACE/$KUBE_NAMESPACE/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/CLUSTER/$CLUSTER/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s@DOCKER_ENV_CI_REGISTRY_IMAGE@$CI_REGISTRY_IMAGE@g" # Utilizado @ no separador pois o conteudo da variavel tem /
ls openshift/[0-9]*.yaml | xargs sed -i "s/CI_PROJECT_NAME/$CI_PROJECT_NAME/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/CI_REGISTRY/$CI_REGISTRY/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/CI_BUILD_TAG/$1/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/CI_ENVIRONMENT_SLUG/$CI_ENVIRONMENT_SLUG/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/CI_PROJECT_PATH_SLUG/$CI_PROJECT_PATH_SLUG/g"

ls openshift/[0-9]*.yaml | xargs sed -i "s/REQUEST_CPU/$REQUEST_CPU/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/REQUEST_MEMORY/$REQUEST_MEMORY/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/LIMITS_CPU/$LIMITS_CPU/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/LIMITS_MEMORY/$LIMITS_MEMORY/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/READINESS_INITIAL_DELAY/$READINESS_INITIAL_DELAY/g"
ls openshift/[0-9]*.yaml | xargs sed -i "s/LIVENESS_INITIAL_DELAY/$LIVENESS_INITIAL_DELAY/g"

ls openshift/[0-9]*.yaml | xargs sed -i "s/MAINTAINERS_TEAM/$MAINTAINERS_TEAM/g"


IMAGE_TAG="$CI_REGISTRY_IMAGE:$CI_BUILD_REF_NAME"

echo ">> Deleting old application..."
oc get deploy $CI_PROJECT_NAME && oc delete deploy $CI_PROJECT_NAME || echo "First Deploy"
oc get secret $CI_PROJECT_NAME && oc delete secret $CI_PROJECT_NAME || echo "No Secrets found"

echo ">> Deploying image $IMAGE_TAG to env $ENV at $HOSTNAME..."
ls openshift/[0-9]*.yaml | xargs printf -- "-f %s\n" | xargs oc apply
oc create secret generic $CI_PROJECT_NAME --from-file=application.yml=$APPLICATION

echo ">> Deployed to $CI_ENVIRONMENT_URL"
