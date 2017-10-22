#!/bin/bash

echo "--------------------------------------------------------------------------"
echo "--------------------------------------------------------------------------"
echo "---------                  Micro Projet EJB                    -----------"
echo "--------------------------------------------------------------------------"
echo "--------------------------------------------------------------------------"

sleep 4
clear

echo "---------                1 - Clean Install                      -----------"
mvn clean install

echo "---------                Fin de l'etape 1                       -----------"

sleep 4 
clear

echo "---------                2 - Deployement                      -----------"

asadmin start-domain
sleep 2

asadmin start-database
sleep 2
asadmin undeploy entity-bean.jar
sleep 2
asadmin deploy ServerBean/target/entity-bean.jar
sleep 4
clear
echo "---------                Fin de l'etape 2                       -----------"
sleep 2
echo "---------                3 - Test                      -----------"
 cd ClientBean
 java -classpath $CLASSPATH:../ServerBean/target/entity-bean.jar:target/ClientBean-4.0-SNAPSHOT.jar enterprise/StatelessJavaClient
cd ..
echo "---------                Fin de l'etape 3                      -----------"

