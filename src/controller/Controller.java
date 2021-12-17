package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        Notebook Notebook = new Notebook(model, view, new UtilityController(view, scanner));

        Notebook.saveDataToModel();
    }
}
