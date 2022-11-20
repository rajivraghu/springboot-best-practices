package com.javatechie.service;

public abstract class QueryService<ENTITY> {
  
    public QueryService() {
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> buildSpecification(com.javatechie.service.Filter<X> filter, javax.persistence.metamodel.SingularAttribute<? super ENTITY,X> field) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> buildSpecification(com.javatechie.service.Filter<X> filter, java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction) {
      return null;
    }
    
    protected  org.springframework.data.jpa.domain.Specification<ENTITY> buildStringSpecification(com.javatechie.service.StringFilter filter, javax.persistence.metamodel.SingularAttribute<? super ENTITY,java.lang.String> field) {
      return null;
    }
    
    protected  org.springframework.data.jpa.domain.Specification<ENTITY> buildSpecification(com.javatechie.service.StringFilter filter, java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<java.lang.String>> metaclassFunction) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> buildRangeSpecification(com.javatechie.service.RangeFilter<X> filter, javax.persistence.metamodel.SingularAttribute<? super ENTITY,X> field) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> buildSpecification(com.javatechie.service.RangeFilter<X> filter, java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction) {
      return null;
    }
    
    protected <OTHER,X> org.springframework.data.jpa.domain.Specification<ENTITY> buildReferringEntitySpecification(com.javatechie.service.Filter<X> filter, javax.persistence.metamodel.SingularAttribute<? super ENTITY,OTHER> reference, javax.persistence.metamodel.SingularAttribute<? super OTHER,X> valueField) {
      return null;
    }
    
    protected <OTHER,X> org.springframework.data.jpa.domain.Specification<ENTITY> buildReferringEntitySpecification(com.javatechie.service.Filter<X> filter, javax.persistence.metamodel.SetAttribute<ENTITY,OTHER> reference, javax.persistence.metamodel.SingularAttribute<OTHER,X> valueField) {
      return null;
    }
    
    protected <OTHER,MISC,X> org.springframework.data.jpa.domain.Specification<ENTITY> buildReferringEntitySpecification(com.javatechie.service.Filter<X> filter, java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.SetJoin<MISC,OTHER>> functionToEntity, java.util.function.Function<javax.persistence.criteria.SetJoin<MISC,OTHER>,javax.persistence.criteria.Expression<X>> entityToColumn) {
      return null;
    }
    
    protected <OTHER,X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> buildReferringEntitySpecification(com.javatechie.service.RangeFilter<X> filter, javax.persistence.metamodel.SetAttribute<ENTITY,OTHER> reference, javax.persistence.metamodel.SingularAttribute<OTHER,X> valueField) {
      return null;
    }
    
    protected <OTHER,MISC,X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> buildReferringEntitySpecification(com.javatechie.service.RangeFilter<X> filter, java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.SetJoin<MISC,OTHER>> functionToEntity, java.util.function.Function<javax.persistence.criteria.SetJoin<MISC,OTHER>,javax.persistence.criteria.Expression<X>> entityToColumn) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> equalsSpecification(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> notEqualsSpecification(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected  org.springframework.data.jpa.domain.Specification<ENTITY> likeUpperSpecification(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<java.lang.String>> metaclassFunction, java.lang.String value) {
      return null;
    }
    
    protected  org.springframework.data.jpa.domain.Specification<ENTITY> doesNotContainSpecification(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<java.lang.String>> metaclassFunction, java.lang.String value) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> byFieldSpecified(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, boolean specified) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> byFieldEmptiness(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<java.util.Set<X>>> metaclassFunction, boolean specified) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> valueIn(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, java.util.Collection<X> values) {
      return null;
    }
    
    protected <X> org.springframework.data.jpa.domain.Specification<ENTITY> valueNotIn(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, java.util.Collection<X> values) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> greaterThanOrEqualTo(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> greaterThan(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> lessThanOrEqualTo(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected <X extends java.lang.Comparable<? super X>> org.springframework.data.jpa.domain.Specification<ENTITY> lessThan(java.util.function.Function<javax.persistence.criteria.Root<ENTITY>,javax.persistence.criteria.Expression<X>> metaclassFunction, X value) {
      return null;
    }
    
    protected java.lang.String wrapLikeQuery(java.lang.String txt) {
      return null;
    }
    
    protected  org.springframework.data.jpa.domain.Specification<ENTITY> distinct(boolean distinct) {
      return null;
    }
    
    private static java.lang.Object $deserializeLambda$(java.lang.invoke.SerializedLambda lambda) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$distinct$a8b32b43$1(boolean distinct, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder cb) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$lessThan$678a7156$1(java.util.function.Function metaclassFunction, java.lang.Comparable value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$lessThanOrEqualTo$678a7156$1(java.util.function.Function metaclassFunction, java.lang.Comparable value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$greaterThan$678a7156$1(java.util.function.Function metaclassFunction, java.lang.Comparable value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$greaterThanOrEqualTo$678a7156$1(java.util.function.Function metaclassFunction, java.lang.Comparable value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$valueNotIn$fb805364$1(java.util.function.Function metaclassFunction, java.util.Collection values, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$valueIn$fb805364$1(java.util.function.Function metaclassFunction, java.util.Collection values, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$byFieldEmptiness$42e918dc$2(java.util.function.Function metaclassFunction, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$byFieldEmptiness$42e918dc$1(java.util.function.Function metaclassFunction, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$byFieldSpecified$c13ce960$2(java.util.function.Function metaclassFunction, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$byFieldSpecified$c13ce960$1(java.util.function.Function metaclassFunction, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private javax.persistence.criteria.Predicate lambda$doesNotContainSpecification$b712b905$1(java.util.function.Function metaclassFunction, java.lang.String value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private javax.persistence.criteria.Predicate lambda$likeUpperSpecification$b712b905$1(java.util.function.Function metaclassFunction, java.lang.String value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$notEqualsSpecification$2fbfe461$1(java.util.function.Function metaclassFunction, java.lang.Object value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Predicate lambda$equalsSpecification$2fbfe461$1(java.util.function.Function metaclassFunction, java.lang.Object value, javax.persistence.criteria.Root root, javax.persistence.criteria.CriteriaQuery query, javax.persistence.criteria.CriteriaBuilder builder) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildReferringEntitySpecification$7(javax.persistence.metamodel.SingularAttribute valueField, javax.persistence.criteria.SetJoin entity) {
      return null;
    }
    
    private static javax.persistence.criteria.SetJoin lambda$buildReferringEntitySpecification$6(javax.persistence.metamodel.SetAttribute reference, javax.persistence.criteria.Root root) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildReferringEntitySpecification$5(javax.persistence.metamodel.SingularAttribute valueField, javax.persistence.criteria.SetJoin entity) {
      return null;
    }
    
    private static javax.persistence.criteria.SetJoin lambda$buildReferringEntitySpecification$4(javax.persistence.metamodel.SetAttribute reference, javax.persistence.criteria.Root root) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildReferringEntitySpecification$3(javax.persistence.metamodel.SingularAttribute reference, javax.persistence.metamodel.SingularAttribute valueField, javax.persistence.criteria.Root root) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildRangeSpecification$2(javax.persistence.metamodel.SingularAttribute field, javax.persistence.criteria.Root root) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildStringSpecification$1(javax.persistence.metamodel.SingularAttribute field, javax.persistence.criteria.Root root) {
      return null;
    }
    
    private static javax.persistence.criteria.Expression lambda$buildSpecification$0(javax.persistence.metamodel.SingularAttribute field, javax.persistence.criteria.Root root) {
      return null;
    }
  }