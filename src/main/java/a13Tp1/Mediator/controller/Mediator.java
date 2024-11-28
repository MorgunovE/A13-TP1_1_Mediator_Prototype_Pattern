package a13Tp1.Mediator.controller;

import a13Tp1.Mediator.view.Component;

public interface Mediator {
    void notify(Component sender, String event);
}
