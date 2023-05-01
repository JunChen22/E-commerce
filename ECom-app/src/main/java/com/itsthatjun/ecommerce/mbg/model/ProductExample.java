package com.itsthatjun.ecommerce.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(BigDecimal value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(BigDecimal value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(BigDecimal value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(BigDecimal value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<BigDecimal> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<BigDecimal> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(BigDecimal value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(BigDecimal value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<BigDecimal> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdIsNull() {
            addCriterion("attribute_category_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdIsNotNull() {
            addCriterion("attribute_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdEqualTo(BigDecimal value) {
            addCriterion("attribute_category_id =", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("attribute_category_id <>", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("attribute_category_id >", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_category_id >=", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdLessThan(BigDecimal value) {
            addCriterion("attribute_category_id <", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_category_id <=", value, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdIn(List<BigDecimal> values) {
            addCriterion("attribute_category_id in", values, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("attribute_category_id not in", values, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_category_id between", value1, value2, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_category_id not between", value1, value2, "attributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(BigDecimal value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(BigDecimal value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(BigDecimal value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(BigDecimal value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<BigDecimal> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<BigDecimal> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(BigDecimal value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(BigDecimal value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(BigDecimal value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(BigDecimal value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<BigDecimal> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<BigDecimal> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(BigDecimal value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(BigDecimal value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(BigDecimal value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(BigDecimal value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<BigDecimal> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<BigDecimal> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNull() {
            addCriterion("new_status is null");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNotNull() {
            addCriterion("new_status is not null");
            return (Criteria) this;
        }

        public Criteria andNewStatusEqualTo(BigDecimal value) {
            addCriterion("new_status =", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotEqualTo(BigDecimal value) {
            addCriterion("new_status <>", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThan(BigDecimal value) {
            addCriterion("new_status >", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_status >=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThan(BigDecimal value) {
            addCriterion("new_status <", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_status <=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIn(List<BigDecimal> values) {
            addCriterion("new_status in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotIn(List<BigDecimal> values) {
            addCriterion("new_status not in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_status between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_status not between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNull() {
            addCriterion("recommend_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNotNull() {
            addCriterion("recommend_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusEqualTo(BigDecimal value) {
            addCriterion("recommend_status =", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotEqualTo(BigDecimal value) {
            addCriterion("recommend_status <>", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThan(BigDecimal value) {
            addCriterion("recommend_status >", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_status >=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThan(BigDecimal value) {
            addCriterion("recommend_status <", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_status <=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIn(List<BigDecimal> values) {
            addCriterion("recommend_status in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotIn(List<BigDecimal> values) {
            addCriterion("recommend_status not in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_status between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_status not between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(BigDecimal value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(BigDecimal value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(BigDecimal value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(BigDecimal value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<BigDecimal> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<BigDecimal> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(BigDecimal value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIsNull() {
            addCriterion("on_sale_status is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIsNotNull() {
            addCriterion("on_sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusEqualTo(BigDecimal value) {
            addCriterion("on_sale_status =", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotEqualTo(BigDecimal value) {
            addCriterion("on_sale_status <>", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusGreaterThan(BigDecimal value) {
            addCriterion("on_sale_status >", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("on_sale_status >=", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusLessThan(BigDecimal value) {
            addCriterion("on_sale_status <", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("on_sale_status <=", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIn(List<BigDecimal> values) {
            addCriterion("on_sale_status in", values, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotIn(List<BigDecimal> values) {
            addCriterion("on_sale_status not in", values, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("on_sale_status between", value1, value2, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("on_sale_status not between", value1, value2, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(BigDecimal value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(BigDecimal value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(BigDecimal value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(BigDecimal value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<BigDecimal> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<BigDecimal> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNull() {
            addCriterion("low_stock is null");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNotNull() {
            addCriterion("low_stock is not null");
            return (Criteria) this;
        }

        public Criteria andLowStockEqualTo(BigDecimal value) {
            addCriterion("low_stock =", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotEqualTo(BigDecimal value) {
            addCriterion("low_stock <>", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThan(BigDecimal value) {
            addCriterion("low_stock >", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_stock >=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThan(BigDecimal value) {
            addCriterion("low_stock <", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_stock <=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockIn(List<BigDecimal> values) {
            addCriterion("low_stock in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotIn(List<BigDecimal> values) {
            addCriterion("low_stock not in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_stock between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_stock not between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNull() {
            addCriterion("promotion_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNotNull() {
            addCriterion("promotion_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_start_time =", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_start_time <>", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("promotion_start_time >", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_start_time >=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("promotion_start_time <", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_start_time <=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("promotion_start_time in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("promotion_start_time not in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promotion_start_time between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promotion_start_time not between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNull() {
            addCriterion("promotion_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNotNull() {
            addCriterion("promotion_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_end_time =", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_end_time <>", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("promotion_end_time >", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_end_time >=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("promotion_end_time <", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promotion_end_time <=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("promotion_end_time in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("promotion_end_time not in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promotion_end_time between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promotion_end_time not between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIsNull() {
            addCriterion("promotion_per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIsNotNull() {
            addCriterion("promotion_per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitEqualTo(BigDecimal value) {
            addCriterion("promotion_per_limit =", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotEqualTo(BigDecimal value) {
            addCriterion("promotion_per_limit <>", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitGreaterThan(BigDecimal value) {
            addCriterion("promotion_per_limit >", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_per_limit >=", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitLessThan(BigDecimal value) {
            addCriterion("promotion_per_limit <", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_per_limit <=", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIn(List<BigDecimal> values) {
            addCriterion("promotion_per_limit in", values, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotIn(List<BigDecimal> values) {
            addCriterion("promotion_per_limit not in", values, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_per_limit between", value1, value2, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_per_limit not between", value1, value2, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(BigDecimal value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(BigDecimal value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(BigDecimal value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(BigDecimal value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<BigDecimal> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<BigDecimal> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumIsNull() {
            addCriterion("description_album is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumIsNotNull() {
            addCriterion("description_album is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumEqualTo(String value) {
            addCriterion("description_album =", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumNotEqualTo(String value) {
            addCriterion("description_album <>", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumGreaterThan(String value) {
            addCriterion("description_album >", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumGreaterThanOrEqualTo(String value) {
            addCriterion("description_album >=", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumLessThan(String value) {
            addCriterion("description_album <", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumLessThanOrEqualTo(String value) {
            addCriterion("description_album <=", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumLike(String value) {
            addCriterion("description_album like", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumNotLike(String value) {
            addCriterion("description_album not like", value, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumIn(List<String> values) {
            addCriterion("description_album in", values, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumNotIn(List<String> values) {
            addCriterion("description_album not in", values, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumBetween(String value1, String value2) {
            addCriterion("description_album between", value1, value2, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andDescriptionAlbumNotBetween(String value1, String value2) {
            addCriterion("description_album not between", value1, value2, "descriptionAlbum");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIsNull() {
            addCriterion("album_pics is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIsNotNull() {
            addCriterion("album_pics is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsEqualTo(String value) {
            addCriterion("album_pics =", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotEqualTo(String value) {
            addCriterion("album_pics <>", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsGreaterThan(String value) {
            addCriterion("album_pics >", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsGreaterThanOrEqualTo(String value) {
            addCriterion("album_pics >=", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLessThan(String value) {
            addCriterion("album_pics <", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLessThanOrEqualTo(String value) {
            addCriterion("album_pics <=", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLike(String value) {
            addCriterion("album_pics like", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotLike(String value) {
            addCriterion("album_pics not like", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIn(List<String> values) {
            addCriterion("album_pics in", values, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotIn(List<String> values) {
            addCriterion("album_pics not in", values, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsBetween(String value1, String value2) {
            addCriterion("album_pics between", value1, value2, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotBetween(String value1, String value2) {
            addCriterion("album_pics not between", value1, value2, "albumPics");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNull() {
            addCriterion("detail_title is null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNotNull() {
            addCriterion("detail_title is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleEqualTo(String value) {
            addCriterion("detail_title =", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotEqualTo(String value) {
            addCriterion("detail_title <>", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThan(String value) {
            addCriterion("detail_title >", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("detail_title >=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThan(String value) {
            addCriterion("detail_title <", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThanOrEqualTo(String value) {
            addCriterion("detail_title <=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLike(String value) {
            addCriterion("detail_title like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotLike(String value) {
            addCriterion("detail_title not like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIn(List<String> values) {
            addCriterion("detail_title in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotIn(List<String> values) {
            addCriterion("detail_title not in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleBetween(String value1, String value2) {
            addCriterion("detail_title between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotBetween(String value1, String value2) {
            addCriterion("detail_title not between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNull() {
            addCriterion("detail_desc is null");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNotNull() {
            addCriterion("detail_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDescEqualTo(String value) {
            addCriterion("detail_desc =", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotEqualTo(String value) {
            addCriterion("detail_desc <>", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThan(String value) {
            addCriterion("detail_desc >", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThanOrEqualTo(String value) {
            addCriterion("detail_desc >=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThan(String value) {
            addCriterion("detail_desc <", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThanOrEqualTo(String value) {
            addCriterion("detail_desc <=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLike(String value) {
            addCriterion("detail_desc like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotLike(String value) {
            addCriterion("detail_desc not like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescIn(List<String> values) {
            addCriterion("detail_desc in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotIn(List<String> values) {
            addCriterion("detail_desc not in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescBetween(String value1, String value2) {
            addCriterion("detail_desc between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotBetween(String value1, String value2) {
            addCriterion("detail_desc not between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}