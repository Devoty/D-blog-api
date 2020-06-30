package top.devoty.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;


/**
 * 将TINYINT数据类型映射为Integer.class
 */
public class JavaTypeResolverImplUtil extends JavaTypeResolverDefaultImpl{

    public JavaTypeResolverImplUtil(){
        super();
        super.typeMap.put(-6, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}