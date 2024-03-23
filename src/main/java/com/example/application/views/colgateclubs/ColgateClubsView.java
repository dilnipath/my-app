package com.example.application.views.colgateclubs;

import com.example.application.components.avataritem.AvatarItem;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@PageTitle("Colgate Clubs")
@Route(value = "my-view")
@Uses(Icon.class)
public class ColgateClubsView extends Composite<VerticalLayout> {

    public ColgateClubsView() {
        AvatarItem avatarItem = new AvatarItem();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H2 h2 = new H2();
        Hr hr = new Hr();
        H5 h5 = new H5();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        MessageList messageList = new MessageList();
        Tabs tabs = new Tabs();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        avatarItem.setWidth("100%");
        setAvatarItemSampleData(avatarItem);
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h2.setText("Welcome!");
        h2.setWidth("max-content");
        h5.setText("Upcoming Events");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, h5);
        h5.setWidth("max-content");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        messageList.setWidth("100%");
        setMessageListSampleData(messageList);
        tabs.setWidth("100%");
        setTabsSampleData(tabs);
        getContent().add(avatarItem);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h2);
        layoutColumn2.add(hr);
        layoutColumn2.add(h5);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(messageList);
        layoutColumn2.add(tabs);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }

    private void setMessageListSampleData(MessageList messageList) {
        MessageListItem message1 = new MessageListItem("Nature does not hurry, yet everything gets accomplished.",
                LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), "Matt Mambo");
        message1.setUserColorIndex(1);
        MessageListItem message2 = new MessageListItem(
                "Using your talent, hobby or profession in a way that makes you contribute with something good to this world is truly the way to go.",
                LocalDateTime.now().minusMinutes(55).toInstant(ZoneOffset.UTC), "Linsey Listy");
        message2.setUserColorIndex(2);
        messageList.setItems(message1, message2);
    }

    private void setTabsSampleData(Tabs tabs) {
        tabs.add(new Tab("Dashboard"));
        tabs.add(new Tab("Payment"));
        tabs.add(new Tab("Shipping"));
    }
}
