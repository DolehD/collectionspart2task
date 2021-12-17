package view;

public class View {
    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showWrongInput() {
        showMessage(StringConstants.WRONG_INPUT_DATA);
    }

    public void inputName() { showMessage(StringConstants.INPUT_NAME); }

    public void inputSurname() { showMessage(StringConstants.INPUT_SURNAME); }

    public void inputPatronymic() {
        showMessage(StringConstants.INPUT_PATRONYMIC);
    }

    public void inputNickname() {
        showMessage(StringConstants.INPUT_NICKNAME);
    }

    public void inputHomeNumber() {
        showMessage(StringConstants.INPUT_HOME_NUMBER);
    }

    public void inputMobileNumber1() {
        showMessage(StringConstants.INPUT_MOBILE_NUMBER1);
    }

    public void inputMobileNumber2() {
        showMessage(StringConstants.INPUT_MOBILE_NUMBER2);
    }

    public void inputEmail() {
        showMessage(StringConstants.INPUT_EMAIL);
    }

    public void inputSkype() {
        showMessage(StringConstants.INPUT_SKYPE);
    }

    public void inputIndex() {
        showMessage(StringConstants.INPUT_INDEX);
    }

    public void inputTown() {
        showMessage(StringConstants.INPUT_TOWN);
    }

    public void inputStreet() {
        showMessage(StringConstants.INPUT_STREET);
    }

    public void inputHouseNumber() {
        showMessage(StringConstants.INPUT_HOUSE_NUMBER);
    }

    public void inputApartmentNumber() {
        showMessage(StringConstants.INPUT_APARTMENT_NUMBER);
    }
}
