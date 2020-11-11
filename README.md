# SpringBoot-starter-custom

@SpringBootApplication 中包含三个注解。
- @SpringBootConfiguration
- @CompoentScan
- @EnableAutoConfiguration
@EnableAutoConfiguration 表示启用spring应用上下文的自动配置。该注解会自动导入一个叫 AutoConfigurationImportSelector 的类，该类会去META-INF文件夹下读取 spring.factories文件。spring.factories文件定义了需要加载的自动化配置类。

## SpringBoot实现自动化配置的核心是条件注解
  @ConditionalOnClass(xxx.class) : 表示在当前项目的类路径下存在xxx类时，后面的配置才会生效。
