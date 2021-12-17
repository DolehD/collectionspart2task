package controller;

public interface RegularExpressions {
    String REG_NAME = "^[A-Z]{1}[a-z]{1,15}$";
    String REG_NICKNAME = "^.{1,15}$";
    String REG_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REG_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REG_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    String REG_INDEX = "^[\\d]{5}$";
    String REG_TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    String REG_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    String REG_APARTMENT_NUMBER = "^[\\d]{1,3}";
}
