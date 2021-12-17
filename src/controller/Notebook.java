package controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Model;
import view.View;

public class Notebook {
    private View view;
    private Model model;
    private UtilityController utilityController;

    private String name;
    private String surname;
    private String patronymic;
    private String shortInitials;
    private String nickName;
    private String homeNumber;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;
    private String index;
    private String town;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String homeAddress;
    private String dateOfCreation;

    public Notebook(Model model, View view, UtilityController utilityController) {
        this.view = view;
        this.model = model;
        this.utilityController = utilityController;
    }

    public void saveDataToModel() {
        saveInputData();
        model.setName(name);
        model.setSurname(surname);
        model.setPatronymic(patronymic);
        model.setShortInitials(shortInitials);
        model.setNickName(nickName);
        model.setHomeNumber(homeNumber);
        model.setMobileNumber1(mobileNumber1);
        model.setMobileNumber2(mobileNumber2);
        model.setEmail(email);
        model.setSkype(skype);
        model.setIndex(index);
        model.setTown(town);
        model.setStreet(street);
        model.setHouseNumber(houseNumber);
        model.setApartmentNumber(apartmentNumber);
        model.setHomeAddress(homeAddress);
        model.setDateOfCreation(dateOfCreation);
    }

    private void saveInputData() {
        inputNameSurnameAndPatronymic();
        createShortInitials();
        inputNicknameAndPhones();
        inputEmailAndSkype();
        inputHomeAddress();
        createHomeAddress();
        saveDateOfCreation();
    }

    private void inputNameSurnameAndPatronymic() {
        view.inputName();
        name = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputSurname();
        surname = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputPatronymic();
        patronymic = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NAME);
    }

    private void createShortInitials() {
        StringBuilder sb = new StringBuilder();
        char firstLetter = name.charAt(0);
        sb.append(surname)
                .append(" ")
                .append(firstLetter)
                .append(".");
        shortInitials = sb.toString();
    }

    private void inputNicknameAndPhones() {
        view.inputNickname();
        nickName = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NICKNAME);
        view.inputHomeNumber();
        homeNumber = utilityController.inputValueStringWithRegex(RegularExpressions.REG_HOME_NUMBER);
        view.inputMobileNumber1();
        mobileNumber1 = utilityController.inputValueStringWithRegex(RegularExpressions.REG_MOBILE_NUMBER1);
        view.inputMobileNumber2();
        mobileNumber2 = utilityController.inputValueStringWithRegex(RegularExpressions.REG_MOBILE_NUMBER2);
    }

    private void inputEmailAndSkype() {
        view.inputEmail();
        email = utilityController.inputValueStringWithRegex(RegularExpressions.REG_EMAIL);
        view.inputSkype();
        skype = utilityController.inputValueStringWithRegex(RegularExpressions.REG_SKYPE);
    }

    private void inputHomeAddress() {
        view.inputIndex();
        index = utilityController.inputValueStringWithRegex(RegularExpressions.REG_INDEX);
        view.inputTown();
        town = utilityController.inputValueStringWithRegex(RegularExpressions.REG_TOWN);
        view.inputStreet();
        street = utilityController.inputValueStringWithRegex(RegularExpressions.REG_STREET);
        view.inputHouseNumber();
        houseNumber = utilityController.inputValueStringWithRegex(RegularExpressions.REG_HOUSE_NUMBER);
        view.inputApartmentNumber();
        apartmentNumber = utilityController.inputValueStringWithRegex(RegularExpressions.REG_APARTMENT_NUMBER);
    }

    private void createHomeAddress() {
        StringBuilder sb = new StringBuilder();
        String coma = ", ";
        sb.append(index)
                .append(coma)
                .append(town)
                .append(coma)
                .append(street)
                .append(coma)
                .append(houseNumber)
                .append(coma)
                .append(apartmentNumber);
        homeAddress = sb.toString();
    }

    private void saveDateOfCreation() {
        Date date = new Date();
        String pattern = "dd.MM.yyyy hh:mm";
        SimpleDateFormat simpleDate = new SimpleDateFormat(pattern);
        dateOfCreation = simpleDate.format(date);
    }
}
