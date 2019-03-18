#springboot 读取配置系统变量中的配置

springboot 会读取 系统中的环境变量，默认级别会比配置文件高
读取配置的格式是所有字母转大写 ，点转为"_"
比如"JAVA_HOME" 转为java.home

这个配置应该方式，适合docker和k8s