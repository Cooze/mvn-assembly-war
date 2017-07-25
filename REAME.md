## 该项目主要是为了在tomcat统一加载项目的依赖jar，项目打包时不打依赖包.
## tomcat的统一加载依赖需要修改tomcat的配置：
## tomcat家目录下的conf目录下的catalina.properties
## 在下面两个属性末尾追加公共jar包的路径即可
## common.loader="/xxxx","/xxxx/*.jar"
## shared.loader="/xxxx","/xxxx/*.jar"

## 如果想修改tomcat的类的加载顺序，则在tomcat配置文件context.xml添加<Loader delegate="true"/> 
## tomcat的类加载顺序请参考：http://tomcat.apache.org/tomcat-8.5-doc/class-loader-howto.html

## 根据环境运行打包命令：
## 1、开发环境打包：mvn clean package -Dmaven.test.skip=true -Pdev
## 2、生产环境打包：mvn clean package -Dmaven.test.skip=true -pProd
## 3、测试环境打包：mvn clean package -Dmaven.test.skip=true -ptest
