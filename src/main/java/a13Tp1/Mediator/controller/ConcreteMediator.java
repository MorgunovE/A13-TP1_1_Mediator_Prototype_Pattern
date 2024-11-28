package a13Tp1.Mediator.controller;

import a13Tp1.Mediator.view.Component;
import a13Tp1.Mediator.view.AuthenticationDialog;

public class ConcreteMediator implements Mediator {


    public ConcreteMediator(AuthenticationDialog dialog) {}

    @Override
    public void notify(Component sender, String event, Object... args) {

    }
}
