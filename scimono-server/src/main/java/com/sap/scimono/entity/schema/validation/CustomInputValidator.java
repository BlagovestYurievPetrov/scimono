
package com.sap.scimono.entity.schema.validation;

@FunctionalInterface
public interface CustomInputValidator {
  enum Type {
    RESOURCE_ID, USER_ID, GROUP_ID, EMAILS
  }

  boolean isValid(Object validatebleObject);
}