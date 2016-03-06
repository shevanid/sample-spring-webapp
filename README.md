** Sample Pring Web Application

This application uses following dependencies

- javax.servlet-api (provided) as it will be a war deployed in Tomcat container
- spring-context
- spring-webmvc

We have used spring 4.1.5.RELEASE

Other features in this package include

- Annotation based AppConfig
- Annotation based ServletInitializer
- Annotation based Controller

We have used maven-war-plugin to create the war ti be deployed in Tomcat

With Tomcat 7, we can create symlinks to folders outside webapps and it will be refreshed automatically with change

sudo ln -s ~/architecture/springwebapp/target/springwebapp.war /Library/Tomcat/webapps/springwebapp.war

!/Library/Tomcat master!» sudo ./bin/catalina.sh run


