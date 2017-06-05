# 该项目主要是为了在tomcat统一加载项目的依赖jar，项目打包时不打依赖包.
# tomcat的统一加载依赖需要修改tomcat的配置：
# tomcat家目录下的conf目录下的catalina.properties
# 在下面两个属性末尾追加公共jar包的路径即可
# common.loader="/xxxx","/xxxx/*.jar"
# shared.loader="/xxxx","/xxxx/*.jar"
