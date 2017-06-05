package org.cooze.mvn.assembly.war.common.utils;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;
import ma.glasnost.orika.metadata.TypeFactory;

import java.util.List;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public final class BeanUtil {
    private BeanUtil() {
    }

    private static MapperFacade facade;

    public static <S, D> D map(S source, Class<D> destinationClass) {
        return facade.map(source, destinationClass);
    }

    public static <S, D> D map(S source, Type<S> sourceType, Type<D> destinationType) {
        return facade.map(source, sourceType, destinationType);
    }

    public static <S, D> List<D> mapList(Iterable<S> sourceList, Class<S> sourceClass, Class<D> destinationClass) {
        return facade.mapAsList(sourceList, TypeFactory.valueOf(sourceClass), TypeFactory.valueOf(destinationClass));
    }

    public static <S, D> List<D> mapList(Iterable<S> sourceList, Type<S> sourceType, Type<D> destinationType) {
        return facade.mapAsList(sourceList, sourceType, destinationType);
    }

    public static <S, D> D[] mapArray(D[] destination, S[] source, Class<D> destinationClass) {
        return facade.mapAsArray(destination, source, destinationClass);
    }

    public static <S, D> D[] mapArray(D[] destination, S[] source, Type<S> sourceType, Type<D> destinationType) {
        return facade.mapAsArray(destination, source, sourceType, destinationType);
    }

    public static <E> Type<E> getType(Class<E> rawType) {
        return TypeFactory.valueOf(rawType);
    }

    static {
        DefaultMapperFactory mapperFactory = (new DefaultMapperFactory.Builder()).build();
        facade = mapperFactory.getMapperFacade();
    }
}
