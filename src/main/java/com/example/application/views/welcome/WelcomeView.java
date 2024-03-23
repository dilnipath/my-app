package com.example.application.views.welcome;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Welcome!")
@Route(value = "my-view2")
@RouteAlias(value = "")
@Uses(Icon.class)
public class WelcomeView extends Composite<VerticalLayout> {

    public WelcomeView() {
        Button buttonSecondary = new Button();
        LoginForm loginForm = new LoginForm();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        buttonSecondary.setText("Welcome :)");
        buttonSecondary.setWidth("min-content");
        loginForm.setWidth("100%");
        getContent().add(buttonSecondary);
        getContent().add(loginForm);
    }
}
