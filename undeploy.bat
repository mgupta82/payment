oc login -u developer -p developer

oc project payment

#oc delete all --selector app=persistencedb

oc delete all --selector app=persistance-api

oc delete all --selector app=TransformationService

oc delete all --selector app=ValidationService

oc delete all --selector app=activemq

oc delete all --selector app=routerdb

oc delete all --selector app=router-service

oc delete all --selector app=kafka

oc delete all --selector app=zookeeper

oc delete all --selector app=zipkin-host

oc delete  template apache-kafka

oc delete  template apache-zookeeper

oc delete project payment

