from centos

RUN cd /etc/yum.repos.d/
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-*
RUN sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*

#Install tools
RUN yum install -y java-1.8.0-openjdk

# Create application runtime folders
RUN mkdir -p /demoApp/runtime/bin

#Copy artifacts from dist to runtime folders 
ADD target/demoApp-*.jar /demoApp/runtime/bin